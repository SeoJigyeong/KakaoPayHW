##  카카오페이 멤버십 서비스 구현하기
##  개발 환경
* 프레임워크 : springframework 4.3.3.RELEASE 
* 빌드툴 : maven 
* DB : mysql 8.0.20 
* Persistence 프레임워크 : Mybatis 3.4.1
* 테스트툴 : JUnit4

##  1. 서비스 설명
* 카카오페이에는 멤버십 서비스가 있습니다. 해당 서비스를 만들어봅시다.

* 멤버십은 사용자 별로 하나의 멤버십 바코드를 발급하고 있습니다.
* 상점에서 포인트 적립 또는 사용을 할 수 있습니다.
* 상점은 상점명과 하나의 업종 정보를 가지고 있습니다.
* 같은 업종의 가맹점들은 적립된 포인트를 같이 쓸 수 있습니다.
* 업종정보는 다음과 같이 3가지가 존재합니다. (A: 식품, B : 화장품, C : 식당)
* 하나의 상점은 하나의 업종 정보만 가지고 있고 변경 될수 없습니다.
* 사용자 탈퇴는 없으며, 발급된 바코드는 계속 유효합니다
* 발급된 멤버십바코드는 가족이나 친구끼리 공유가 가능합니다

##  2. 설계 내용 및 설명
# 2) 데이터 모델링

  기본적으로 데이터 정합성을 위해 모든 테이블의 컬럼을 not null로 설정.

  not null 조건은 현실 상황과 무관하게 서비스 설명에 따른 매핑을 고려함.

  도메인별 TB을 설계하여 데이터 응집도를 높임.

  포인트 내역 대량 데이터 적재로 인한 성능 저하 고려해 pointTB을 Master로 최종 포인트 점수로 관리하는데 활용.

 # 테이블 목록 
 ```
 mbrshp (회원) 
 partner (상점TB) 
 point (포인트) 
 pointh (포인트 이력)
 ```
 # mbrshp 테이블 설계

  CREATE TABLE MBRSHP ( MBRSHP_BRCD_ID VARCHAR(10) NOT NULL, USER_ID INT NOT NULL, FRST_CREAT_TIMESTAMP TIMESTAMP NOT NULL, LAST_CHNG_TIMESTAMP TIMESTAMP NOT NULL, primary key(MBRSHP_BRCD_ID) );

#  partner 테이블 설계

  CREATE TABLE PARTNER ( PARTNER_ID VARCHAR(10) NOT NULL, PARTNER_NM VARCHAR(100) NOT NULL, PARTNER_CATEGORY VARCHAR(1) NOT NULL, FRST_CREAT_TIMESTAMP TIMESTAMP NOT NULL, LAST_CHNG_TIMESTAMP TIMESTAMP NOT NULL, primary key(PARTNER_ID) );

#  point 테이블 설계

  CREATE TABLE POINT ( MBRSHP_BRCD_ID VARCHAR(10) NOT NULL, PARTNER_CATEGORY VARCHAR(1) NOT NULL, PARTNER_ID VARCHAR(10) NOT NULL, LAST_POINT_SCORE INT NOT NULL, FRST_CREAT_TIMESTAMP TIMESTAMP NOT NULL, LAST_CHNG_TIMESTAMP TIMESTAMP NOT NULL, primary key(MBRSHP_BRCD_ID, PARTNER_CATEGORY) );

#  pointh 테이블 설계

  CREATE TABLE POINTH ( MBRSHP_BRCD_ID VARCHAR(10) NOT NULL, HIST_SEQ_NBR INT NOT NULL, PARTNER_CATEGORY VARCHAR(1) NOT NULL, APPROVED_DT VARCHAR(8) NOT NULL, PARTNER_ID VARCHAR(10) NOT NULL, POINT_USE_TYPE VARCHAR(4) NOT NULL, POINT_SCORE INT NOT NULL, FRST_CREAT_TIMESTAMP TIMESTAMP NOT NULL, LAST_CHNG_TIMESTAMP TIMESTAMP NOT NULL, primary key(MBRSHP_BRCD_ID, PARTNER_CATEGORY, HIST_SEQ_NBR) );

##  3. API 설계
# 1) 컨트롤러(C)
  컨트롤러는 서비스 성격 3가지(멤버십 바코드 발급, 포인트 관리, 내역조회)로 분리. 
  포인트 적립과 사용은 성격이 유사하여 하나의 컨트롤러에서 관리.
  
# 2) 서비스(Biz)
  컨트롤러 메서드의 각 메인 기능을 하는 서비스와 인터페이스 구현.
  2_1) 바코드 멤버십 발급시
  * UserId로 유저별 Unique한 키값으로,
  * SecureRandom으로 난수 생성하여 예측불가능한 보안코드를 처리.
  보안 관리
  
  2_2)포인트 적립,사용
  저장 및 수정, 포인트 점수 계산 등 공통Biz로직 모듈화가 적용된 서비스.
  포인트 적립과 사용은 mbrshpPointMngmtService.saveMbrshpPoint로 
  동일 클래스, 동일 메서드를 재사용함.

  3) 내역관리
  대량 데이터를 조회하게 되는 서비스로, 
  테이블 설계에 따라 회원별 업종별 이력 쌓고 있음. 
  대량 건이어서 페이징을 넣어야 할 것 같았지만 구현 시간이 촉박하여 못함. 

# 3) 도에인, dto(M)
  도메인과 dto를 따로 구성하여 DB Layer와 View Layer 분리

##  4. API 응답 모음
#  1) 응답 공통
#  응답 구성

| Code  | Description          |
| ----- | ---------------------|
|resultCode	|응답 코드|
|resultMessage	|응답 메세지|
|resultType	|응답 타입|

```
// 오류 응답 예시
{
"resultCode": "100",
"resultMessage": "등록된 상점이 아닙니다.",
"resultType": "ERROR"
}
// 정상 응답 예시
 {
 "resultCode": "000",
 "resultMessage": "정상적으로 처리되었습니다.",
 "resultType" : "SUCCESS"
 }
 ```
## 에러 코드 종류
| Code  | Description          |
| ----- | ---------------------|
|100	   |등록된 상점이 아닙니다.|
|200	   |등록된 멤버십 바코드가 아닙니다.|
|300	   |입력값이 존재하지 않습니다.|
|400	   |필수입력값이 존재하지 않습니다.|
|500	   |포인트 사용구분값이 없어 포인트 계산이 불가합니다.|
|600	   |사용 포인트 점수가 부족합니다.|
|700    |유효하지 않은 입력값입니다.|
