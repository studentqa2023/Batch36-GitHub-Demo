package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeReadExcel {
	
	FileInputStream fis;
	XSSFWorkbook wb;
	
	public void getExcelData(int rowIndex, int columnIndex) {
		
		//Excel location or the file path
		File  file = new  File("./src/main/resources/LogIn_Test_Cases.xlsx");
		
		//Convert data to stream
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//Apache POI methods to read the excel
		//1st step =read the whole excel as a book = workbook
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Call my sheet as worksheet & get the sheet by index or sheet name
		XSSFSheet sht = wb.getSheetAt(0);//By index
		
		XSSFSheet sht2 = wb.getSheet("Practice1");//By sheet name
		
		//Find all rows
		int totalRow = sht.getPhysicalNumberOfRows();
		
		//Loop all the rows
		for(int i=0; i<totalRow; i++) {
			if(i==rowIndex) {
				Row row = sht.getRow(i);
				
				//Total number of columns
				row.getLastCellNum();
				
				//Start another loop for column
				for(int j=0; j<totalRow; j++) {
					if(j==columnIndex) {
						Cell cell = row.getCell(j);
						
						System.out.println(cell.getStringCellValue());
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		PracticeReadExcel obj = new PracticeReadExcel();
		obj.getExcelData(3, 3);
	}
	

}
