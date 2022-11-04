package aaa.controll;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.service.MyProvider;
import aaa.service.TVInterface;



@Controller
@RequestMapping("/tv/{service}")
public class PathHomeController {
	
	@Resource
	MyProvider provider;

	@ModelAttribute("topData")
	Object topData() {
		
		return provider.getContext().getBean("TVTop",  TVInterface.class).execute();
		
		
	}
	
	@ModelAttribute("mainData")
	Object mainData(@PathVariable String service) {
		return provider.getContext().getBean("tv_"+service,  TVInterface.class).execute();
	}
	
	@RequestMapping
	String view() {
		return "ppp/tvTemp";
	}
	
}
