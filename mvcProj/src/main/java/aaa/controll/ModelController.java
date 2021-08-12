package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Stud;

@Controller
public class ModelController {
	
	@ModelAttribute("bbb")
	Object aaa() {
		
		return 1234;
	}
	
	@ModelAttribute("ccc")
	Object asdf() {
		
		return "다리에 독이 있는 장수풍뎅이";
	}
	
	@ModelAttribute("ddd")
	Object fdsafwef32() {
		
		return new Stud("www", "현빈");
	}
	
	@ModelAttribute("eee")
	Object sdfasdfljhw() {
		
		ArrayList<Stud> arr = new ArrayList<>();
		arr.add(new Stud("a", "정우성"));
		arr.add(new Stud("b", "정좌성"));
		arr.add(new Stud("c", "정남성"));
		arr.add(new Stud("d", "정중성"));
		
		return arr;
	}
	
	@RequestMapping("/model/model1")
	String model1() {
		
		return "model/view1";
	}
	
	@RequestMapping("/model/model2")
	String model2() {
		
		return "model/view2";
	}
	@RequestMapping("/model/model3")
	String model3() {
		
		return "model/view3";
	}

}
