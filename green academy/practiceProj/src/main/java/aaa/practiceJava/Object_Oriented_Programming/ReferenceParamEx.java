package aaa.practiceJava.Object_Oriented_Programming;

public class ReferenceParamEx {

	public static void main(String[] args) {
		
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}

		
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		System.out.println("sum = " + sumArr(arr));
		System.out.println("avg = " + avgArr(arr));
	}
	
	static void printArr(int[] arr) {
		
		System.out.print("arr : {");
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1) {
				System.out.println(arr[i] + "}");
			}else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
	
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] >arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	static int sumArr(int[] arr) {
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum;
		
	}
	
	static int avgArr(int[] arr) {
		int avg = sumArr(arr) / arr.length;
		return avg;
	}

}
