package pageobjectmodel2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

	WebDriver driver = null;
	
	By textBox_search = By.id("lst-ib");
	By search_btn = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void setTestinSearchBox(String text){
		
		driver.findElement(textBox_search).sendKeys(text);
	}
	
	public void clickSearchButton(){
		
		driver.findElement(search_btn).sendKeys(Keys.RETURN);
	}
}
