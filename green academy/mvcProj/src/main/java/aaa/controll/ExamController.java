package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aaa.model.Exam;
import aaa.model.ExamList;

@Controller
public class ExamController {

	@RequestMapping(value="/inputExam" , method = RequestMethod.GET)
	String form() {
		return "form/examForm";
	}
	
	@RequestMapping(value="/inputExam" , method = RequestMethod.POST)
	String complete(Exam ex) {
		
		ex.calc();
		
		return "form/examComplete";
	}
	
	
	@RequestMapping(value="/listExam" , method = RequestMethod.GET)
	String form2() {
		return "form/examListForm";
	}
	
	@RequestMapping(value="/listExam" , method = RequestMethod.POST)
	String complete2(ExamList ex) {
		
		ex.calc();
		
		return "form/examListComplete";
	}
	
	
}
