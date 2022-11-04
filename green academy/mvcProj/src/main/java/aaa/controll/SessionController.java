package aaa.controll;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionController {

	@RequestMapping("/session/make")
	String make(HttpSession session, Model mm) {
		
		session.setAttribute("pid", "aaa");
		mm.addAttribute("ttt","세션 생성");
		
		return "session/view";
	}
	
	@RequestMapping("/session/make2")
	String make2(HttpSession session, Model mm) {
		
		session.setAttribute("pid", "bbb");
		mm.addAttribute("ttt","세션 생성2");
		
		return "session/view";
	}
	
	@RequestMapping("/session/delete")
	String delete(HttpSession session, Model mm) {
		
		session.invalidate();
		mm.addAttribute("ttt","세션 삭제");
		
		return "session/view";
	}
	
}
