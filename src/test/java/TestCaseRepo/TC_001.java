package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

@Listeners(genericUtility.ListnersImplementation.class)
public class TC_001 extends BaseClass {

	@Test(groups = { "Smoke", "Regression" })
	public void LE_001() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCraeteLeadicon();
		//Assert.fail();
		String fName = eUtil.getSinglecellValueData("Leads", 1, 1);
		String lName = eUtil.getSinglecellValueData("Leads", 1, 2);
		String company = eUtil.getSinglecellValueData("Leads", 1, 3);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);
	}
}