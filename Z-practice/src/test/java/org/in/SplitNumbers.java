package org.in;

public class SplitNumbers {

	public static void main(String[] args) {
		
	Double d =1234.5;
	String s = Double.toString(d);
	String[] split = s.split("\\.");
	
	int parseInt1 = Integer.parseInt(split[0]);
	int parseInt2 = Integer.parseInt(split[1]);
		
	System.out.print(parseInt1 + " "+parseInt2);
	System.out.println("");
//	System.out.print(parseInt2);

	

	}

}
