package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
			
			//Open/Enter into the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ReadData.Xlsx");
		
			
			// Get sheet
		XSSFSheet sheet = wb.getSheet("Sheet1"); 
		
			//Get row count  Second class
		int rowCount = sheet.getLastRowNum();      //Ctrl +2 L
		System.out.println(rowCount);
		
			//Get Column count   Second Class
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
			
				//Open 'for loop' for rows
			for (int i = 1; i <= rowCount ; i++) {
				
				// Get Row Count							// Select all right click then on surroander and choose option 2
				
		XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				// Get Column
					XSSFCell cell = row.getCell(j);
					// Action --- > Read Value
						String value = cell.getStringCellValue(); //Ctrl + 2 // + Value
							System.out.println(value);
				}
			}
		
		
		

	}

}
