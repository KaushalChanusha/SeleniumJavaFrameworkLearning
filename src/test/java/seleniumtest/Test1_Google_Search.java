package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Google_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
	}

	public static void googleSearch() {

		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath + "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// go to google.com
		driver.get("https://www.google.com/");

		// Enter a text on search textbox
		driver.findElement(By.name("q")).sendKeys("automation step by step by raghav pal");

		// Click on search button
		// driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		// close the browser
		driver.close();
	}

}
