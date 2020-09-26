package org.in;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException   {
		File loc = new File("C:\\Users\\dinesh\\Desktop\\Book1.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("Excel Weite");
		Row r = s.createRow(0);
		Cell c = r.createCell(1);
		c.setCellValue(15);
		Cell c1 = r.createCell(2);
		//c.setCellFormula(formu);
		
		
		
		c1.setCellValue(10);
		//c.setCellType(15);
		FileOutputStream f = new FileOutputStream(loc);
		w.write(f);
		System.out.println("Wrote Sucessfully");

	}
}
