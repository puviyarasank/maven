package com.datadivern.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data2
{
	public static void readparticulardata() throws IOException  {
	  File f = new File("C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\dataset\\dataset.xlsx");
	  FileInputStream fi = new FileInputStream(f);
	  Workbook w = new XSSFWorkbook(fi);
	  Sheet sh = w.getSheetAt(0);
	  for(int i=0;i<sh.getPhysicalNumberOfRows();i++) {
	  Row row = sh.getRow(i);
	//  System.out.println(row);
	  for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
	  Cell cell = row.getCell(j);
	  CellType cellt = cell.getCellType();
	  if(cellt.equals(CellType.STRING)) {
		  String string = cell.getStringCellValue();
		  System.out.println(string);
	  }
	  else if(cellt.equals(CellType.NUMERIC)) {
		  double numeric = cell.getNumericCellValue();
		  int num = (int) numeric;
	    System.out.println(num);}}}
	}
	public static void write_data() throws IOException {
		File f = new File("C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\dataset\\dataset.xlsx");
		FileInputStream fi = new FileInputStream( f);
		Workbook w = new XSSFWorkbook(fi);
		Scanner sc = new Scanner(System.in);
		w.getSheetAt(0).getRow(0).createCell(2).setCellValue(sc.nextLine());
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("sucess");
	}
public static void main(String[] args) throws IOException {
	  readparticulardata();
	 write_data();
	
}
}
