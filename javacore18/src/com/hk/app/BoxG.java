package com.hk.app;

//ArrayList<double> datas = new ArrayList<double>
public class BoxG<T> {
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	//테스트 메인
	public static void main(String[] args) {
		
		BoxG<Integer> b = new BoxG<Integer>();		//일단 컴파일 데이터타입을 미리 알고 있음.-속도 up
		b.setData(50);
		
		BoxG<String> b2 = new BoxG<String>();
		b2.setData("오라클월드");
		
		Integer num = b.getData();	// 형변환 안해도 됨.
		String name = b2.getData();	// 편리하다.
		
		System.out.println(name + ":" + num);
	}

}
