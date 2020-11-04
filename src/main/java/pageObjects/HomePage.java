package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	//***************************Initialize all objects***************************
	By destination = By.xpath("//input[@name='q-destination']");
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	//****************Create methods for every initialized object and return the WebElement
	public WebElement destination()
	{
		return driver.findElement(destination);
	}
	
	
	
	
	
}
