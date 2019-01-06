package extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		// start reporters
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentreports.html");

		// create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		// creates a toggle for the given test, adds all log events under it
		ExtentTest test1 = extent.createTest("Google Search Test One",
				"This is for validate google search functionality");

		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		// log(Status, details)
		test1.log(Status.INFO, "Starting Test Case");
		
		driver.get("https://www.google.com/");
		// pass(details)
		test1.pass("Navigate to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Chanusha");
		test1.pass("Enter the text in the searchbox");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("Pressed Keyboard Enter button");
		
		driver.close();
		driver.quit();
		test1.pass("Closed the Browser");
		
		// info(details)
		test1.info("Test Completed");

		// calling flush writes everything to the log file
		extent.flush();
		
	}
	
	
	
	
}
