package aaa.controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Member;


@Controller
public class SessionLogin {

	@RequestMapping("/session/logMain")
	String LogMain(Model mm, HttpSession session) {
		return "session/logMain";
	}
	
	@RequestMapping("session/logReg")
	String logReg(Member mem,Model mm,HttpSession session) {
		
		HashMap<String, Member> map = new HashMap<>();
		
		map.put("aaa", new Member("aaa","장동건","1111"));
		map.put("bbb", new Member("bbb","장서건","2222"));
		map.put("ccc", new Member("ccc","장동건","3333"));
		map.put("ddd", new Member("ddd","장남건","4444"));
		map.put("eee", new Member("eee","북두신건","5555"));
		
		String msg = "로그인 실패";
		
		if(map.containsKey(mem.getId())) {
			Member data = map.get(mem.getId());
			if(data.getPw().equals(mem.getPw())) {
				
				session.setAttribute("user", data.getId());
				
				mm.addAttribute("id",data.getId());
				mm.addAttribute("name",data.getName());
				
				msg = data.getName() + "님 로그인 성공";
				
				return "session/mypage";
				
			}
		}
		
		mm.addAttribute("msg",msg);
		mm.addAttribute("url","/sessionLog");
		return "alert";
	}
	
	@RequestMapping("session/sessionLogout")
	String logout(Model mm,HttpSession session) {
		
		session.invalidate();
		
		return "session/logMain";
		
	}
	
}