package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.PartnerMDao;
import dao.PointMDao;
import domain.PartnerM;
import domain.PointM;
import dto.ModifyMbrshpPointIn;
import dto.ResultOut;
import dto.SaveMbrshpPointIn;

@Service
public class MbrshpPointMngmtServicelmpl implements MbrshpPointMngmtService {
	
	@Autowired
	private PointMDao pointMDao;
	private PartnerMDao partnerMDao;
	
	@Override
	public ResultOut saveMbrshpPoint(SaveMbrshpPointIn in) throws Exception {
		
		ResultOut out = new ResultOut();
		
		/*
		 * 1. 등록 상점 확인
		 */
		if(in != null) {
			PartnerM partnerIn = new PartnerM();
			partnerIn.setPartnerId(in.getPartnerId()); 
			PartnerM chkPartner = partnerMDao.selectOne(partnerIn);
			
			if(chkPartner ==  null) {
				throw new Exception("등록된 상점id가 아닙니다.");
			}
			
			PointM beanIn = new PointM();
			pointMDao.insert(beanIn);
		}
		
		return out;
	}
	
	@Override
	public ResultOut modifyMmbrshpPoint(ModifyMbrshpPointIn in) throws Exception {
		// MemberDaoImpl의 메서드를 오버라이딩한다
		ResultOut out = new ResultOut();
		
		PointM beanIn = new PointM();
		
		pointMDao.update(beanIn);
		
		return out;
	}

}
