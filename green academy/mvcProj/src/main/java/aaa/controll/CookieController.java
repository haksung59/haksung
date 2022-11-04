package aaa.controll;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CookieController {

	@GetMapping("/cookie/make")
	@ResponseBody
	String make(HttpServletResponse response) {
		
		Cookie coo = new Cookie("pname", "aaa");
		response.addCookie(coo);
		response.addCookie(new Cookie("age", "19"));
		
		return "쿠키생성 성공";
	}
	
	
	@GetMapping("/cookie/make2")
	@ResponseBody
	String make2(HttpServletResponse response) {
		
		
		try {
			String ttt=URLEncoder.encode("아기상어", "utf-8");
			System.out.println(ttt);
			//Cookie coo = new Cookie("pname", "아기상어");
			Cookie coo = new Cookie("pname", ttt);
			response.addCookie(coo);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return "쿠키생성 성공2";
	}
	
	@GetMapping("/cookie/delete")
	@ResponseBody
	String delete(HttpServletResponse response) {
		
		Cookie coo = new Cookie("pname", "");
		coo.setMaxAge(0);
		
		response.addCookie(coo);
		
		coo = new Cookie("age", "");
		coo.setMaxAge(0);
		
		response.addCookie(coo);
		
		return "쿠키삭제 성공";
	}
	
	
	
	@GetMapping("/cookie/view")
	@ResponseBody
	String view(
			@CookieValue(value="pname" , defaultValue = "쿠키없음요") String pname,
			@CookieValue(value="age" , defaultValue = "50") int age
			) {
		
		String ttt = "pname : "+pname+"<br>";
				ttt += "age : "+age+"<br>";
		return ttt;
	}
}
