package com.leaftaps.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {
	
	public static Object[][] readExcelData(String excelName) throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/"+excelName+".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[rowcount][colcount];
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for( int j=0;j<colcount;j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j] = stringCellValue;
			}
		}
		book.close();
		return data;
	}

}
