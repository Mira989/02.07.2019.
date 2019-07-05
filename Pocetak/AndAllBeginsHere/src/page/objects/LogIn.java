package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	
	public static final String PAGE_URL = "http://localhost/izlet/";
	private static final String USERNAME = "//input[@placeholder='username']";
	private static final String PASSWORD = "//input[@placeholder='password']";
	private static final String LOGIN = "//input[@name='login']";
	private static final String LOG_OUT = "//a[@id='logoutBtn']";
	
	
	public static void openLogInPage(WebDriver dr) {
		if (!dr.getCurrentUrl().equals(PAGE_URL)) {
			navigateToLogIn(dr);
		}
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
			
	// LogIn
			public static WebElement getLogIn(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(LOGIN));
				return wb;
			}

			public static void clickLogIn(WebDriver dr) {
				getLogIn(dr).click();
			}
			
	//LogOut
			public static WebElement getLogOut(WebDriver dr) {
				WebElement wb = dr.findElement(By.xpath(LOG_OUT));
				return wb;
			}

			public static void clickLogOut(WebDriver dr) {
				getLogOut(dr).click();
			}
			
	// Navigate To
			public static void navigateToLogIn(WebDriver dr) {
				dr.navigate().to(HomePage.PAGE_URL);
			}
}
