package aaa.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.Cookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Member;

@Controller
public class CookieLogin {
	
	@RequestMapping("/cookie/logMain")
	String logMain(Model mm, @CookieValue(value="name", defaultValue="") String name,
			@CookieValue(value="id", defaultValue="") String id) {
		
		System.out.println(id);
		
		if(!id.equals("")) {
			mm.addAttribute("mem", new Member(id,name));
		}
		
		return "cookie/logMain";
	}
	
	@RequestMapping("/cookie/logReg")
	String logReg(Member mem, Model mm, HttpServletResponse response) {
		
		HashMap<String, Member> map = new HashMap<>();
		
		map.put("aaa", new Member("aaa","장동건","1111"));
		map.put("bbb", new Member("bbb","장서건","2222"));
		map.put("ccc", new Member("ccc","장남건","3333"));
		map.put("ddd", new Member("ddd","장북건","1111"));
		map.put("eee", new Member("eee","북두신건","3333"));
		
		String msg = "로그인 실패";
		
		if(map.containsKey(mem.getId())) {
			Member data = map.get(mem.getId());
			if(data.getPw().equals(mem.getPw())) {
				System.out.println("로그인 성공");
				
				response.addCookie(new Cookie("id", data.getId()));
				response.addCookie(new Cookie("name", data.getName()));
				
				msg = data.getId() + "로그인 성공";
			}
		}
		
		System.out.println("로그인 실패");
		
		mm.addAttribute("msg", "파일 용량이 너무 큽니다.");
		mm.addAttribute("url","/cookie/logMain");
		
		return "alert";
	}
	
	@RequestMapping("/cookie/logOut")
	String logOut(Model mm, @CookieValue(value="name") String name, HttpServletResponse response) {
		
		
		Cookie coo = new Cookie("id", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		coo = new Cookie("name", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		mm.addAttribute("msg", name + "로그아웃 되었습니다.");
		mm.addAttribute("url","/cookie/logMain");
		
		return "alert";
	}
	

}
