package dto;

import java.util.List;

public class GetListMbrshpPointHistByPeriodOut {
	
	private List<GetListMbrshpPointHistByPeriodListOut> list;

	public GetListMbrshpPointHistByPeriodOut(List<GetListMbrshpPointHistByPeriodListOut> list) {
		super();
		this.list = list;
	}
	
	public GetListMbrshpPointHistByPeriodOut() {

	}
	
	public List<GetListMbrshpPointHistByPeriodListOut> getList() {
		return list;
	}

	public void setList(List<GetListMbrshpPointHistByPeriodListOut> list) {
		this.list = list;
	}
	

}
