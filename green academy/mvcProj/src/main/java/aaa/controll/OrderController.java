package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import aaa.model.Order;

@Controller
public class OrderController {

	@RequestMapping(value="/inputOrder", method = RequestMethod.GET)
	String orderForm() {
		return "form/orderForm";
	}
	
	@RequestMapping("/orderComplete")
	String orderComplete(Order order) {
		
		
		System.out.println(order);
		
		/*
		 * product - name[3], cnt[3], price[3]   X
		 * 
		 * product[3]
		 * 
		 * */
		
		return "form/orderComplete";
	}
}
