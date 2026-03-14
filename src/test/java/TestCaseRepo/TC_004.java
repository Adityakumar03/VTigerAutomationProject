package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.ContactPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_004 extends BaseClass {

	@Test(groups = {"Sanity", "Regression"})
	public void CON001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContact();
		ContactPage cp = new ContactPage(driver);
		cp.clickOnNewContactIcon();
		String fName = eUtil.getSinglecellValueData("Contacts", 1, 1);
		String LName = eUtil.getSinglecellValueData("Contacts", 1, 2);
		String title = eUtil.getSinglecellValueData("Contacts", 1, 3);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createnewContact(fName, LName, title);
	}
}
