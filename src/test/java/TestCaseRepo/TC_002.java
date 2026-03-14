package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

@Listeners(genericUtility.ListnersImplementation.class)
public class TC_002 extends BaseClass {

	@Test(groups = {"Smoke", "Sanity"})
	public void LE002() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCraeteLeadicon();
		String lName = eUtil.getSinglecellValueData("Leads", 4, 1);
		String company = eUtil.getSinglecellValueData("Leads", 4, 2);
		String title = eUtil.getSinglecellValueData("Leads", 4, 3);
		String leadSource = eUtil.getSinglecellValueData("Leads", 4, 4);
		String noOfEmp = eUtil.getSinglecellValueData("Leads", 4, 5);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lName, company, title, leadSource, noOfEmp);
	}
	
	@Test
	public void m1() {
		System.out.println("Hi");
	}
}
