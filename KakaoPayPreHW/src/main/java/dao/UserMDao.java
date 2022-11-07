package dao;

import java.util.List;
import dto.MemberVO;

public interface UserMDao {
	// MemberDao라는 인터페이스를 생성한다
	
	public List<MemberVO> selectMember() throws Exception;
	// MemberVO를 타입으로 하는 List를 리턴값으로 갖는 selectMember메서드를 생성
	
	public void insertMember(MemberVO vo) throws Exception;
}
