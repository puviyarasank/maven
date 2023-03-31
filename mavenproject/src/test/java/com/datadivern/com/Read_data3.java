package com.datadivern.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class Read_data3 {
	public   static void read() throws InvalidFormatException, IOException {
		File f = new File("C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\dataset\\dataset.xlsx");
		FileInputStream fi = new FileInputStream(f);

		Workbook wo = new XSSFWorkbook(fi) ;
		Sheet at = wo.getSheetAt(0);
		for ( int i=0;i<at.getPhysicalNumberOfRows();i++) {
			Row row = at.getRow(i);
			for (int j=0;j<row.getPhysicalNumberOfCells();j++) {
				
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				if (type.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				}
				else if(type.equals(CellType.NUMERIC)) {
					
					double  cellValue = cell.getNumericCellValue();
					int val = (int)  cellValue;
					System.out.println(val);
				}
				
				
				
			}
			
		}
		

	}
	public static void main(String[] args) throws InvalidFormatException, IOException {
		read();
		
	}
		
	}
			