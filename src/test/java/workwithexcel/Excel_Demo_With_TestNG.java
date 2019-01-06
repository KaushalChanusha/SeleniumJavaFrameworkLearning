package workwithexcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Demo_With_TestNG {

	/*public static void main(String[] args) {
		new Excel_Demo_With_TestNG("/excel/data.xlsx", "Sheet1");
		getrowCount();
		getColCount();
		//getCellDataString();
		getCellDataNumber();
	}*/

	XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public Excel_Demo_With_TestNG(String excelPath, String sheetName) {
		// TODO Auto-generated constructor stub
		try {
			// create reference for workbook
			workbook = new XSSFWorkbook(System.getProperty("user.dir") + excelPath);
			// create reference for work sheet
			sheet = workbook.getSheet(sheetName);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public static int getrowCount() {
		int rowCount = 0;
		try {

			// get row count
			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println("No of rows: " + rowCount);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rowCount;

	}

	public static int getColCount() {
		int colCount = 0;
		try {

			// get row count
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("No of columns: " + colCount);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return colCount;

	}

	public static String getCellDataString(int rowNum,int colNum) {
		String cellData = null;
		try {

			// get cell data
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cellData;

	}

	public static double getCellDataNumber(int rowNum,int colNum) {
		double cellData = 0;
		try {

			// get cell data
			cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cellData;

	}
}
