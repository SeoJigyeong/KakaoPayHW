package controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.ResultOut;
import service.IntegratedBrcdMngmtService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IntegratedBrcdMngmtController {
	
	private static final Logger logger = LoggerFactory.getLogger(IntegratedBrcdMngmtController.class);
	
	@Autowired
	private IntegratedBrcdMngmtService integratedBrcdMngmtService;
	// MemberService 객체의 변수를 선언한다
	
	@RequestMapping(value = "/createIntegratedBrcd", method = {RequestMethod.GET, RequestMethod.POST})
	public ResultOut createIntegratedBrcd(Locale locale, Model model, HttpServletRequest request) throws Exception{
		// local과 model을 파라미터로 받는 view메서드를 생성한다. 
		
		if(logger.isDebugEnabled()) {
			logger.debug("\n#@@# IntegratedBrcdMngmtController createIntegratedBrcd START");
		}
		
		ResultOut out = new ResultOut();
		
		String userId = request.getParameter("userId");
		out = integratedBrcdMngmtService.createIntegratedBrcd(userId); 
		
		if(logger.isDebugEnabled()) {
			logger.debug("\n#@@# IntegratedBrcdMngmtController createIntegratedBrcd END");
		}
		
		return out;
		// view jsp로 경로를 지정한다
	}

 }
