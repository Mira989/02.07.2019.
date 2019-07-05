package page.fill_out_form;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.EditAndDelete;
import page.objects.LogIn;
import page.objects.Post;
import page.objects.Register;
import page.tests.Test;

public class ManualEdit {

	// EDIT POST FORM
	public static void editPost(WebDriver dr, int n) throws Exception {

		Scanner sc = new Scanner(System.in);

		// Edit Post
		//EditAndDelete.clickPostToEdit(dr, n);
		//EditAndDelete.clickOptionsButton(dr,n);
		EditAndDelete.clickEditButton(dr,n);

		// Title
		System.out.println("Enter Title: ");
		String title = sc.nextLine();
		EditAndDelete.sendKeysTitle(dr, title);

		// Location
		System.out.println("Enter Location: ");
		String location = sc.nextLine();
		EditAndDelete.sendKeysLocation(dr, location);

		// Upload Picture
		System.out.println("Enter Picture path : ");
		String picture = sc.nextLine();
		EditAndDelete.editPicture(dr);

		// Choose Transport
		System.out.println("Enter transport mode: ");
		String transport = sc.nextLine();
		EditAndDelete.selectTransport(dr, transport);

		// Enter Text
		System.out.println("Enter Text for your Post: ");
		String text = sc.nextLine();
		EditAndDelete.sendKeysText(dr, text);

		// Submit
		EditAndDelete.clickPostButton(dr);
		
		Test.editAndDelete(dr, n);
	}
	
}
