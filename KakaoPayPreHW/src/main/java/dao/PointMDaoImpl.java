package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.PointM;

@Repository
public class PointMDaoImpl implements PointMDao {
	// MemberDao를 구현한 MemberDaoImpl 클래스
	
	@Autowired
	private SqlSession sqlSession;
	// SqlSession이라는 객체를 속성으로 갖는다
	private static final String Namespace = "mapper.mbrshpMMapper";
	// Namespace 값을 스트링변수에 대입한다
	
	@Override
	public PointM selectOne(PointM in) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(Namespace+".selectOne");
		// sqlSession메서드를 이용해 memberMapper에서 select 경로 리턴한다
	}

	@Override
	public void insert(PointM in) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(Namespace+".insert", in);
	}

	@Override
	public void update(PointM in) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert(Namespace+".insert", in);
	}

}
