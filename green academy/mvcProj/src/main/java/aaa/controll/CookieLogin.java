package aaa.controll;

import java.util.HashMap;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Stud;


@Controller
public class CookieLogin {
	
	
	@RequestMapping("/cookie/logMain")
	String logMain(Model mm, 
			@CookieValue(value="pname" , defaultValue = "") String pname,
			@CookieValue(value="pid", defaultValue = "") String pid
	) {
		
		System.out.println(pid);
		
		if(!pid.equals("")) {  ///Cookie 가 있다면
			mm.addAttribute("mem",new Stud(pid, pname));  //로그인 정보 전달
		}
		
		return "cookie/logMain";
	}
	

	@RequestMapping("/cookie/logReg")
	String logReg(Stud st, Model mm, HttpServletResponse response) {
		
		HashMap<String, Stud> map = new HashMap<>();
		
		map.put("aaa", new Stud("aaa","장동건","1111"));
		map.put("bbb", new Stud("bbb","장서건","2222"));
		map.put("ccc", new Stud("ccc","장동건","3333"));
		map.put("ddd", new Stud("ddd","장남건","1111"));
		map.put("eee", new Stud("eee","북두신건","3333"));
		
		
		String msg = "로그인 실패";
		
		if(map.containsKey(st.getPid())) { //ID 존재 유무
			Stud data = map.get(st.getPid());
			if(data.getPw().equals(st.getPw())) {//PW 확인
				
				//로그인 정보 cookie 에 넣기
				response.addCookie(new Cookie("pid", data.getPid()));
				response.addCookie(new Cookie("pname", data.getPname()));
				
				//로그인 성공유무 화면처리
				msg = data.getPname()+" 로그인 성공";
			}
		}
		
		
		mm.addAttribute("msg",msg);
		mm.addAttribute("url","/cookie/logMain");
		return "alert";
		
	}
	
	//로그아웃
	@RequestMapping("/cookie/logOut")
	String logOut(Model mm, 
			@CookieValue(value="pname") String pname
			, HttpServletResponse response) {
		
		//로그아웃
		Cookie coo = new Cookie("pid", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		coo = new Cookie("pname", "");
		coo.setMaxAge(0);
		response.addCookie(coo);
		
		//로그아웃 메세지 화면 처리
		mm.addAttribute("msg",pname+" 로그아웃되었습니다.");
		mm.addAttribute("url","/cookie/logMain");
		return "alert";
	}
	
	
	
}
