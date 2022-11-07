package domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PartnerM")
public class PartnerM {
	
	@Id
	@Column(name="PARTNER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String partnerId;
	
	@Column(name="PARTNER_NM")
	private String partnerNm;
	
	@Column(name="PARTNER_CATEGORY")
	private String partnerCategory;
	
	@Column(name="FRST_CREAT_TIMESTAMP")
	private LocalDateTime FrstCreatTimestamp;
	
	@Column(name="FRST_CREAT_GUID")
	private String frstCreatGuid;
	
	@Column(name="LAST_CHNG_TIMESTAMP")
	private LocalDateTime lastChngTimestamp;
	
	@Column(name="LAST_CHNG_GUID")
	private String lastChngGuid;	

	public PartnerM(String partnerId, String partnerNm, String partnerCategory, LocalDateTime frstCreatTimestamp,
			String frstCreatGuid, LocalDateTime lastChngTimestamp, String lastChngGuid) {
		super();
		this.partnerId = partnerId;
		this.partnerNm = partnerNm;
		this.partnerCategory = partnerCategory;
		FrstCreatTimestamp = frstCreatTimestamp;
		this.frstCreatGuid = frstCreatGuid;
		this.lastChngTimestamp = lastChngTimestamp;
		this.lastChngGuid = lastChngGuid;
	}
	
	public PartnerM() {

	}
	
	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPartnerNm() {
		return partnerNm;
	}

	public void setPartnerNm(String partnerNm) {
		this.partnerNm = partnerNm;
	}

	public String getPartnerCategory() {
		return partnerCategory;
	}

	public void setPartnerCategory(String partnerCategory) {
		this.partnerCategory = partnerCategory;
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
