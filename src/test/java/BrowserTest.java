import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String projLocation = System.getProperty("user.dir");
		
		//Run a Test from FirefoxBrowser
		//System.setProperty("webdriver.gecko.driver",projLocation+"/drivers/geckodriver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Run a Test from ChromeBroweser
		//System.setProperty("webdriver.chrome.driver",projLocation+"/drivers/chromedriver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Run a Test from IEBroweser
		System.setProperty("webdriver.ie.driver",projLocation+"/drivers/iedriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://google.com/");
		
		//Identify single WebElement
		WebElement searchItem = driver.findElement(By.id("lst-ib"));
		//Send the KeyboardInput
		searchItem.sendKeys("Chanusha");
		
		//Identify list of WebElements
		List<WebElement> listOfInputElements =  driver.findElements(By.xpath("//input"));
		int count = listOfInputElements.size();
		System.out.println("No of Input Elements ="+count);
		
		driver.close();
		
		
	}

}
