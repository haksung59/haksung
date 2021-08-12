package com.hk.app;

public class MetthodArrRG {
	
	//제한된 타입으로 메소드 정의하는 경우 -> Comparable 제한을 함 why? 비교를 숫자 문자로 제한
		public static <T extends Comparable> void Sort(T[] arr) {	// 리턴타입은 없기 때문에 void를 했습니다.
			//비교를 해서 정렬
			for(int i=arr.length; i>1; i--) {	//4
				for(int j=1; j<i; j++) {	// 1~2
					// 비교하기
					// 인덱스 0 1 2 3
					// 값       a c b d
					// 조건은 뒤에 것이 더 작은 경우
					if(arr[j].compareTo(arr[j-1])<0) {	// 1번과 0번째 비교
						T temp = arr[j-1];	// 앞의 것을 임시 저장
						arr[j-1] = arr[j];	// 
						arr[j] = temp;
						
					}
				}
				
			}
		}

	public static void main(String[] args) {
		
		String[] player = {"박지성", "유상철", "홍명보", "김정호", "이영표"};
		System.out.println("현재 선수명단 출력");
		for(int i=0; i<player.length; i++) {
			System.out.print(player[i] + " ");
		}
		System.out.println();
		System.out.println("이름순으로 선수명단 출력");
		Sort(player);
		for(int i=0; i<player.length; i++) {
			System.out.print(player[i]+" ");
		}

	}

}
