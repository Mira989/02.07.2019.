package page.fill_out_form;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import page.objects.EditAndDelete;
import page.tests.Test;

public class ManualDelete {
	
	//DELETE FORM
		public static void deletePost(WebDriver dr) throws Exception {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number of the Post you want to delete: ");
			int n = sc.nextInt();
			EditAndDelete.getDeleteButton(dr, n);
			EditAndDelete.clickDeleteButton(dr, n);
			
			Test.editAndDelete(dr, n);
			
		}
}
