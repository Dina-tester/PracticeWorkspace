package org.in;

import java.io.File;
import java.io.IOException;

public class FileOperationJava {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\dinesh\\Desktop\\FileOperationPractice");
		
		boolean exists = f.exists();
		System.out.println("Before creeating folder :"+exists);
		
		if (exists== false) {
			f.mkdir();
		}
		
		boolean exists2 = f.exists();
		System.out.println("After creating folder\t" + exists2);
		
		
		
//		boolean createNewFile = f.createNewFile();
//		System.out.println(createNewFile);
//		

		
		 
		
		
		
	}

}
