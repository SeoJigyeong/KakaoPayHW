package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MbrshpMDao;
import dto.ResultOut;

@Service
public class IntegratedBrcdMngmtServicelmpl implements IntegratedBrcdMngmtService {
	
	@Autowired
	private MbrshpMDao mbrshpMDao;
	// MemberDAO 변수 dao를 선언한다
	private static final Logger logger = LoggerFactory.getLogger(IntegratedBrcdMngmtServicelmpl.class);
	
	@Override
	public ResultOut createIntegratedBrcd(String userId) throws Exception {
		// MbrshpMDao.JoinInsert(in);
		
		if(logger.isDebugEnabled()) {
			logger.debug("\n#@@# IntegratedBrcdMngmtController createIntegratedBrcd START");
		}
		ResultOut out = new ResultOut();
		
		
		if(logger.isDebugEnabled()) {
			logger.debug("\n#@@# IntegratedBrcdMngmtController createIntegratedBrcd START");
		}
		return out;
	}

}
