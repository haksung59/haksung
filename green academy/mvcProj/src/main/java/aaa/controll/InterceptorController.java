package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InterceptorController {
	
	
	@RequestMapping("/intercep/event")
	String event() {
		
		System.out.println("event 진입");
		
		return "intercep/event";
	}
	
	
	@RequestMapping("/intercep/fail")
	String fail() {
		
		System.out.println("fail 진입");
		
		return "intercep/fail";
	}

}
