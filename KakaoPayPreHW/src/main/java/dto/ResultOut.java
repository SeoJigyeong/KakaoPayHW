package dto;

public class ResultOut {
	private String resultCode;
	private String resultMessage;
	private String resultType;
	
	public ResultOut(String resultCode, String resultMessage, String resultType) {
		super();
		this.resultCode = resultCode;
		this.resultMessage = resultMessage;
		this.resultType = resultType;
	}
	
	public ResultOut() {

	}
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultType() {
		return resultType;
	}
	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

}
