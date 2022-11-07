package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dto.MemberVO;

@Repository
public class UserMDaoImpl implements MbrshpMDao {
	// MemberDao를 구현한 MemberDaoImpl 클래스
	
	@Autowired
	private SqlSession sqlSession;
	// SqlSession이라는 객체를 속성으로 갖는다
	private static final String Namespace = "mappers.mbrshpMMapper";
	// Namespace 값을 스트링변수에 대입한다
	
	@Override
	public List<MemberVO> selectMember() throws Exception {
		// MemberDaoImpl의 메서드를 오버라이딩한다
		
		return sqlSession.selectList(Namespace+".select");
		// sqlSession메서드를 이용해 memberMapper에서 select 경로 리턴한다
	}
	
	@Override
	public void insertMember(MemberVO vo) throws Exception {
		// MemberDaoImpl의 메서드를 오버라이딩한다
		
		sqlSession.insert(Namespace+".insert", vo);
	}

}
