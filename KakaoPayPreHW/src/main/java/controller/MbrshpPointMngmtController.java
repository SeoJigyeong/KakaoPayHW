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
import dto.SaveMbrshpPointIn;
import service.MbrshpPointMngmtService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MbrshpPointMngmtController {
	
	private static final Logger logger = LoggerFactory.getLogger(MbrshpPointMngmtController.class);
	
	@Autowired
	private MbrshpPointMngmtService mbrshpPointMngmtService;
	private SaveMbrshpPointIn       saveMbrshpPointIn;
	// MemberService 객체의 변수를 선언한다
	
	@RequestMapping("/")
	public String view(Locale locale, Model model) throws Exception {

		return "index";
		// view jsp로 경로를 지정한다
	}
	
	@RequestMapping(value = "/saveMbrshpPoint", method = {RequestMethod.GET, RequestMethod.POST})
	public ResultOut saveMbrshpPoint(Locale locale, Model model, HttpServletRequest request) throws Exception{
		// local과 model을 파라미터로 받는 view메서드를 생성한다. 
		
		if(logger.isDebugEnabled()) {
			logger.debug("\n#@@# IntegratedBrcdMngmtController createIntegratedBrcd START");
		}
		
		ResultOut out = new ResultOut();
		
		String partnerId = request.getParameter("partnerId");
		String mbrshpBrcdId = request.getParameter("mbrshpBrcdId");
		String pointScore = request.getParameter("pointScore");
		
		saveMbrshpPointIn.setPartnerId(partnerId);
		saveMbrshpPointIn.setMbrshpBrcdId(mbrshpBrcdId);
		saveMbrshpPointIn.setPointScore(pointScore);
		
		out = mbrshpPointMngmtService.saveMbrshpPoint(saveMbrshpPointIn);  
		
		if(logger.isDebugEnabled()) {
			logger.debug("\n#@@# IntegratedBrcdMngmtController createIntegratedBrcd END");
		}
		
		return out;
		// view jsp로 경로를 지정한다
	}

 }
