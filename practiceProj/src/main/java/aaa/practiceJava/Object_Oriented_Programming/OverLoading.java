package aaa.practiceJava.Object_Oriented_Programming;

public class OverLoading {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		
		int ia = 1;
		int ib = 2;
		
		long la = 3;
		long lb = 4;
		
		System.out.println(mm.add(ia,ib));
		System.out.println(mm.add((int)la,lb));

	}

}

class MyMath {
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, long b) {
		return a+(int)b;
	}
	//매개변수에 따라
}