package pageobjectmodel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectmodel.Google_Search_Page;

public class Google_Search_Test {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}

	public static void googleSearch() {

		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

		// go to google.com
		driver.get("https://www.google.com/");

		// Enter a text on search textbox
		Google_Search_Page.textBox_Search(driver).sendKeys("Chanuhsa");

		// Click on search button
		// driver.findElement(By.name("btnk")).click();
		Google_Search_Page.button_Search(driver).sendKeys(Keys.RETURN);

		// close the browser
		driver.close();
	}

}
