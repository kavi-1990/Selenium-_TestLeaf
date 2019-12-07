package ExcelDataprovider;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelbasic 
{

   public static String[][] main(String[] args) throws IOException 
		
		{
			  
	   		
			XSSFWorkbook book=new XSSFWorkbook("./data1/Book.xlsx");
	   		XSSFSheet sheetAt = book.getSheetAt(0);
	   		int lastRowNum = sheetAt.getLastRowNum();
	   		System.out.println(lastRowNum);
	   		
	   		short lastCellNum = sheetAt.getRow(0).getLastCellNum();
	   		System.out.println(lastCellNum);
	   		
	   		String[][] data=new String[lastRowNum][lastCellNum];
	   		for (int i = 0; i < lastRowNum; i++) {
				XSSFRow row = sheetAt.getRow(i);
				
				for (int j = 0; j < lastCellNum; j++) 
				{
					XSSFCell cell = row.getCell(j);
					String CellValue = cell.getStringCellValue();// bcoz of this  change main method
																// to string and once main method changed
									                           // to string it should retun data in excel.
																//so add string [][] row and column
					
					data[i][j]=CellValue;
				}
					
				
			}
			book.close();
			//return CellValue ;
	   		
			return data;
} 
		
		
}



