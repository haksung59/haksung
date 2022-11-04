package aaa.practiceJava.Object_Oriented_Programming;

public class MathTest {

	public static void main(String[] args) {
		//클래스 메소드 호출.
		System.out.println(Matht.add(200, 100));
		System.out.println(Matht.subtract(200, 100));
		System.out.println(Matht.multiply(200, 100));
		System.out.println(Matht.divide(200, 100));
		
		System.out.println("---------------------");
		
		//인스턴스 메소드 호출.
		Matht math = new Matht();
		math.a = 200;
		math.b = 100;
		
		System.out.println(math.add());
		System.out.println(math.subtract());
		System.out.println(math.multiply());
		System.out.println(math.divide());
	}

}

class Matht {
	long a, b;
	
	long add() {
		return a + b;
	}
	
	long subtract() {
		return a - b;
	}
	
	long multiply() {
		return a * b;
	}
	
	double divide() {
		return a / b;
	}
	

	static long add(long a, long b) {
		return a + b;
	}
	
	static long subtract(long a, long b) {
		return a - b;
	}
	
	static long multiply(long a, long b) {
		return a * b;
	}
	
	static double divide(long a, long b) {
		return a / b;
	}
}