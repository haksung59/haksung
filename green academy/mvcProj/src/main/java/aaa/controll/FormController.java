package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aaa.model.Stud;

@Controller
public class FormController {

	@RequestMapping(value = "/inputStud" , method = RequestMethod.GET)
	String formmmm() {
		
		return "form/inputForm";
	}
	
	@RequestMapping(value = "/inputStud" , method = RequestMethod.POST)
	String completeeee(
//			@RequestParam String pid, 
//			@RequestParam int age,
//			@RequestParam boolean marriage,
			Stud st
			) {
		//request.setAttribute("stud", st)
		
//		System.out.println("pid:"+pid);
//		System.out.println("age:"+age);
//		System.out.println("marriage:"+marriage);
		System.out.println("st:"+st);
		return "form/complete";
	}
	
	
	@RequestMapping(value = "/inputStud2" )
	String completeeee2(@ModelAttribute("sstt") Stud st) {
	//request.setAttribute("sstt", st)	

		System.out.println("st:"+st);
		return "form/complete2";
	}
	
	/// 이름,국어,영어,수학,총점,평균,등급(수우미양가)
}
