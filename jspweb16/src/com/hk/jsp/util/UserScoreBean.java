package com.hk.jsp.util;
import com.hk.jsp.vo.UserScoreVo;

public class UserScoreBean {
	
	private int sum = 0;
	//UserScoreVo 받아서 합계
	public int CalculateSum(UserScoreVo usvo) {
		int result=0;
		//합계를 구하고
		result = usvo.getEng() + usvo.getMat() + usvo.getSci();
		sum = result;
		return result;
	}
	
	//UserScoreVo 평균을 반환하는 함수
	public double CalculateAvg() {
		double avg=0;
		avg = sum / 3.0;
		return avg;
	}

}
