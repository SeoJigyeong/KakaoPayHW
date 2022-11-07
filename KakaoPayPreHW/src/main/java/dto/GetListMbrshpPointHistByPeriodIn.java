package dto;

public class GetListMbrshpPointHistByPeriodIn {
	
	private String startDt;
	private String endDt;
	private String mbrshpBrcdId;
	
	public GetListMbrshpPointHistByPeriodIn(String startDt, String endDt, String mbrshpBrcdId) {
		super();
		this.startDt = startDt;
		this.endDt = endDt;
		this.mbrshpBrcdId = mbrshpBrcdId;
	}
	
	public GetListMbrshpPointHistByPeriodIn() {

	}
	
	public String getStartDt() {
		return startDt;
	}
	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}
	public String getEndDt() {
		return endDt;
	}
	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}
	public String getMbrshpBrcdId() {
		return mbrshpBrcdId;
	}
	public void setMbrshpBrcdId(String mbrshpBrcdId) {
		this.mbrshpBrcdId = mbrshpBrcdId;
	}
	
	

}
