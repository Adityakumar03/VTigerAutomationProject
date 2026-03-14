package Practice;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExcelUtility MulUtil = new ExcelUtility();
		List<String> a1 = MulUtil.getMultipleDataFromExcel("City", 0, 0);
		System.out.println(a1);
	}

}
