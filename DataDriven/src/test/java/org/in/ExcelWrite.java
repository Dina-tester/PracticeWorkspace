package org.in;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws Throwable   {
		File Fileloction = new File("C:\\Users\\dinesh\\Desktop\\demo.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("dinesh");
		for (int i = 1; i <= 10; i++) {
			Row r = s.createRow(i);
			for (int j = 1; j <= 10; j++) {
				Cell c = r.createCell(j);
				c.setCellValue("ramesh");
				
			}
		}
		// Row r = s.createRow(0);
		// Cell c = r.createCell(1);
		// c.setCellValue("ramesh");
		FileOutputStream f = new FileOutputStream(Fileloction);
		w.write(f);

	}
}
