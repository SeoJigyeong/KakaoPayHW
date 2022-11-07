package service;

import dto.GetListMbrshpPointHistByPeriodIn;
import dto.GetListMbrshpPointHistByPeriodOut;

public interface MbrshpPointInquiryService {
	
	public GetListMbrshpPointHistByPeriodOut getListMmbrshpPointHistByPeriod(GetListMbrshpPointHistByPeriodIn in) throws Exception;

}
