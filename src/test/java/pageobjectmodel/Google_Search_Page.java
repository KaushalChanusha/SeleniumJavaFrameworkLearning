package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_Search_Page {
	
	private  static WebElement element = null;

	public static WebElement textBox_Search(WebDriver driver){
		
		element = driver.findElement(By.name("q"));
		return element;
	}
	
	public static WebElement button_Search(WebDriver driver){
		
		element = driver.findElement(By.name("btnK"));
		return element;
	}
}
