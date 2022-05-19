package com.hk.app;

public class Box {
	
	private Object data;
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}

	public static void main(String[] args) {
		
		Box b = new Box();
		int score = 80;
		b.setData(score);
		
		Box b2 = new Box();
		String name = "자바월드";
		b2.setData(name);
		
		int rstScore = 0;
		String rstName = "";
		
		rstScore = (int)b.getData();
		rstName = (String)b2.getData();
		
		System.out.println(rstName + ":" + rstScore);

	}

}
