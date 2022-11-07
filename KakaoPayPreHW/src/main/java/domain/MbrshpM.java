package domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MbrshpM")
public class MbrshpM {
	
	@Id
	@Column(name="MBRSHP_BRCD_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mbrshpDrcdId;
	
	@Column(name="USER_ID")
	private String userId;
	
	@Column(name="FRST_CREAT_TIMESTAMP")
	private LocalDateTime FrstCreatTimestamp;
	
	@Column(name="LAST_CHNG_TIMESTAMP")
	private LocalDateTime lastChngTimestamp;
	
	@Column(name="LAST_CHNG_GUID")
	private String lastChngGuid;
	

	public MbrshpM(int mbrshpDrcdId, String userId, LocalDateTime frstCreatTimestamp, String frstCreatGuid,
			LocalDateTime lastChngTimestamp, String lastChngGuid) {
		super();
		this.mbrshpDrcdId = mbrshpDrcdId;
		this.userId = userId;
		FrstCreatTimestamp = frstCreatTimestamp;
		this.frstCreatGuid = frstCreatGuid;
		this.lastChngTimestamp = lastChngTimestamp;
		this.lastChngGuid = lastChngGuid;
	}
	
	public MbrshpM() {

	}
	
	public int getMbrshpDrcdId() {
		return mbrshpDrcdId;
	}

	public void setMbrshpDrcdId(int mbrshpDrcdId) {
		this.mbrshpDrcdId = mbrshpDrcdId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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
