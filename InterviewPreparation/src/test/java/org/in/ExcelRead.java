package org.in;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		FileInputStream str = new FileInputStream("E:\\Ellipse - Gtech\\IDE program\\Pratics Workspace\\InterviewPreparation\\xcelx\\Book1.xlsx");
		Workbook w = new XSSFWorkbook(str);
		Sheet s = w.getSheet("Excel Weite");
		Row r = s.getRow(2);
		Cell c = r.getCell(2);
		int type = c.getCellType();
		System.out.println(type);
	}
	
	
	

}
