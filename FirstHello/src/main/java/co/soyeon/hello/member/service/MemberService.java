package co.soyeon.hello.member.service;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberSelectList();
	MemberVO memberSelect(MemberVO vo); // login, 1명의 데이터 가져오기
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
	boolean memberIdCheck(MemberVO vo); // id 중복체크
	int memberAuthorUpdate(MemberVO vo);
}
