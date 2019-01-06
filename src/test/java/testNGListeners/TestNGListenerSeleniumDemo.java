package testNGListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.WebStorage;
import org.testng.annotations.Test;

//Set the Listener class by annotation
//If we are runs through testng.xml no need to define this annotation
//@Listeners(testNGListeners.TestNGListeners.class)
public class TestNGListenerSeleniumDemo {
	@Test
	public void googleSearch() {
		System.out.println("I am inside Selenium Test");

		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath + "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// go to google.com
		driver.get("https://www.google.com/");

		// Enter a text on search textbox
		driver.findElement(By.name("q")).sendKeys("chanusha kaushal");

		// Click on search button
		// driver.findElement(By.name("btnk")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		// close the browser
		driver.close();

	}

}
