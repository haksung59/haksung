package anno.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Tablet extends Computer{

	String name="테블릿";

	@Resource
	Mainframe mainframe;
	
	@Override
	public String toString() {
		return "Tablet [name=" + name + ", mainframe(본체)=" + mainframe + "]";
	}

}
