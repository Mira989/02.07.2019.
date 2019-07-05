package page.fill_out_form;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Register;
import page.tests.Test;

public class ManualReg {
	
	// REGISTRATION FORM
		public static void registration(WebDriver dr) throws Exception {

			Scanner sc = new Scanner(System.in);

			// First Name
			System.out.println("Enter First Name: ");
			String name = sc.nextLine();
			Register.clickFirstName(dr);
			Register.sendKeysFirstName(dr, name);

			// Last Name
			System.out.println("Enter Last Name: ");
			String lastname = sc.nextLine();
			Register.clickLastName(dr);
			Register.sendKeysLastName(dr, lastname);

			// User Name
			System.out.println("Enter User Name: ");
			String username = sc.nextLine();
			Register.clickUserName(dr);
			Register.sendKeysUserName(dr, username);

			// Email
			System.out.println("Enter Email: ");
			String email = sc.nextLine();
			Register.clickEmail(dr);
			Register.sendKeysEmail(dr, email);

			// Password
			System.out.println("Enter Password: ");
			String password = sc.nextLine();
			Register.clickPassword(dr);
			Register.sendKeysPassword(dr, password);

			// Submit
			Register.clickRegister(dr);
			
			//Test.manualReg(dr);
		}
		
}
