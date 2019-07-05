package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static final String PAGE_URL = "http://localhost/izlet/";
	
	//Open Browser on Home Page "Izlet"
		public static void openHomePage(WebDriver dr) {
			dr.get(PAGE_URL);
		}
		
	// Navigate To Home Page 
		public static void navigateToHomePage(WebDriver dr) { 
			dr.navigate().to(PAGE_URL);
		}
}
