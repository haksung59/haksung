package com.hk.app;

public class BallUtil extends Shape3DVo{
	
	//x y z 에 대한 변수 사용 가능.
	
	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double calVolume() {
		double V = 4.00/3.00 * Math.PI * Math.pow(radius, 3);
		return V;
	}

}
