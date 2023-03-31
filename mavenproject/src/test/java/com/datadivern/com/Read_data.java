package com.datadivern.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public  class Read_data {
  public static void readparticulardata() throws IOException {
	  File f = new File("C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\dataset\\dataset.xlsx");
	  FileInputStream fi = new FileInputStream(f);
	  Workbook w = new XSSFWorkbook(fi);
	  Sheet sh = w.getSheetAt(0);
	  Row row = sh.getRow(1);
	  Cell cell = row.getCell(0);
	  CellType cellt = cell.getCellType();
	  if(cellt.equals(CellType.STRING)) {
		  String string = cell.getStringCellValue();
		  System.out.println(string);
	  }
	  else if(cellt.equals(CellType.NUMERIC)) {
		  double numeric = cell.getNumericCellValue();
		  int num = (int) numeric;
		  System.out.println(num);
	  }
	  
	}

  public static void main(String[] args) throws IOException {
	  readparticulardata();
	
}
}
