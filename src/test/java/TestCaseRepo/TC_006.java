package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.ContactPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import genericUtility.BaseClass;

public class TC_006 extends BaseClass {

	@Test(groups = {"Sanity"})
	public void CON003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnContact();
		ContactPage cp = new ContactPage(driver);
		cp.clickOnNewContactIcon();
		String lName = eUtil.getSinglecellValueData("Contacts", 7, 1);
		String department = eUtil.getSinglecellValueData("Contacts", 7, 2);
		String email = eUtil.getSinglecellValueData("Contacts", 7, 3);
		String mailingCity = eUtil.getSinglecellValueData("Contacts", 7, 4);
		String mailingState = eUtil.getSinglecellValueData("Contacts", 7, 5);
		String mailingCOuntry = eUtil.getSinglecellValueData("Contacts", 7, 6);
		CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
		cncp.createNewContact(lName, department, email, mailingCity, mailingState, mailingCOuntry);
	}
}
