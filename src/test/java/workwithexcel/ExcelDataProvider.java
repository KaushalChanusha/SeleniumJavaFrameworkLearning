package workwithexcel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	WebDriver driver = null;
	@BeforeTest
	public void setUpTest() {

		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test(dataProvider = "test1Data")
	public void test1(String username,String password){
		
		System.out.println(username+""+password);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).sendKeys(Keys.RETURN);
	}
	
	@DataProvider(name = "test1Data")
	public Object[][] getTestData(){
		
		Object data[][] = testdata("/excel/data.xlsx", "Sheet1");
		return data;
	}
	
	public Object[][] testdata(String excelPath,String sheetName){
		
		Excel_Demo_With_TestNG excel = new Excel_Demo_With_TestNG(excelPath, sheetName);
		
		int rowCount = excel.getrowCount();
		int colCount = excel.getColCount();
		
		Object data[] [] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount;i++){
			
			for(int j=0; j<colCount;j++){
				
				String cellData = Excel_Demo_With_TestNG.getCellDataString(i, j);
				//System.out.print(cellData+"|");
				data[i-1][j] = cellData;
			}
			
			System.out.println();
		}
		return data;
	}

}
