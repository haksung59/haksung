package anno.model;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Notebook extends Computer{

	String name="노트북";
	@Resource
	Mainframe mainframe;
	@Resource
	Keyboard keyboard;
	@Resource
	Mouse mouse;
	@Override
	public String toString() {
		return "Notebook [name=" + name + ", mainframe(본체)=" + mainframe + ", keyboard(키보드)=" + keyboard + ", mouse(마우스)=" + mouse
				+ "]";
	}
}
