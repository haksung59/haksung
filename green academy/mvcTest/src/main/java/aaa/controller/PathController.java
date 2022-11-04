package aaa.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.service.MyProvider;
import aaa.service.TVService;


@Controller
@RequestMapping("tvshop/{service}")
public class PathController {

	@Resource
	MyProvider provider;
	
	
	
	
	@ModelAttribute("contentData")
	Object contentData(@PathVariable String service) {
		
		TVService ts = (TVService)provider.getContext().getBean(service);
		
		return ts.execute();
		
	}
	
	@RequestMapping
	String view() {
		
		return "tvshop/tvtemplate";
	}
	
}