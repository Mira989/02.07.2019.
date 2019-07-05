package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class ExcelUtils {
	
	//References to private fields that serve us
		// store objects of excell
		private static HSSFSheet ExcelWSheet;
		private static HSSFWorkbook ExcelWBook;
		private static HSSFCell Cell;
		private static HSSFRow Row;
		// Using this, we convert any data into a string
		private static DataFormatter formatter;

		// The method that sets us an excell file
		// and sent the name of the worksheet
		public static void setExcelFile(String Path, String SheetName) throws Exception {
			try { 
				//We are loading some file whose paths
				// are sent as Path
				FileInputStream ExcelFile = new FileInputStream(Path);

				// We open the file as an excell file
				ExcelWBook = new HSSFWorkbook(ExcelFile);

				// We take a worksheet from a given excell file
				ExcelWSheet = ExcelWBook.getSheet(SheetName);

				// we initialize the dataformatter object
				formatter = new DataFormatter();
			} catch (Exception e) {
				throw (e);
			}

		}

		// We take the data from the excelltable for the given row and column
		public static String getCellData(int RowNum, int ColNum) throws Exception {
			try {

				// We take a cell
				// By taking the order
				// and then the assigned column
				Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
				// Converts to string information from the cell
				String CellData = formatter.formatCellValue(Cell);
				// String CellData = Cell.getStringCellValue();
				return CellData;
			} catch (Exception e) {
				return "";
			}

		}

		public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
			try {

				// We take the order in which we enter
				Row = ExcelWSheet.getRow(RowNum);

				//we take the cell we want to enter
				Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);

				// if the cell is empty or non-existent
				if (Cell == null) {
					// we create a yen in a given place
					Cell = Row.createCell(ColNum);

					// we set the value in the cell
					Cell.setCellValue(Result);
				} else {

					// if we digest the data, we are always setting the value
					// we are trampling the old one

					Cell.setCellValue(Result);
				}

				// This part of the code writes changes to the excell file
				FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
				ExcelWBook.write(fileOut);

				// empty data inside the file
				fileOut.flush();

				// we close the output stream to the file
				fileOut.close();
			} catch (Exception e) {
				throw (e);

			}

		}
		//Returns the reference to the worksheet
		public static HSSFSheet getWorkSheet() {
			return ExcelWSheet;
		}

}
