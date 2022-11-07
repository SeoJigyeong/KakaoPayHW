package domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserM")
public class UserM {
	
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="MBRSHP_BRCD_REGIST_YN")
	private String mbrshpDrcdRegistYn;
	
	@Column(name="FRST_CREAT_TIMESTAMP")
	private LocalDateTime FrstCreatTimestamp;
	
	@Column(name="FRST_CREAT_GUID")
	private String frstCreatGuid;
	
	@Column(name="LAST_CHNG_TIMESTAMP")
	private LocalDateTime lastChngTimestamp;
	
	@Column(name="LAST_CHNG_GUID")
	private String lastChngGuid;

	public UserM(int userId, String mbrshpDrcdRegistYn, LocalDateTime frstCreatTimestamp, String frstCreatGuid,
			LocalDateTime lastChngTimestamp, String lastChngGuid) {
		super();
		this.userId = userId;
		this.mbrshpDrcdRegistYn = mbrshpDrcdRegistYn;
		FrstCreatTimestamp = frstCreatTimestamp;
		this.frstCreatGuid = frstCreatGuid;
		this.lastChngTimestamp = lastChngTimestamp;
		this.lastChngGuid = lastChngGuid;
	}
	
	public UserM() {

	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMbrshpDrcdRegistYn() {
		return mbrshpDrcdRegistYn;
	}

	public void setMbrshpDrcdRegistYn(String mbrshpDrcdRegistYn) {
		this.mbrshpDrcdRegistYn = mbrshpDrcdRegistYn;
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
