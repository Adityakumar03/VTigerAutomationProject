package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_001PracticeBaseClass extends BaseClass {

	@Test
	public void m1() throws EncryptedDocumentException, IOException {

		String fName = eUtil.getSinglecellValueData("Leads", 1, 1);
		String lName = eUtil.getSinglecellValueData("Leads", 1, 2);
		String company = eUtil.getSinglecellValueData("Leads", 1, 3);
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();

		LeadsPage lpage = new LeadsPage(driver);
		lpage.clickOnCraeteLeadicon();

		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);
	}
}
