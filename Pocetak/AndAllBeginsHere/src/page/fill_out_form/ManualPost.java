package page.fill_out_form;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.Post;
import page.tests.Test;

public class ManualPost {
	// POST FORM
	public static void post(WebDriver dr) throws Exception {

		Scanner sc = new Scanner(System.in);

		// Enter New Post
		Post.clickNewPost(dr);

		// Title
		System.out.println("Enter Title: ");
		String title = sc.nextLine();
		Post.clickTitle(dr);
		Post.sendKeysTitle(dr, title);

		// Location
		System.out.println("Enter Location: ");
		String location = sc.nextLine();
		Post.clickLocation(dr);
		Post.sendKeysLocation(dr, location);

		// Upload Picture
		Post.uploadPicture(dr);

		// Choose Transport
		System.out.println("Choose transport mode: Walk, Car, Motorbike, Bicycle or Bus");
		String transport = sc.nextLine();
		Post.selectTransport(dr, transport);

		// Enter Text
		System.out.println("Enter Text for your Post: ");
		String text = sc.nextLine();
		Post.clickText(dr);
		Post.sendKeysText(dr, text);

		// Submit
		Post.clickPostButton(dr);
		
		Test.manualPost(dr);
	}
}
