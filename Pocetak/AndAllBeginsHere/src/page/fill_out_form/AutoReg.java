package page.fill_out_form;

import org.openqa.selenium.WebDriver;

import page.objects.Register;
import page.tests.Test;
import utility.Constant;
import utility.ExcelUtils;

public class AutoReg {
	
	// REGISTRATION FORM
		public static void registration(WebDriver dr, int i) throws Exception {
			String data;
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET1);

			// First Name
			Register.clickFirstName(dr);
			data = ExcelUtils.getCellData(i, 0);
			Register.sendKeysFirstName(dr, data);

			// Last Name
			Register.clickLastName(dr);
			data = ExcelUtils.getCellData(i, 1);
			Register.sendKeysLastName(dr, data);

			// User Name
			Register.clickUserName(dr);
			data = ExcelUtils.getCellData(i, 2);
			Register.sendKeysUserName(dr, data);

			// Email
			Register.clickEmail(dr);
			data = ExcelUtils.getCellData(i, 3);
			Register.sendKeysEmail(dr, data);

			// Password
			Register.clickPassword(dr);
			data = ExcelUtils.getCellData(i, 4);
			Register.sendKeysPassword(dr, data);

			// Submit
			Register.clickRegister(dr);
			
			//Test.autoReg(dr, i);
		}

		public static void allDataRegistration(WebDriver dr) throws Exception {
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, Constant.SHEET1);
			for (int i = 1; i < ExcelUtils.getWorkSheet().getLastRowNum() + 1; i++) {
				registration(dr, i);
				Register.navigateToRegistration(dr);
				//Test.autoReg(dr, i);
			}
		}
}
