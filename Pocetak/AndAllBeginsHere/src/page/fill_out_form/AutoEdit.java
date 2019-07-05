package page.fill_out_form;

import org.openqa.selenium.WebDriver;

import page.objects.EditAndDelete;
import page.tests.Test;
import utility.Constant;
import utility.ExcelUtils;

public class AutoEdit {
	
	// EDIT FORM
		public static void editPost(WebDriver dr, int i, int n) throws Exception {
			String data;
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET2);

			// Edit Post
			EditAndDelete.clickEditButton(dr,n);

			// Title
			data = ExcelUtils.getCellData(i, 1);
			EditAndDelete.sendKeysTitle(dr, data);

			// Location
			data = ExcelUtils.getCellData(i, 2);
			EditAndDelete.sendKeysLocation(dr, data);

			// Upload Picture
			EditAndDelete.editPicture(dr);

			// Choose Transport 
			String transport = "Walk";
			EditAndDelete.selectTransport(dr, transport);

			// Enter Text
			data = ExcelUtils.getCellData(i, 0);
			EditAndDelete.sendKeysText(dr, data);

			// Submit
			EditAndDelete.clickPostButton(dr);
			
			Test.editAndDelete(dr, n);
		}

}
