package di.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.model.Phone;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di/phone.xml");
	
		Phone phone1 = context.getBean("phone1", Phone.class);
		System.out.println(phone1);
	}

}
