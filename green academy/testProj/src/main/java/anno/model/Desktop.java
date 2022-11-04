package anno.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Desktop extends Computer{
	
	String name = "데스크탑";
	@Resource
	Mainframe mainframe;
	@Resource
	Monitor monitor;
	@Resource
	Keyboard keyboard;
	@Resource
	Mouse mouse;
	
	@Override
	public String toString() {
		return "Desktop [name=" + name + ", mainframe(본체)=" + mainframe + ", monitor(모니터)=" + monitor + ", keyboard(키보드)=" + keyboard
				+ ", mouse(마우스)=" + mouse + "]";
	}
	
	
	
}
