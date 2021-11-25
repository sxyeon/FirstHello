package co.soyeon.hello.notice.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.soyeon.hello.member.service.MemberService;
import co.soyeon.hello.notice.service.NoticeService;
import co.soyeon.hello.notice.service.NoticeVO;

@Controller
public class NoticeController {
	
	@Autowired
	private NoticeService noticeDao; // noticeImpl을 자동 주입하라
	
	@Autowired
	private MemberService memberDao; // @Autowired는 한 줄만 적용 가능
	
	@RequestMapping("/noticeList.do")
	public String noticeList(Model model) {
		model.addAttribute("notices", noticeDao.noticeSelectList());
		return "notice/noticeList";
	}
	
	@RequestMapping("/noticeSelect.do")
	public String noticeSelect(Model model) {
		
		return "redirect:memberList.do"; // jsp .do를 호출하고 싶을 때는 redirect:키워드를 붙여줌
	}
	
	@RequestMapping("/noticeForm.do")
	public String noticeForm() {
		return "notice/noticeForm";
	}
	
	@PostMapping("/noticeRegister.do")
	public String noticeResister(NoticeVO vo, Model model, HttpSession session) {
		// bigo라는 변수를 담겠다는 것
		session.setAttribute("id", "soyeon");
		session.setAttribute("author", "ADMIN");
		System.out.println(session.getId() + "===========");
		System.out.println(session.getAttribute("id"));
		System.out.println(session.getAttribute("author"));
		System.out.println(vo.getBigo());
		System.out.println(vo.getTitle());
//		noticeDao.noticeInsert(vo);
		return "redirect:noticeList.do";
	}
}
