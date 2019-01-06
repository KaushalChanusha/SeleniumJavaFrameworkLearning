package workwithexcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Demo2 {
	
	public static void main(String[] args) {
		
		//getrowCount();
		getCellDataString();
		getCellDataNumber();
		
	}
	
	public static void getrowCount(){
		
		try {
			//create reference for workbook
			XSSFWorkbook workbook = new XSSFWorkbook(System.getProperty("user.dir")+"/excel/data.xlsx");
			//create reference for work sheet
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			//get row count
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows: "+rowCount);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void getCellDataString(){
		try {
			//create reference for workbook
			XSSFWorkbook workbook = new XSSFWorkbook(System.getProperty("user.dir")+"/excel/data.xlsx");
			//create reference for work sheet
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			//get cell data
			String cellData = sheet.getRow(0).getCell(2).getStringCellValue();
			System.out.println(cellData);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	public static void getCellDataNumber(){
		try {
			//create reference for workbook
			XSSFWorkbook workbook = new XSSFWorkbook(System.getProperty("user.dir")+"/excel/data.xlsx");
			//create reference for work sheet
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			//get cell data
			double cellData = sheet.getRow(1).getCell(2).getNumericCellValue();
			System.out.println(cellData);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
