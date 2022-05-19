package com.hk.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapHash1 {

	public static void main(String[] args) {
		
		Map hash = new HashMap();	// 키 - 값 매칭해서 저장
		
		hash.put(20210001, "김가네");
		hash.put(20210002, "박가네");
		hash.put(20210003, null);
		
		Iterator itr = hash.keySet().iterator();	//keySet호출하고 반복자를 생성
		while(itr.hasNext()) {
			//키값
			int key = (int)itr.next();
			String val = (String)hash.get(key);
			System.out.println("키:"+key + ", 값:"+val);
		}
	}

}
