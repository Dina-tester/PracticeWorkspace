package org.in;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class StringCount {
	public static void main(String[] args) {
		//String s = "selenium,java,string,selenium";
		String s ="JJaaVVV";
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		//String[] split = s.split(",");
		char[] split = s.toCharArray();

		for (char ch : split) 
		{
			if (hm.containsKey(ch)) {
				int in = hm.get(ch);
				hm.put(ch,in+1);
				
			}
			else {
				hm.put(ch,1);
			}
		}
		System.out.println(hm);
		}
	}


