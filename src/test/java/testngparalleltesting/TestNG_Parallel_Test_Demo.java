package testngparalleltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Parallel_Test_Demo {
	
	WebDriver driver = null;
	//run single method using multiple treads
	@Test(threadPoolSize =3,invocationCount=3,timeOut=1000)
	public void test1() {
		System.out.println("This is test1"+"|"+Thread.currentThread().getId());
		String projLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projLocation+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void test2() {
		System.out.println("This is test2"+"|"+Thread.currentThread().getId());
		String projLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projLocation+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
	}
	
	@Test
	public void test3() {
		System.out.println("This is test3"+"|"+Thread.currentThread().getId());
		String projLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projLocation+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com/");
	}


}
