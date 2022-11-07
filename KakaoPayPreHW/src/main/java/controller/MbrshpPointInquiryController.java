package controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.GetListMbrshpPointHistByPeriodIn;
import dto.GetListMbrshpPointHistByPeriodListOut;
import dto.GetListMbrshpPointHistByPeriodOut;
import service.MbrshpPointInquiryService;


@Controller
public class MbrshpPointInquiryController {
	private static final Logger logger = LoggerFactory.getLogger(MbrshpPointInquiryController.class);
	
	@Autowired
	private MbrshpPointInquiryService mbrshpPointInquiryService;
	
	@RequestMapping(value = "/getListMbrshpPointHistByPeriod", method = {RequestMethod.GET, RequestMethod.POST})
	public GetListMbrshpPointHistByPeriodOut getListMbrshpPointHistByPeriod(Locale locale, Model model, HttpServletRequest request) throws Exception{

		if(logger.isDebugEnabled()) {
			logger.debug("\n#@@# MbrshpPointInquiryController getListMbrshpPointHistByPeriod START");
		}
		/*
		 * 1. 출력 Dto 선언
		 */
		GetListMbrshpPointHistByPeriodOut out = new GetListMbrshpPointHistByPeriodOut();
		
		/*
		 * 2. 입력 Param 셋팅
		 */
		String startDt = request.getParameter("startDt");
		String endDt = request.getParameter("endDt");
		String mbrshpBrcdId = request.getParameter("mbrshpBrcdId");
		
		/*
		 * 3. Service 호출
		 */
		GetListMbrshpPointHistByPeriodIn beanIn = new GetListMbrshpPointHistByPeriodIn();
		beanIn.setStartDt(startDt);
		beanIn.setEndDt(endDt);
		beanIn.setMbrshpBrcdId(mbrshpBrcdId); 
	
		out = mbrshpPointInquiryService.getListMmbrshpPointHistByPeriod(beanIn);
		
		if(logger.isDebugEnabled()) {
			logger.debug("\n#@@# MbrshpPointInquiryController getListMbrshpPointHistByPeriod END");
		}
		
		return out;
	}

	
 }
