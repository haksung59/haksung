package project1;

public class Test1 {

	public static void main(String[] args) {
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
