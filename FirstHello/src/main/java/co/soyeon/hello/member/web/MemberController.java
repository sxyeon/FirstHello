package co.soyeon.hello.member.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	
	@GetMapping("/memberList.do") // 호출명
	public String memberList(Model model) { // 메소드명
		model.addAttribute("message", "멤버 리스트입니다."); 
		// dynamic web에서의 request.setAttribute("members", memberDao.memberSelectList)와 같음
		return "member/memberList"; // jsp명
		// 호출명, 메소드명, jsp명 일치시키기
	}
	
	// member를 처리하는 모든 메소드를 작성
}
