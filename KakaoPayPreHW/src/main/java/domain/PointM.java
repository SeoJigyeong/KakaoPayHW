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
@Table(name="PointM")
public class PointM {
	
	@Id
	@Column(name="MBRSHP_BRCD_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mbrshpBrcdId;
	
	@Column(name="APPROVED_DT")
	private String approvedDt;
	
	@Column(name="PARTNER_ID")
	private String partnerId;
	
	@Column(name="PARTNER_CATEGORY")
	private String partnerCategory;
	
	@Column(name="LAST_POINT_SCORE")
	private BigDecimal lastPointScore;
	
	@Column(name="FRST_CREAT_TIMESTAMP")
	private LocalDateTime FrstCreatTimestamp;
	
	@Column(name="FRST_CREAT_GUID")
	private String frstCreatGuid;
	
	@Column(name="LAST_CHNG_TIMESTAMP")
	private LocalDateTime lastChngTimestamp;
	
	@Column(name="LAST_CHNG_GUID")
	private String lastChngGuid;
	
	public PointM(int mbrshpBrcdId, String approvedDt, String partnerId, String partnerCategory,
			BigDecimal lastPointScore, LocalDateTime frstCreatTimestamp, String frstCreatGuid,
			LocalDateTime lastChngTimestamp, String lastChngGuid) {
		super();
		this.mbrshpBrcdId = mbrshpBrcdId;
		this.approvedDt = approvedDt;
		this.partnerId = partnerId;
		this.partnerCategory = partnerCategory;
		this.lastPointScore = lastPointScore;
		FrstCreatTimestamp = frstCreatTimestamp;
		this.frstCreatGuid = frstCreatGuid;
		this.lastChngTimestamp = lastChngTimestamp;
		this.lastChngGuid = lastChngGuid;
	}
	
	
	public PointM() {

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

	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerCategory() {
		return partnerCategory;
	}

	public void setPartnerCategory(String partnerCategory) {
		this.partnerCategory = partnerCategory;
	}

	public BigDecimal getLastPointScore() {
		return lastPointScore;
	}

	public void setLastPointScore(BigDecimal lastPointScore) {
		this.lastPointScore = lastPointScore;
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
