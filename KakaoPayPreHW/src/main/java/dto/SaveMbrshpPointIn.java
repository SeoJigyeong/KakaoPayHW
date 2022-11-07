package dto;

import java.math.BigDecimal;

public class SaveMbrshpPointIn {
	private String partnerId;
	private String mbrshpBrcdId;
	private BigDecimal pointScore;
	
	public SaveMbrshpPointIn(String partnerId, String mbrshpBrcdId, BigDecimal pointScore) {
		super();
		this.partnerId = partnerId;
		this.mbrshpBrcdId = mbrshpBrcdId;
		this.pointScore = pointScore;
	}
	
	public SaveMbrshpPointIn() {
		
	}
	
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getMbrshpBrcdId() {
		return mbrshpBrcdId;
	}
	public void setMbrshpBrcdId(String mbrshpBrcdId) {
		this.mbrshpBrcdId = mbrshpBrcdId;
	}
	public BigDecimal getPointScore() {
		return pointScore;
	}
	public void setPointScore(BigDecimal pointScore) {
		this.pointScore = pointScore;
	}
	
	

}
