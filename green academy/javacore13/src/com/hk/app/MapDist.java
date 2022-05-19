package com.hk.app;

public class MapDist {
	
	int x1;
	int y1;
	int x2;
	int y2;
	double dist;
	
	public MapDist(int x1,int y1,int x2,int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	// 두 좌표의 거리 계산
	public void calDistance() {
		dist = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}
	
	// 게터와 세터는 필요하면 작성 바랍니다.

}
