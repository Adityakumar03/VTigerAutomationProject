package Practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.IPathUtility;

public class FetchDataFromExcelFIle {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Leads");
		Row r = sh.getRow(3);
		Cell c = r.getCell(2);
		String value = c.getStringCellValue();
		System.out.println(value);
	}

}
