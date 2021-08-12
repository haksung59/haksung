package anno.model;

import org.springframework.stereotype.Component;

public class Computer {
	
}
@Component
class Mainframe {
	int main1 = 1;
	
	@Override
	public String toString() {
		return Integer.toString(main1);
	}
}
@Component
class Keyboard {
	int kk1 = 1;

	@Override
	public String toString() {
		return Integer.toString(kk1);
	}
}
@Component
class Monitor {
	int mm1 =1;

	@Override
	public String toString() {
		return Integer.toString(mm1);
	}
}
@Component
class Mouse {
	int mm1 =1;

	@Override
	public String toString() {
		return Integer.toString(mm1);
	}
}
