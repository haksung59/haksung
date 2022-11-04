package aaa.controll;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.service.MyProvider;
import aaa.service.NoticeService;

@Controller
@RequestMapping("/ppp/{cate}/{service}")
public class PathController {
	
	@Resource
	MyProvider provider;
	
	

	@ModelAttribute("menuData")
	Object menuData(@PathVariable String cate, @PathVariable String service) {
		
		System.out.println("menuData 진입:"+cate+","+service);
		return cate+" 메뉴";
	}
	
	@ModelAttribute("mainData")
	Object mainData(@PathVariable String cate, @PathVariable String service) {
		
		System.out.println("mainData 진입:"+cate+","+service);
		
		//return cate+"/"+service+" 데이터";
		NoticeService ns = (NoticeService)provider.getContext().getBean(service);
		
		//System.out.println(ns);
		
		return ns.execute();
		
		
	}
	
	
	@RequestMapping
	String view(@PathVariable String cate, @PathVariable String service) {
		
		System.out.println("PathController 진입:"+cate+","+service);
		return "ppp/template";
	}
}
