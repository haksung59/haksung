package aaa.practiceJava.Object_Oriented_Programming2;

public class BindingTest {

	public static void main(String[] args) {
		
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();

		//멤버변수는 참조변수의 타입에 따라 달라지지만, 메서드는 실제 인스턴스의 메서드(오버라이딩 된 메서드) 호출
		
	}

}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);
	}
}