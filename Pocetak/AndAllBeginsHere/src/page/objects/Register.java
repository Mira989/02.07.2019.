package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
	public static final String PAGE_URL = "http://localhost/izlet/";
	private static final String FIRSTNAME = "//input[@name='firstname']";
	private static final String LASTNAME = "//input[@name='lastname']";
	private static final String USERNAME = "//div[@class='register_form']//input[@name='username']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String PASSWORD = "//div[@class='register_form']//input[@name='password']";
	private static final String REGISTER = "//input[@id='blue_btn']";

	// FirstName
		public static WebElement getFirstName(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(FIRSTNAME));
			return wb;
		}

		public static void clickFirstName(WebDriver dr) {
			getFirstName(dr).click();
		}

		public static void sendKeysFirstName(WebDriver dr, String str) {
			getFirstName(dr).sendKeys(str);
		}
		
		// LastName
		public static WebElement getLastName(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(LASTNAME));
			return wb;
		}

		public static void clickLastName(WebDriver dr) {
			getLastName(dr).click();
		}

		public static void sendKeysLastName(WebDriver dr, String str) {
			getLastName(dr).sendKeys(str);
		}
		
		// UserName
		public static WebElement getUserName(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(USERNAME));
			return wb;
		}

		public static void clickUserName(WebDriver dr) {
			getUserName(dr).click();
		}

		public static void sendKeysUserName(WebDriver dr, String str) {
			getUserName(dr).sendKeys(str);
		}
		
		// Email
		public static WebElement getEmail(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(EMAIL));
			return wb;
		}

		public static void clickEmail(WebDriver dr) {
			getEmail(dr).click();
		}

		public static void sendKeysEmail(WebDriver dr, String str) {
			getEmail(dr).sendKeys(str);
		}
		
		// Password
		public static WebElement getPassword(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(PASSWORD));
			return wb;
		}

		public static void clickPassword(WebDriver dr) {
			getPassword(dr).click();
		}

		public static void sendKeysPassword(WebDriver dr, String str) {
			getPassword(dr).sendKeys(str);
		}
		
		// Register
		public static WebElement getRegister(WebDriver dr) {
			WebElement wb = dr.findElement(By.xpath(REGISTER));
			return wb;
		}

		public static void clickRegister(WebDriver dr) {
			getRegister(dr).click();
		}

		// Navigate To
				public static void navigateToRegistration(WebDriver dr) {
					dr.navigate().to(HomePage.PAGE_URL);
				}
}
