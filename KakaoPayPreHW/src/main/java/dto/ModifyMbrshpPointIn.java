package dto;

public class ModifyMbrshpPointIn {
	private String storeId;
	private String mbrshpBrcdId;
	private String pointScore;
	
	public ModifyMbrshpPointIn(String storeId, String mbrshpBrcdId, String pointScore) {
		super();
		this.storeId = storeId;
		this.mbrshpBrcdId = mbrshpBrcdId;
		this.pointScore = pointScore;
	}
	
	public ModifyMbrshpPointIn() {
		
	}
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getMbrshpBrcdId() {
		return mbrshpBrcdId;
	}
	public void setMbrshpBrcdId(String mbrshpBrcdId) {
		this.mbrshpBrcdId = mbrshpBrcdId;
	}
	public String getPointScore() {
		return pointScore;
	}
	public void setPointScore(String pointScore) {
		this.pointScore = pointScore;
	}
	
	

}
