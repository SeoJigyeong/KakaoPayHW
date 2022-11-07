package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.PointM;
import dto.GetListMbrshpPointHistByPeriodIn;
import dto.GetListMbrshpPointHistByPeriodListOut;

@Repository
public class PointHDaoImpl implements PointHDao {
	// MemberDao를 구현한 MemberDaoImpl 클래스
	
	@Autowired
	private SqlSession sqlSession;
	// SqlSession이라는 객체를 속성으로 갖는다
	private static final String Namespace = "mapper.mbrshpMMapper";
	// Namespace 값을 스트링변수에 대입한다
	
	@Override
	public List<GetListMbrshpPointHistByPeriodListOut> selectListPyPeriod(GetListMbrshpPointHistByPeriodIn in) throws Exception{
		// TODO Auto-generated method stub
		return sqlSession.selectList(Namespace+".selectListByPeriod");
		// sqlSession메서드를 이용해 memberMapper에서 select 경로 리턴한다 
	}

}
