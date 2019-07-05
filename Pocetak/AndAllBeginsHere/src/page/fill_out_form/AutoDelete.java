package page.fill_out_form;

import org.openqa.selenium.WebDriver;

import page.objects.EditAndDelete;
import page.objects.LogIn;
import page.objects.Post;
import page.objects.Register;
import page.tests.Test;
import utility.Constant;
import utility.ExcelUtils;

public class AutoDelete {
	
	//DELETE FORM
	public static void delete(WebDriver dr, int n) throws Exception {
		EditAndDelete.clickDeleteButton(dr, n);
		Test.editAndDelete(dr, n);
}
}
