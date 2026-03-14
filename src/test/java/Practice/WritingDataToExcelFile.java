package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.ExcelUtility;

@SuppressWarnings("unused")
public class WritingDataToExcelFile {

	public static void main(String[] args) throws IOException {

//		FileInputStream fis = new FileInputStream("C:\\Users\\Aditya\\Desktop\\WritingData.xlsx");
////		Workbook wb = new XSSFWorkbook();
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.createSheet("Companies");
//		Row r = sh.createRow(3);
//		Cell c = r.createCell(4);
//		c.setCellValue("TCS");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\Aditya\\Desktop\\WritingData.xlsx");
//		wb.write(fos);
//		wb.close();
		
		ExcelUtility EUtil = new ExcelUtility();
		EUtil.writeDataToExcel("Abc", 0, 0, "Khushi");
	}

}
