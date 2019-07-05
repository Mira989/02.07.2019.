package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Post {
	public static final String DASHBOARD = "http://localhost/izlet/dashboard.php";
	public static final String PICTURE = "D:\\Users\\PC User\\Desktop\\Pocetak\\AndAllBeginsHere\\1490657518644.jpg";
	
	public static final String BROWSE_PICTURE = "image"; //id
	
	public static final String NEW_POST = "//a[contains(text(),'Make a post')]";
	public static final String POST_TITLE = "//input[@placeholder='Naziv']";
	public static final String LOCATION = "//input[@placeholder='Lokacija']";
	public static final String CHOOSE_TRANSPORT = "//div[@class='popupPost']//select[@name='transport']";
	public static final String TEXT = "//textarea[@placeholder='Opis']";
	public static final String POST_BUTTON = "//div[@class='popupPost']//input[@name='postSubmit']";
	


	//New Post
	public static WebElement getNewPost(WebDriver dr) {
		WebElement wb = dr.findElement(By.xpath(NEW_POST));
		return wb;
	}

	public static void clickNewPost(WebDriver dr) {
		getNewPost(dr).click();
	}
	
	// Post Title
				public static WebElement getTitle(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(POST_TITLE));
					return wb;
				}

				public static void clickTitle(WebDriver dr) {
					getTitle(dr).click();
				}

				public static void sendKeysTitle(WebDriver dr, String str) {
					getTitle(dr).sendKeys(str);
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

				
	// Upload Picture
				public static WebElement getBrowse(WebDriver dr) {
					WebElement wb = dr.findElement(By.id(BROWSE_PICTURE));
					return wb;
				}
				
				public static void uploadPicture(WebDriver dr) throws Exception {
					getBrowse(dr).sendKeys(PICTURE);
					Thread.sleep(3000);
				}
				
				
	//Choose Transport
				public static WebElement getSelect(WebDriver dr) {
					WebElement wb=dr.findElement(By.xpath(CHOOSE_TRANSPORT));
					return wb;
				}
				public static void selectTransport(WebDriver dr,String transport) {
					Select sel= new Select(getSelect(dr));
					sel.selectByVisibleText(transport);
				}
				
	// Enter Text
				public static WebElement getText(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(TEXT));
					return wb;
				}

				public static void clickText(WebDriver dr) {
					getText(dr).click();
				}

				public static void sendKeysText(WebDriver dr, String str) {
					getText(dr).sendKeys(str);
				}

	// Post Button
				public static WebElement getPostButton(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(POST_BUTTON));
					return wb;
				}

				public static void clickPostButton(WebDriver dr) {
					getPostButton(dr).click();
				}
								
	//Navigate To 
				public static void navigateToPost(WebDriver dr) {
					dr.navigate().to(DASHBOARD);
				}
	
	

}
