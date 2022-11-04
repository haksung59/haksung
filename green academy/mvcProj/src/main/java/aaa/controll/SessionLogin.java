package aaa.controll;

import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Stud;


@Controller
public class SessionLogin {
	
	
	@RequestMapping("/session/logMain")
	String logMain(HttpSession session,Model mm) {
		
		String goUrl = "loginForm";
		
		if(session.getAttribute("mem")!=null) {
			 goUrl = "login";
		}
		
		mm.addAttribute("goUrl",goUrl+".jsp");
		
		return "session/logMain";
	}
	

	@RequestMapping("/session/logReg")
	String logReg(Stud st, HttpSession session, Model mm) {
		
		HashMap<String, Stud> map = new HashMap<>();
		
		map.put("aaa", new Stud("aaa","장동건","1111"));
		map.put("bbb", new Stud("bbb","장서건","2222"));
		map.put("ccc", new Stud("ccc","장동건","3333"));
		map.put("ddd", new Stud("ddd","장남건","1111"));
		map.put("eee", new Stud("eee","북두신건","3333"));
		map.put("root", new Stud("root","관리자","1234"));
		
		
		String msg = "로그인 실패";
		
		if(map.containsKey(st.getPid())) { //ID 존재 유무
			Stud data = map.get(st.getPid());
			if(data.getPw().equals(st.getPw())) {//PW 확인
				
				session.setAttribute("mem", data);
				session.setAttribute("id", st.getPid());
				//로그인 성공유무 화면처리
				msg = data.getPname()+" 로그인 성공";
			}
		}
		
		
		mm.addAttribute("msg",msg);
		mm.addAttribute("url","/session/logMain");
		return "alert";
		
	}
	
	//로그아웃
	@RequestMapping("/session/logOut")
	String logOut(Model mm, 
			HttpSession session) {
		
		Stud st = (Stud)session.getAttribute("mem");
		session.invalidate();
		
		//로그아웃 메세지 화면 처리
		mm.addAttribute("msg",st.getPname()+" 로그아웃되었습니다.");
		mm.addAttribute("url","/session/logMain");
		return "alert";
	}
	
	
	
}
