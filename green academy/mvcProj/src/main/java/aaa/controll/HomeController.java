package aaa.controll;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {  //MVC  의 Controller 역할  --> 제어

	@RequestMapping("/")   //servlet mapping 역할
	
	String home() {
		System.out.println("home 실행");
		return "aaa";  //view 페이지

		/*
		 *  prefix : /views/
            suffix : .jsp
		 *
		 prefix     suffix
		 /views/aaa.jsp
		   
		 */	
	}
	
	
	@RequestMapping("/go")
	@ResponseBody   //view 페이지 형태로 리턴
	String gogog() {
		System.out.println("go 실행");
		return "asdf"; //클라이언트에게 보여질 내용      
		
	}
	
	
	@RequestMapping("/tt")
	ModelAndView zxsad() {
		System.out.println("tt 실행");
		
		ModelAndView mav = new ModelAndView("qqq/zxc");
		
		//request.setAttribute()
		mav.addObject("now", new Date());
		
		return mav; //view 페이지      
		
		/*
		 *  prefix : /views/
            suffix : .jsp
		 *
		 prefix          suffix
		 /views/qqq/zxc.jsp
		
		   
		   
		   mvcTest  프로젝트를 구현하세요
		   
		   mvcTest/aaa  ==> 안녕하세요 aaa 입니다.   localhost:8123/aaa
		   포트 : 8123   --> localhost:8123    으로 확인
		   
		   
		 */	
		
		
		
		
		
		
	}
	
}
