package page.fill_out_form;

import org.openqa.selenium.WebDriver;

import page.objects.Post;
import page.tests.Test;
import utility.Constant;
import utility.ExcelUtils;

public class AutoPost {
	
	// POST FORM
		public static void post(WebDriver dr, int i) throws Exception {
			String data;
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET2);

			// Enter New Post
			Post.clickNewPost(dr);

			// Title
			Post.clickTitle(dr);
			data = ExcelUtils.getCellData(i, 1);
			Post.sendKeysTitle(dr, data);

			// Location
			Post.clickLocation(dr);
			data = ExcelUtils.getCellData(i, 2);
			Post.sendKeysLocation(dr, data);

			// Upload Picture
			Post.uploadPicture(dr);

			// Choose Transport 
			String transport = "Walk";
			Post.selectTransport(dr, transport);

			// Enter Text
			Post.clickText(dr);
			data = ExcelUtils.getCellData(i, 0);
			Post.sendKeysText(dr, data);

			// Submit
			Post.clickPostButton(dr);
			
			Test.autoPost(dr, i);
		}

		public static void allDataPost(WebDriver dr) throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET2);
			for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
				post(dr, i);
				Post.navigateToPost(dr);
				Test.autoPost(dr, i);
			}
		}

}
