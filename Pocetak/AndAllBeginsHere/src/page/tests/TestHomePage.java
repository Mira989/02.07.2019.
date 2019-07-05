package page.tests;

import org.openqa.selenium.WebDriver;

import page.objects.HomePage;

public class TestHomePage {
	

	//Open Browser on Home Page "Izlet" and Test Actual and Expected URL 
		public static void openHomePage(WebDriver dr) {
			HomePage.openHomePage(dr);
			String actualURL=dr.getCurrentUrl();
			String expectedURL=HomePage.PAGE_URL;
			if (actualURL.equals(expectedURL))System.out.println("OK!");
			else System.out.println("Wrong page!");
		}
		
	// Navigate To Home Page and Test Actual and Expected URL
		public static void navigateToHomePage(WebDriver dr) {
			HomePage.navigateToHomePage(dr);
			String actualURL=dr.getCurrentUrl();
			String expectedURL=HomePage.PAGE_URL;
			if (actualURL.equals(expectedURL))System.out.println("OK!");
			else System.out.println("Wrong page!");
		}
}