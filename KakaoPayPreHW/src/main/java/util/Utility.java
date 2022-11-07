package util;

import javax.servlet.http.HttpServletRequest;

import dto.ResultOut;

public class Utility {
	
	public ResultOut checkParameter(HttpServletRequest request, String parameterName) {
		
		ResultOut out = new ResultOut();
		StringBuilder errorMessage = new StringBuilder();
		errorMessage.append("[");
		errorMessage.append(parameterName);
		errorMessage.append("]필수값이 입력되지 않았습니다");
						
		String parameterCandidate = request.getParameter(parameterName); 
		
		if(parameterCandidate == null) {
			out.setResultCode("100");
			out.setResultMessage(errorMessage.toString());
			out.setResultType("INPUT_NULL_CHECK"); 
		} else {
			out.setResultCode("00");
			out.setResultMessage("정상");
		}
		
		return out;
	}

}
