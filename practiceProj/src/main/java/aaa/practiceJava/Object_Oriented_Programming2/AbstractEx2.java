package aaa.practiceJava.Object_Oriented_Programming2;

public class AbstractEx2 {

	public static void main(String[] args) {
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		DropShip dropship = new DropShip();
		
		Unit[] group = {marine, tank, dropship};
		System.out.println(marine.stimpack);
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}
		marine.stimPack();
		tank.sizMode();
		System.out.println(marine.stimpack);
		System.out.println(tank.mode);
	}

}

abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{
	
	boolean stimpack;
	
	void move(int x, int y) {
		System.out.println("마린 : x="+x+", y=" +y);
	}
	void stimPack() {
		stimpack = true;
		System.out.println("스팀팩 사용");
	}
}

class Tank extends Unit {
	
	boolean mode;
	
	void move(int x, int y) {
		System.out.println("탱크 : x=" + x + ", y=" + y);
	}
	void sizMode() {
		mode = true;
		System.out.println("시즈모드");
	}
}

class DropShip extends Unit {
	void move(int x, int y) {
		System.out.println("드랍쉽 : x=" + x + ", y=" +y);
	}
}