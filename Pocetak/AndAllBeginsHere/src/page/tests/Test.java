package page.tests;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import page.objects.EditAndDelete;
import page.objects.HomePage;
import page.objects.Post;
import page.objects.Register;
import utility.ExcelUtils;

public class Test {

	// TEST REGISTRATION

	// Test registration form that you have filled manually
	public static void manualReg(WebDriver dr) {

		if (dr.getCurrentUrl().equals(Register.PAGE_URL)) {
			System.out.println("Successful ragistration.");
		} else
			System.out.println("Unsuccessful registration.");

	}

	// Test registration form that you have filled automatically
	public static void autoReg(WebDriver dr, int i) throws Exception {

		ExcelUtils.setCellData("Registration", 0, 6);

		if (dr.getCurrentUrl().equals(Register.PAGE_URL)) {
			ExcelUtils.setCellData("Pass", i, 6);
		} else {
			ExcelUtils.setCellData("Fail", i, 6);
		}

	}

	// LOGIN

	// Test login form that you have filled manually
	public static void manualLog(WebDriver dr) {

		if (dr.getCurrentUrl().equals(Post.DASHBOARD)) {
			System.out.println("Successful login.");
		} else
			System.out.println("Unsuccessful login.");
	}

	// Test login form that you have filled automatically
	public static void autoLog(WebDriver dr, int i) throws Exception {

		ExcelUtils.setCellData("LogIn", 0, 7);

		if (dr.getCurrentUrl().equals(Post.DASHBOARD)) {
			ExcelUtils.setCellData("Pass", i, 7);
		} else {
			ExcelUtils.setCellData("Fail", i, 7);
		}

	}
	
	//LOGOUT
	//Test if you have logged out
	public static void logOut(WebDriver dr) {
		if (dr.getCurrentUrl().equals(HomePage.PAGE_URL)) {
			System.out.println("Successful logout.");
		} else
			System.out.println("Unsuccessful logout.");
	}

	// POST

	// Test post form that you have filled manually
	public static void manualPost(WebDriver dr) {
		if (dr.getCurrentUrl().equals(Post.DASHBOARD)) {
			System.out.println("Successful posting.");
		} else
			System.out.println("Unsuccessful posting.");
	}

	// Test post form that you have filled automatically
	public static void autoPost(WebDriver dr, int i) throws Exception {

		ExcelUtils.setCellData("Post", 0, 8);
		if (dr.getCurrentUrl().equals(Post.DASHBOARD)) {
			ExcelUtils.setCellData("Pass", i, 8);
		} else
			ExcelUtils.setCellData("Fail", i, 8);
	}

	// EDIT AND DELETE

	// Test editing and deleting posts Manually & Automatically
	public static void editAndDelete(WebDriver dr, int i) {
		if (dr.getCurrentUrl().equals(EditAndDelete.DASHBOARD)) {
			System.out.println("Successful editing/deleting.");
		} else
			System.out.println("Unsuccessful editing/deleting.");
	}

}
