package propertiesfile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo_With_Properties {

	public static String browserName = null;

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		
		PropertiesFile.getProperties();

		if (browserName.equalsIgnoreCase("chrome")) {

			String projPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projPath + "/drivers/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browserName.equalsIgnoreCase("firefox")) {

			String projLocation = System.getProperty("user.dir");

			// Run a Test from FirefoxBrowser
			System.setProperty("webdriver.gecko.driver", projLocation + "/drivers/geckodriver/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
		}

	}

	@Test
	public void googleSearch() {

		// go to google.com
		driver.get("https://www.google.com/");

		// Enter a text on search textbox
		driver.findElement(By.name("q")).sendKeys("automation step by step by raghav pal");

		// Click on search button
		// driver.findElement(By.name("btnk")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDown() {

		// close the browser
		driver.close();
		driver.quit();
		System.out.println("Test Successfuly Completed");

	}

}
