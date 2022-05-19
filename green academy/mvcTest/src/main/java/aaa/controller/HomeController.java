package aaa.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/aaa")
	ModelAndView aaa() {
		System.out.println("tt 실행");
		
		ModelAndView mav = new ModelAndView("aaa");
		
		/*
		 * prefix : /views/
		 * suffix : .jsp
		 * 
		 * prefix		suffix
		 /views/qqq/zxc.jsp
		 * 
		 * 
		 * mvcTest 프로젝트를 구현하세요.
		 * 
		 * mvcTest/aaa	==>안녕하세요 aaa입니다.
		 * 
		 * */
		
		return mav;
	}
}
