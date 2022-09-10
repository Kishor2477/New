package com.leaftaps.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	
	public static Object[][] readExcelFromData(String excelfileName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+excelfileName+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		XSSFRow row1 = sheet.getRow(0);
		short cellNum = row1.getLastCellNum();
		Object[][] data = new Object[rowNum][cellNum];
		for(int i=1;i<=rowNum;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<cellNum;j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j]=stringCellValue;
			}
			
		}
		book.close();
		return data;
	}

}
