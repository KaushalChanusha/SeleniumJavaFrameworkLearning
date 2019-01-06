package workwithexcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Demo {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public Excel_Demo(String excelPath, String sheetName) {
		// TODO Auto-generated constructor stub
		try {
			// create reference for workbook
			workbook = new XSSFWorkbook(System.getProperty("user.dir") + excelPath);
			// create refesrence for work sheet
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		// getrowCount();
		getCellDataString(0, 2);
		getCellDataNumber(1, 2);

	}

	public static void getrowCount() {

		// get row count
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No of rows: " + rowCount);

	}

	public static void getCellDataString(int rowNum, int columnNum) {

		// get cell data
		String cellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
		System.out.println(cellData);

	}

	public static void getCellDataNumber(int rowNum, int columnNum) {

		// get cell data
		double cellData = sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
		System.out.println(cellData);

	}

}
