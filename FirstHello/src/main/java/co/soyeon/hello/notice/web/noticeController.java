package co.soyeon.hello.notice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class noticeController {
	
	@RequestMapping("/noticeList.do")
	public String noticeList(Model model) {
		model.addAttribute("message", "공지사항 목록입니다.");
		return "notice/noticeList";
	}
	
	@RequestMapping("/noticeSelect.do")
	public String noticeSelect(Model model) {
		
		return "redirect:memberList.do"; // jsp .do를 호출하고 싶을 때는 redirect:키워드를 붙여줌
	}
}
