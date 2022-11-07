package domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PointH")
public class PointH {
	
	@Id
	@Column(name="MBRSHP_BRCD_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mbrshpBrcdId;
	
	@Column(name="APPROVED_DT")
	private String approvedDt;
	
	@Column(name="STORE_ID")
	private String storeId;
	
	@Column(name="PARTNER_CATEGORY")
	private String partnerCategory;
	
	@Column(name="PARTNER_ID")
	private String partnerId;
	
	@Column(name="POINT_USE_TYPE")
	private String pointUseType;
	
	@Column(name="POINT_SCORE")
	private BigDecimal pointScore;
	
	@Column(name="FRST_CREAT_TIMESTAMP")
	private LocalDateTime FrstCreatTimestamp;
	
	@Column(name="FRST_CREAT_GUID")
	private String frstCreatGuid;
	
	@Column(name="LAST_CHNG_TIMESTAMP")
	private LocalDateTime lastChngTimestamp;
	
	@Column(name="LAST_CHNG_GUID")
	private String lastChngGuid;
	
	public PointH(int mbrshpBrcdId, String approvedDt, String storeId, String partnerCategory, String partnerId,
			String pointUseType, BigDecimal pointScore, LocalDateTime frstCreatTimestamp, String frstCreatGuid,
			LocalDateTime lastChngTimestamp, String lastChngGuid) {
		super();
		this.mbrshpBrcdId = mbrshpBrcdId;
		this.approvedDt = approvedDt;
		this.storeId = storeId;
		this.partnerCategory = partnerCategory;
		this.partnerId = partnerId;
		this.pointUseType = pointUseType;
		this.pointScore = pointScore;
		FrstCreatTimestamp = frstCreatTimestamp;
		this.frstCreatGuid = frstCreatGuid;
		this.lastChngTimestamp = lastChngTimestamp;
		this.lastChngGuid = lastChngGuid;
	}
	
	public PointH() {

	}
	
	public int getMbrshpBrcdId() {
		return mbrshpBrcdId;
	}

	public void setMbrshpBrcdId(int mbrshpBrcdId) {
		this.mbrshpBrcdId = mbrshpBrcdId;
	}

	public String getApprovedDt() {
		return approvedDt;
	}

	public void setApprovedDt(String approvedDt) {
		this.approvedDt = approvedDt;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getPartnerCategory() {
		return partnerCategory;
	}

	public void setPartnerCategory(String partnerCategory) {
		this.partnerCategory = partnerCategory;
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

	public LocalDateTime getFrstCreatTimestamp() {
		return FrstCreatTimestamp;
	}

	public void setFrstCreatTimestamp(LocalDateTime frstCreatTimestamp) {
		FrstCreatTimestamp = frstCreatTimestamp;
	}

	public String getFrstCreatGuid() {
		return frstCreatGuid;
	}

	public void setFrstCreatGuid(String frstCreatGuid) {
		this.frstCreatGuid = frstCreatGuid;
	}

	public LocalDateTime getLastChngTimestamp() {
		return lastChngTimestamp;
	}

	public void setLastChngTimestamp(LocalDateTime lastChngTimestamp) {
		this.lastChngTimestamp = lastChngTimestamp;
	}

	public String getLastChngGuid() {
		return lastChngGuid;
	}

	public void setLastChngGuid(String lastChngGuid) {
		this.lastChngGuid = lastChngGuid;
	}

}
