package aaa.practiceJava.Object_Oriented_Programming2;

abstract class Unit2 {
	String name;
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println(name + " : " +"stop");}
}

interface Fightable {
	void move(int x, int y);
	void attack(Fightable f2);
}
	
class Fighter extends Unit2 implements Fightable{
	
	Fighter(String name){
		this.name = name;
	}
	
	public void move(int x, int y) {
		System.out.println("x=" + x + ", y=" +y);
	}
	
	public void attack(Fightable f2) {
		System.out.println(name + " : " + f2 + "를 공격");
	}

	@Override
	public String toString() {
		return name;
	}
	
}

public class Abstract_Interface{

	public static void main(String[] args) {
		
		Fighter marine = new Fighter("마린");
		Fighter tank = new Fighter("탱크");
		marine.move(100, 200);
		marine.attack(tank);
		tank.attack(marine);
		marine.stop();
		tank.stop();
		
	}

}
