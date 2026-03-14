package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.ContactPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_005 extends BaseClass {

	@Test(groups = {"Sanity"})
	public void CON002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContact();
		ContactPage cp = new ContactPage(driver);
		cp.clickOnNewContactIcon();
		String lName = eUtil.getSinglecellValueData("Contacts", 4, 1);
		String department = eUtil.getSinglecellValueData("Contacts", 4, 2);
		String email = eUtil.getSinglecellValueData("Contacts", 4, 3);
		String mobile = eUtil.getSinglecellValueData("Contacts", 4, 4);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, department, email, mobile);
	}
}
