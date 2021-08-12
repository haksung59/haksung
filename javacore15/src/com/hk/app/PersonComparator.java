package com.hk.app;

import java.util.Comparator;

// comparator 인터페이스 - 기본정렬방식 바꿀 때
public class PersonComparator implements Comparator<PersonCompare>{

	@Override
	public int compare(PersonCompare o1, PersonCompare o2) {
		
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		//문자비교
		
		
		return name1.compareTo(name2);
	}
	

}
