package com.datadivern.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void write_data() throws IOException {
		File f = new File("C:\\Users\\PUVI\\eclipse-workspace\\mavenproject\\dataset\\dataset.xlsx");
		FileInputStream fi = new FileInputStream( f);
		Workbook w = new XSSFWorkbook(fi);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
		w.createSheet("non").createRow(i).createCell(i).setCellValue(sc.nextLine());
		}
				
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);
		System.out.println("sucess");
	}
	public static void main(String[] args) throws IOException {
		write_data();
	}

}
