package workwithexcel;

public class Excel_Util {
	
	public static void main(String[] args) {
		
		Excel_Demo excel = new Excel_Demo(System.getProperty("user.dir")+"/excel/data.xlsx", "Sheet1");
		
		excel.getCellDataString(0, 2);
		excel.getCellDataNumber(1, 2);
	}
	

}
