package org.in;

import java.util.Arrays;

public class B {
	public static void main(String[] args) {
		int a[] = { 7, 5, 2, 8, 9, 1 };
		//int x = 0;
		
		Arrays.sort(a);
		
		for (int i : a) {
			System.out.println(i);
		}
		

		/*for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}*/

	}
}