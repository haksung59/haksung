package anno.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Server extends Computer{
	
	String name = "서버";
	int mainframe = 2;
	@Resource
	Monitor monitor;
	@Resource
	Keyboard keyboard;
	@Resource
	Mouse mouse;
	
	
	@Override
	public String toString() {
		return "Server [name=" + name + ", mainframe(본체)=" + mainframe + ", monitor(모니터)=" + monitor + ", keyboard(키보드)=" + keyboard
				+ ", mouse(마우스)=" + mouse + "]";
	}
	
}
