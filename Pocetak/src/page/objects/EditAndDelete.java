package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditAndDelete {
	public static final String PAGE_URL = "http://localhost/izlet/dashboard.php#";
	public static final String OPTIONS = "//i[@class='fas fa-ellipsis-v']";
	public static final String EDIT = "//i[@class='fas fa-edit']";
	public static final String EDIT_TITLE = "//input[@id='title']";
	public static final String EDIT_LOCATION = "//i[@class='fas fa-edit']";
	public static final String EDIT_PICTURE = "//i[@class='fas fa-edit']";
	public static final String EDIT_TRANSPORT = "//i[@class='fas fa-edit']";
	public static final String EDIT_TEXT = "//i[@class='fas fa-edit']";
	public static final String POST_BUTTON = "//i[@class='fas fa-edit']";
	public static final String DELETE = "//i[@class='fas fa-trash-alt']";
	
	
	// OptionsButton
			public static WebElement getOptionsButton(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(OPTIONS));
						return wb;
				}

				public static void clickOptionsButton(WebDriver dr) {
						getOptionsButton(dr).click();
					}

	// EditTitle
				public static WebElement getEditTitle(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(EDIT_TITLE));
					return wb;
				}

				public static void clickEditTitle(WebDriver dr) {
					getEditTitle(dr).click();
				}

				public static void sendKeysEditTitle(WebDriver dr, String str) {
					getEditTitle(dr).sendKeys(str);
				}
				
				
		// EditLocation
				public static WebElement getEditLocation(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(EDIT_LOCATION));
					return wb;
				}

				public static void clickEditLocation(WebDriver dr) {
					getEditLocation(dr).click();
				}

				public static void sendKeysEditLocation(WebDriver dr, String str) {
					getEditLocation(dr).sendKeys(str);
				}
				
				
		// EditPicture
				public static WebElement getEditPicture(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(EDIT_PICTURE));
					return wb;
				}

				public static void clickEditPicture(WebDriver dr) {
					getEditPicture(dr).click();
				}
				
		//EditTransport
				public static WebElement getSelect(WebDriver dr) {
					WebElement wb=dr.findElement(By.xpath(EDIT_TRANSPORT));
					return wb;
				}
				public static void selectTransport(WebDriver dr,String transport) {
					Select sel= new Select(getSelect(dr));
					sel.selectByVisibleText(transport);
				}
				
				
		// EditText
				public static WebElement getEditText(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(EDIT_TEXT));
					return wb;
				}

				public static void clickPEditText(WebDriver dr) {
					getEditText(dr).click();
				}

				public static void sendKeysEditText(WebDriver dr, String str) {
					getEditText(dr).sendKeys(str);
				}
				
				
		// PostButton
				public static WebElement getPostButton(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(POST_BUTTON));
					return wb;
				}

				public static void clickPostButton(WebDriver dr) {
					getPostButton(dr).click();
				}
				
		// DeleteButton
				public static WebElement getDeleteButton(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(DELETE));
					return wb;
				}

				public static void clickDeleteButton(WebDriver dr) {
					getDeleteButton(dr).click();
				}
}
