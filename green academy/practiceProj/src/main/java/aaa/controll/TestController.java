package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.vo.TestVo;

@Controller
public class TestController {

	@RequestMapping("")
	ModelAndView index() {
		
		ModelAndView mav = new ModelAndView("index");
		
		TestVo test = new TestVo();
		
		test.setTest1("하이");
		test.setTest2("뭐");
		
		mav.addObject("testData", test);
		
		return mav;
	}
	
	@RequestMapping("test1")
	String test1(Model model) {
		
		TestVo test = new TestVo();
		
		test.setTest1("학성이짱");
		test.setTest2("뭐요");
		
		model.addAttribute("test1", test.getTest1());
		model.addAttribute("test2", test.getTest2());
		
		return "test1";
	}

}
