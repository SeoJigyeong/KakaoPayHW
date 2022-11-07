package dao;

import domain.PointM;

public interface PointMDao {
	
	public PointM selectOne(PointM in) throws Exception;
	
	public void insert(PointM in) throws Exception;
	
	public void update(PointM in) throws Exception;
}
