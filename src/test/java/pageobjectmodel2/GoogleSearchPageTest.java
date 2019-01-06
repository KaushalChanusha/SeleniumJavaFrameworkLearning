package pageobjectmodel2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}
	
	public static void googleSearch(){
		
		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects googlePgObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		
		googlePgObj.setTestinSearchBox("A B C D");
		
		googlePgObj.clickSearchButton();
		
		driver.close();
		
	}

}
