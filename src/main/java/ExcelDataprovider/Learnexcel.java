package ExcelDataprovider;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import TestcaseTestNG.CreateLead;

public class Learnexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");

		XSSFSheet sheet = book.getSheet("CreateLead");// get into sheet

		
		  XSSFRow row = sheet.getRow(1);
		  
		  XSSFCell cell = row.getCell(3);
		  
		  String value = cell.getStringCellValue(); 
		  
		  System.out.println(value);
		 
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(lastCellNum);

	
		// to get all row values 
		
		for (int i = 0; i <3 ; i++) {
			XSSFRow row2 = sheet.getRow(i);
			String CellValue = cell.getStringCellValue();
			
			System.out.println(CellValue);
			
			System.out.println("this is row data");
		}
	
		
		
		// to get all coulmn values
		
		/*for (int j = 0; j < lastCellNum; j++) 
		{
			//XSSFCell cell2 = sheet.getRow(0).getCell(lastCellNum);// mistake done
			XSSFCell cells = row.getCell(j);
			String CellValue1 = cells.getStringCellValue();
			System.out.println(CellValue1);
			
			
		}}*/
		
		
		
		
		
		  book.close();

	}

}
