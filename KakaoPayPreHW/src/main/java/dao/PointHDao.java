package dao;

import java.util.List;

import dto.GetListMbrshpPointHistByPeriodIn;
import dto.GetListMbrshpPointHistByPeriodListOut;

public interface PointHDao {
	
	public List<GetListMbrshpPointHistByPeriodListOut> selectListPyPeriod(GetListMbrshpPointHistByPeriodIn in) throws Exception;
	
}
