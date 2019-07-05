package page.objects;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditAndDelete {
	public static final String DASHBOARD = "http://localhost/izlet/dashboard.php";
	public static final String PICTURE = "D:\\Users\\PC User\\Desktop\\Pocetak\\AndAllBeginsHere\\DSC_0030.JPG";
	
	private static final String POSTS = "posts"; //class
	public static final String OPTIONS = "fa-ellipsis-v"; // class
	public static final String EDIT = "fa-edit"; // class
	private static final String DELETE = "fa-trash-alt"; // class
	
	public static final String EDIT_PICTURE = "editImage"; //id
	
	public static final String EDIT_TITLE = "//input[@id='title']";
	public static final String EDIT_LOCATION = "//input[@id='location']";
	public static final String EDIT_TRANSPORT ="//select[@id='transport']";
	public static final String EDIT_TEXT = "//textarea[@id='description']";
	public static final String POST_BUTTON =  "//div[@class='popupEdit']//input[@value='Post']";
	
	// POSTS TO EDIT
	//Choose a post from a list that you want to edit 
			public static WebElement getPostToEdit(WebDriver dr, int n) {
					List<WebElement> list = dr.findElements(By.className(POSTS));
						WebElement wb = list.get(n);
							return wb;
			}
	
			public static void clickPostToEdit(WebDriver dr, int n) {
					getPostToEdit(dr, n).click();
			}
		
	// Options Button- find dots that stands for options button and click them
			public static WebElement getOptionsButton(WebDriver dr, int n) {
				clickPostToEdit(dr, n);
				List<WebElement> list = dr.findElements(By.className(OPTIONS));
				WebElement wb = list.get(n);
				return wb;
				}

				public static void clickOptionsButton(WebDriver dr, int n) {
						getOptionsButton(dr,n).click();
					}
				
	// Edit Button- find edit option and click it
				public static WebElement getEditButton(WebDriver dr, int n) {
					clickOptionsButton(dr,n);
					List<WebElement> list = dr.findElements(By.className(EDIT));
					WebElement wb = list.get(n);
					return wb;
					}

					public static void clickEditButton(WebDriver dr, int n) throws Exception {
							getEditButton(dr,n).click();
							Thread.sleep(3000);
						}

	// Edit Title- Change your title
				public static WebElement getTitle(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(EDIT_TITLE));
					return wb;
				}

				public static void sendKeysTitle(WebDriver dr, String str) {
					getTitle(dr).clear();
					getTitle(dr).sendKeys(str);
				}
				
				
		// Edit Location- Change your location
				public static WebElement getLocation(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(EDIT_LOCATION));
					return wb;
				}

				public static void sendKeysLocation(WebDriver dr, String str) throws Exception {
					getLocation(dr).clear();
					getLocation(dr).sendKeys(str);
					Thread.sleep(3000);
				}
				
				
		// Edit Picture- Change your picture
				public static WebElement getPicture(WebDriver dr) {
					WebElement wb = dr.findElement(By.id(EDIT_PICTURE));
					return wb;
				}

				public static void editPicture(WebDriver dr) throws Exception {
					getPicture(dr).sendKeys(PICTURE);
					Thread.sleep(3000);
				}
				
		//Edit Transport- change your transportation method
				public static WebElement getSelect(WebDriver dr) {
					WebElement wb=dr.findElement(By.xpath(EDIT_TRANSPORT));
					return wb;
				}
				public static void selectTransport(WebDriver dr,String transport) {
					Select sel= new Select(getSelect(dr));
					sel.selectByVisibleText(transport);
				}
				
				
		// Edit Text- Chenge text in your post
				public static WebElement getText(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(EDIT_TEXT));
					return wb;
				}

				public static void clickText(WebDriver dr) {
					getText(dr).click();
				}

				public static void sendKeysText(WebDriver dr, String str) {
					getText(dr).clear();
					getText(dr).sendKeys(str);
				}
				
				
		// Post Button- Submitting your changes
				public static WebElement getPostButton(WebDriver dr) {
					WebElement wb = dr.findElement(By.xpath(POST_BUTTON));
					return wb;
				}

				public static void clickPostButton(WebDriver dr) {
					getPostButton(dr).click();
				}
				
		// Delete Button- choose a post you want to delete and delete entire post
				public static WebElement getDeleteButton(WebDriver dr, int n) {
					clickOptionsButton(dr, n);
					List<WebElement> list = dr.findElements(By.className(DELETE));
					WebElement wb = list.get(n);
					return wb;
				}

				public static void clickDeleteButton(WebDriver dr, int n) {
					getDeleteButton(dr,n).click();
				}
				
		//Navigate To dashboard page
				public static void navigateToDashboard(WebDriver dr) {
					dr.navigate().to(DASHBOARD);
				}
}
