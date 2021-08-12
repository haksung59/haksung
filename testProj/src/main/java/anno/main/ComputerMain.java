package anno.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anno.model.Computer;

public class ComputerMain {

   public static void main(String[] args) {

      AbstractApplicationContext context = 
            new ClassPathXmlApplicationContext("anno/computer.xml");
   
      Computer[] arr = {
    		  (Computer)context.getBean("server"),
    		  (Computer)context.getBean("desktop"),
    		  (Computer)context.getBean("notebook"),
    		  (Computer)context.getBean("tablet"),
      };
      
      for(Computer com : arr) {
    	  System.out.println(com);
      }
      

   }
}