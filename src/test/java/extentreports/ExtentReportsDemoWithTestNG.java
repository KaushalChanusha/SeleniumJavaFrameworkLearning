package extentreports;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemoWithTestNG {

	ExtentHtmlReporter htmlReporter = null;
	ExtentReports extent = null;
	WebDriver driver = null;
	
	@BeforeSuite
	public void setUp() {
		// start reporters
		htmlReporter = new ExtentHtmlReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
	}

	@BeforeTest
	public void setUpTest() {

		String projPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projPath + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void test1() throws IOException {
		// creates a toggle for the given test, adds all log events under it
		ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		
		driver.get("https://www.google.com/");
		// pass(details)
		test.pass("Navigate to google.com");
		
		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterTest
	public void tearDownTest() {

		// close the browser
		driver.close();
		driver.quit();
		System.out.println("Test Successfuly Completed");

	}

	
	@AfterSuite
	public void tearDown() {

		// calling flush writes everything to the log file
		extent.flush();
	}
}
