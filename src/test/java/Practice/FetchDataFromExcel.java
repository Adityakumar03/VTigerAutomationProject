package Practice;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		ExcelUtility eUtil = new ExcelUtility();
		String value1 = eUtil.getSinglecellValueData("Cars", 1, 2);
		System.out.println(value1);
		
		String value2 = eUtil.getSinglecellValueData("Cars", 2, 3);
		System.out.println(value2);
	}
}
