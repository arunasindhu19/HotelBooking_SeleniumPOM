package Hotels.CA.HotelBooking;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import resources.Base;

public class HomePageTest extends Base{
	
	@Test
	public void homepageAutomate() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://ca.hotels.com");
		
		//Passing the driver argument while creating object for class. This will help us instantiate the driver while running test cases 
		HomePage page = new HomePage(driver);
		page.destination().sendKeys("Toronto");
		
	}
	

}
