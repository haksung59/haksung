package aaa.controll;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Stud;

@Controller
public class RedirectController {
	
	@RequestMapping("rrr/ppp")
	String ppp(Stud st) {
		
		System.out.println("ppp진입"+st);
		//return "rrr/ppp";
		
		String name = "";
		try {
			name = URLEncoder.encode("한가인","utf-8");
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		return "redirect:qqq?pid="+st.getPid()+"&age="+st.getAge()+"&pname="+name;
	}
	
	
	@RequestMapping("rrr/fff")
	ModelAndView fff(Stud st) {
		
		System.out.println("fff진입"+st);
		//return "rrr/ppp";
		
		ModelAndView mav = new ModelAndView("redirect:qqq");//리다이렉팅 하는 페이지에 데이터 전달 --> 단 parameter 기본형태로만 전달.
		//mav.addObject("stud",st);
		//mav.addObject("st",st);
		mav.addObject("pid",st.getPid());
		mav.addObject("age",st.getAge());
		mav.addObject("pname","정우성");
		return mav;
	}
	
	
	@RequestMapping("rrr/ggg")
	String ggg(Stud st, Model mm) {//Model ->현재 URL까지만 전달가능.
		
		System.out.println("ggg진입"+st);
		
		
		mm.addAttribute("pid",st.getPid());
		mm.addAttribute("age",st.getAge());
		mm.addAttribute("pname","김태희");
		return "redirect:qqq";
	}
	
	
	
	
	@RequestMapping("rrr/qqq")
	@ResponseBody
	String qqq(Stud st) {
		
		
		return "rrr/qqq:"+st;
	}

}
