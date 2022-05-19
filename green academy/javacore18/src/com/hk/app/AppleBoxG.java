package com.hk.app;

// Apple 이라는 클래스가 들어가는 제네릭으로 제한하는 경우
public class AppleBoxG<T extends Apple> {
	
	private T data;
	

	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public static void main(String[] args) {
		
		//AppleBoxG<Product> myApp = new AppleBoxG<Product>();	//Product는 제한됨
		AppleBoxG<Apple> myApp = new AppleBoxG<Apple>();		//Apple 사용 가능
		// T extends 타입
		myApp.setData(new Apple("Red", 1000));
		
		//출력은
		Apple temp = myApp.getData(); // 형변환 없지요
		System.out.println("사과색 : "+temp.Color + " 가격 : "+temp.price);
		

	}

}
