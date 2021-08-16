package aaa.practiceJava;

public class Array {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + " : " + arr[i] + " ");
		}
		int[] arr2 = {1,2,3,4,5,6,7,8,9};
		System.out.println();
		arr = arr2;			//배열의 크기가 같지 않아도 바꿀 수 있음.
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + " : " + arr[i] + " ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------");
		
		int[] num = {1,2,3};
		int[] num2 = {4,5,6,7,8};
		System.arraycopy(num, 0, num2, 1, 2);	//num[0]부터 2개를 num2[1]부터 num2로 가져오기
		for(int i=0; i<num2.length; i++) {
			if(i==num2.length-1) {
				System.out.print(num2[i]);
			}else 
				System.out.print(num2[i] + ", ");
		}
		System.out.println();
		System.out.println("---------------------------------------------");
		//배열 최댓값, 최솟값
		int[] n = {50,70,90,100,40,30,60};
		int max = n[0];
		int min = n[0];
		for(int i=0; i<n.length; i++) {
			if(n[i]>max) {
				max = n[i];
			}else if(n[i]<min) {
				min = n[i];
			}
		}
		System.out.println("max = " + max + "// min = " + min);
		
		int[] random_number = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i<1000; i++) {
			int random = (int)(Math.random()*10);
			int temp = random_number[0];
			random_number[0] = random_number[random];
			random_number[random] = temp;
		}
		for(int i=0; i<random_number.length; i++) {
			System.out.print(random_number[i] + " ");
		}
		
		System.out.println();
		
		//작은 > 큰 숫자 정렬
		int[] sort = {3,4,1,0,5,2};
		for(int i=0; i<sort.length-1; i++) {
			for(int j=i+1; j<sort.length; j++) {
				if(sort[i]>sort[j]) {
					int temp = sort[i];
					sort[i] = sort[j];
					sort[j] = temp;
				}
			}
		}
		for(int i=0; i<sort.length; i++) {
			System.out.print(sort[i] + " ");
		}
		
		System.out.println("---------counter---------");
		
		//counter
		int[] rand = new int[10];
		int[] counter = new int[10];
		for(int i=0; i<rand.length; i++) {
			rand[i] = (int)(Math.random()*10);
		}
		String strrand = "";
		for(int i=0; i<rand.length; i++) {
			strrand += Integer.toString(rand[i]);
		}
		System.out.println("카운트 할 숫자 : " + strrand);
		
		for(int i=0; i<rand.length; i++) {
			counter[rand[i]]++;
		}
		for(int i=0; i<rand.length; i++) {
			System.out.println(i + " : " + counter[i] + "개");
		}
		
		System.out.println("---------String class----------");
		
		//String class
		String words = "아리라앙아리라앙아라리요";
		System.out.println(words.charAt(5) + " // charAt(5)");
		System.out.println(words.length() + " // length()");
		System.out.println(words.substring(5) + " // substring(5)");
		System.out.println(words.substring(5, 7) + " // substring(5,7) : index 5(포함)부터 7(미포함)까지");
		char[] chwords = words.toCharArray();
		System.out.println(chwords[5]);
		
		
		
	}

}
