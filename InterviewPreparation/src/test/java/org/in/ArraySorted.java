package org.in;

import java.util.Set;
import java.util.TreeSet;

public class ArraySorted {
	public static void main(String[] args) {
		int a[]= {3,2,3,9,9,6,4};
		
		Set ts = new TreeSet();
		
		for (int i = 0; i < a.length; i++) {
			
			ts.add(a[i]);
		}
		System.out.println(ts);
		
		
	}

}




