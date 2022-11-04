package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

	
	@RequestMapping("admin/main")
	@ResponseBody
	String main() {
		
		return "관리자 메인화면";
	}
	
	
	@RequestMapping("admin/login")
	@ResponseBody
	String login() {
		
		return "관리자 로그인화면";
	}
	
	
	@RequestMapping("admin/member")
	@ResponseBody
	String member() {
		
		return "관리자 회원관리화면";
	}
	
	
	@RequestMapping("qwer")
	@ResponseBody
	String qwer() {
		
		return "관리자 페이지 못가요";
	}
	
}
