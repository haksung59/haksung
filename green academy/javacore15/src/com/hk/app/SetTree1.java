package com.hk.app;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTree1 {

	public static void main(String[] args) {
		
		Set tree = new TreeSet();
		
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random()*10);
			tree.add(x);
		}
		
		Iterator itr = tree.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
