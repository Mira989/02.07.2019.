package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Post {
	public static final String PAGE_URL = "http://localhost/izlet/dashboard.php#";
	public static final String NEW_POST = "//a[contains(text(),'Make a post')]";
	public static final String POST_TITLE = "//input[@placeholder='Naziv']";
	public static final String LOCATION = "//input[@placeholder='Lokacija']";
	public static final String BROWSE_PICTURE = "//label[contains(text(),'Browse...')]";
	public static final String CHOOSE_TRANSPORT = "//div[@class='popupPost']//select[@name='transport']";
	public static final String TEXT = "//textarea[@placeholder='Opis']";
	public static final String POST_BUTTON = "//div[@class='popupPost']//input[@name='postSubmit']";

	// PostTitle
				public static WebElement getPostTitle(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(POST_TITLE));
					return wb;
				}

				public static void clickPostTitle(WebDriver dr) {
					getPostTitle(dr).click();
				}

				public static void sendKeysPostTitle(WebDriver dr, String str) {
					getPostTitle(dr).sendKeys(str);
				}
				
	// Location
				public static WebElement getLocation(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(LOCATION));
					return wb;
				}

				public static void clickLocation(WebDriver dr) {
					getLocation(dr).click();
				}

				public static void sendKeysLocation(WebDriver dr, String str) {
					getLocation(dr).sendKeys(str);
				}

				
	// BrowsePicture
				public static WebElement getBrowsePicture(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(BROWSE_PICTURE));
					return wb;
				}

				public static void clickBrowsePicture(WebDriver dr) {
					getBrowsePicture(dr).click();
				}
				
				
	//ChooseTransport
				public static WebElement getSelect(WebDriver dr) {
					WebElement wb=dr.findElement(By.xpath(CHOOSE_TRANSPORT));
					return wb;
				}
				public static void selectTransport(WebDriver dr,String transport) {
					Select sel= new Select(getSelect(dr));
					sel.selectByVisibleText(transport);
				}
				
	// EnterText
				public static WebElement getEnterText(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(TEXT));
					return wb;
				}

				public static void clickPEnterText(WebDriver dr) {
					getEnterText(dr).click();
				}

				public static void sendKeysEnterText(WebDriver dr, String str) {
					getEnterText(dr).sendKeys(str);
				}

	// PostButton
				public static WebElement getPostButton(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(POST_BUTTON));
					return wb;
				}

				public static void clickPostButton(WebDriver dr) {
					getPostButton(dr).click();
				}


	

}
