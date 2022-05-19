package aaa.practiceJava.Object_Oriented_Programming;

public class Factorial {

	public static void main(String[] args) {
		
		int result = factorial(4);
		
		System.out.println("4! = " + result);

	}
	
	static int factorial(int n) {
		int result = 0;
		if(n == 1)
			result = 1;
		else
			result = n * factorial(n-1);
		
		return result;
	}

}
