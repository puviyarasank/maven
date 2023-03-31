package org.practice.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class School_data {
	private static final Class[] NullPointerException = null;
	public static void schooltest() throws IOException {
		
	 File f = new File("C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\dataset2\\School-Report-Card-And-Mark-Sheet-Template.xlsx");
	  FileInputStream fi = new FileInputStream(f);
	  Workbook w = new XSSFWorkbook(fi);
	  Sheet sh = w.getSheetAt(1);
	  for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
		  Row r = sh.getRow(i);
		  for ( int j=0;j<r.getPhysicalNumberOfCells();j++) {
			  Cell c = r.getCell(j);
			
			  CellType type = c.getCellType();
			  if(type.equals(CellType.STRING)) {
				  System.out.println(c.getStringCellValue());
			  }
			  else if(type.equals(CellType.NUMERIC)) {
				  System.out.println(c.getNumericCellValue());
			  }
		  }
	  }
	}
	public static void main(String[] args) throws IOException {
		
	schooltest();	

	}
	
	
}



