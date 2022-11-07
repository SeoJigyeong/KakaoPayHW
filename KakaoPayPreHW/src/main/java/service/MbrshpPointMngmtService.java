package service;

import dto.ModifyMbrshpPointIn;
import dto.ResultOut;
import dto.SaveMbrshpPointIn;

public interface MbrshpPointMngmtService {
	
	public ResultOut saveMbrshpPoint(SaveMbrshpPointIn in) throws Exception; 
	
	public ResultOut modifyMmbrshpPoint(ModifyMbrshpPointIn in) throws Exception;
}
