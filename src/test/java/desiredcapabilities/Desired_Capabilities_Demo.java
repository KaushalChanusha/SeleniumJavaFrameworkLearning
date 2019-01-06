package desiredcapabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desired_Capabilities_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set Up DesiredCapabilities for handling browser protection mode
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		caps.setBrowserName("internet explorer");
		
		String projPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.ie.driver", projPath+"/drivers/iedriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("abcd");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		driver.close();
		driver.quit();
	}

}
