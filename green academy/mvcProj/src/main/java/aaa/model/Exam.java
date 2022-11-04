package aaa.model;

import lombok.Data;

@Data
public class Exam implements Comparable<Exam>{

	String pname, grade;
	
	int kor, eng, mat, tot, avg;
	
	public void calc() {
		System.out.println("계산해 주세요");
		
		tot = kor + eng + mat;
		avg = tot/3;
		
		grade = "가가가가가가양미우수수".charAt(avg/10)+"";
	}

	@Override
	public int compareTo(Exam o) {
		// TODO Auto-generated method stub
		
		int res = o.avg - avg;
		
		if(res==0) {
			res = pname.compareTo(o.pname);
		}
		
		return res;
	}
	
}
