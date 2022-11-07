package dto;

import java.math.BigDecimal;

public class GetListMbrshpPointHistByPeriodListOut {
	
	private String     mbrshpBrcdId;
	private int        histSeqNbr;
	private String     partnerCategory;
	private String     approvedDt;
	private String     partnerId;
	private String     pointUseType;
	private BigDecimal pointScore;
	private String     partnerNm;
	
	public GetListMbrshpPointHistByPeriodListOut(String mbrshpBrcdId, int histSeqNbr, String partnerCategory,
			String approvedDt, String partnerId, String pointUseType, BigDecimal pointScore, String partnerNm) {
		super();
		this.mbrshpBrcdId = mbrshpBrcdId;
		this.histSeqNbr = histSeqNbr;
		this.partnerCategory = partnerCategory;
		this.approvedDt = approvedDt;
		this.partnerId = partnerId;
		this.pointUseType = pointUseType;
		this.pointScore = pointScore;
		this.partnerNm = partnerNm;
	}
	
	public GetListMbrshpPointHistByPeriodListOut() {

	}
	
	public String getMbrshpBrcdId() {
		return mbrshpBrcdId;
	}
	public void setMbrshpBrcdId(String mbrshpBrcdId) {
		this.mbrshpBrcdId = mbrshpBrcdId;
	}
	public int getHistSeqNbr() {
		return histSeqNbr;
	}
	public void setHistSeqNbr(int histSeqNbr) {
		this.histSeqNbr = histSeqNbr;
	}
	public String getPartnerCategory() {
		return partnerCategory;
	}
	public void setPartnerCategory(String partnerCategory) {
		this.partnerCategory = partnerCategory;
	}
	public String getApprovedDt() {
		return approvedDt;
	}
	public void setApprovedDt(String approvedDt) {
		this.approvedDt = approvedDt;
	}
	public String getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPointUseType() {
		return pointUseType;
	}
	public void setPointUseType(String pointUseType) {
		this.pointUseType = pointUseType;
	}
	public BigDecimal getPointScore() {
		return pointScore;
	}
	public void setPointScore(BigDecimal pointScore) {
		this.pointScore = pointScore;
	}
	public String getPartnerNm() {
		return partnerNm;
	}
	public void setPartnerNm(String partnerNm) {
		this.partnerNm = partnerNm;
	}
	
}
