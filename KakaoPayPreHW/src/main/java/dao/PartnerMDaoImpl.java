package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import domain.PartnerM;

@Repository
public class PartnerMDaoImpl implements PartnerMDao {
	
	@Autowired
	private SqlSession sqlSession;
	private static final String Namespace = "mapper.mbrshpMMapper";
	
	@Override
	public PartnerM selectOne(PartnerM in) throws Exception{
		
		return sqlSession.selectOne(Namespace+".select");

	}
}
