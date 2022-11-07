package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import dao.PointHDao;
import domain.PointH;
import dto.GetListMbrshpPointHistByPeriodIn;
import dto.GetListMbrshpPointHistByPeriodListOut;
import dto.GetListMbrshpPointHistByPeriodOut;

@Service
public class MbrshpPointInquiryServicelmpl implements MbrshpPointInquiryService {
	// MemberService라는 인터페이스를 구현한 MemberServiceImpl 클래스를 생성한다
	
	@Autowired
	private PointHDao dao;
	// MemberDAO 변수 dao를 선언한다
	
	@Override
	@Description("")
	public GetListMbrshpPointHistByPeriodOut getListMmbrshpPointHistByPeriod(GetListMbrshpPointHistByPeriodIn in) throws Exception {
		
		/*
		 * 1. 입출력 변수 선언
		 */
		GetListMbrshpPointHistByPeriodOut out = new GetListMbrshpPointHistByPeriodOut();
		GetListMbrshpPointHistByPeriodListOut listOut = null;
		
		/*
		 * 2. 기간별 포인트내역 조회 DAO 호출
		 */
		List<GetListMbrshpPointHistByPeriodListOut> list = dao.selectListPyPeriod(in);
		
		out.setList(list);
		
		return out;
	
	}
	

}
