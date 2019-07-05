package page.fill_out_form;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.LogIn;
import page.tests.Test;

public class ManualLogIn {
	
	// LOGIN FORM
		public static void logIn(WebDriver dr) throws Exception {

			Scanner sc = new Scanner(System.in);

			// User Name
			System.out.println("Enter User Name: ");
			String username = sc.nextLine();
			LogIn.clickUserName(dr);
			LogIn.sendKeysUserName(dr, username);

			// Password
			System.out.println("Enter Password: ");
			String password = sc.nextLine();
			LogIn.clickPassword(dr);
			LogIn.sendKeysPassword(dr, password);

			// Submit
			LogIn.clickLogIn(dr);
			
			Test.manualLog(dr);
		}
}
