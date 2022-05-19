package aaa.practiceJava.Object_Oriented_Programming;

public class InstanceBlock {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();

		System.out.println(p1.serialNo);
		System.out.println(p2.serialNo);
		System.out.println(p3.serialNo);

	}

}

class Product {
	static int count = 0;
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
}
