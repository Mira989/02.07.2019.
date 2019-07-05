package page.fill_out_form;

import org.openqa.selenium.WebDriver;

import page.objects.LogIn;
import page.tests.Test;
import utility.Constant;
import utility.ExcelUtils;

public class AutoLogIn {
	
	// LOGIN FORM
	
		public static void logIn(WebDriver dr, int i) throws Exception {
			String data;
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET1);

			// User Name
			LogIn.clickUserName(dr);
			data = ExcelUtils.getCellData(i, 2);
			LogIn.sendKeysUserName(dr, data);

			// Password
			LogIn.clickPassword(dr);
			data = ExcelUtils.getCellData(i, 4);
			LogIn.sendKeysPassword(dr, data);

			// Submit
			LogIn.clickLogIn(dr);
			
			Test.autoLog(dr, i);
			
			}
			//LogOut
		public static void logOut(WebDriver dr) throws Exception {
			LogIn.clickLogOut(dr);
			Test.logOut(dr);
		}

		public static void allDataLogIn(WebDriver dr) throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET1);
			for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
				logIn(dr, i);
				logOut(dr);
				LogIn.navigateToLogIn(dr);
				Test.autoLog(dr, i);
			}

		}
}
