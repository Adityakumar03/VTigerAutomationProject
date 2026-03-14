package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import genericUtility.BaseClass;

public class TC_003 extends BaseClass {

	@Test(groups = {"Regression"})
	public void LE003() throws EncryptedDocumentException, IOException {
		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		LeadsPage lp = new LeadsPage(driver);
		lp.clickOnCraeteLeadicon();
		String lName = eUtil.getSinglecellValueData("Leads", 7, 1);
		String company = eUtil.getSinglecellValueData("Leads", 7, 2);
		String noOfEmp = eUtil.getSinglecellValueData("Leads", 7, 3);
		String phone = eUtil.getSinglecellValueData("Leads", 7, 4);
		String email = eUtil.getSinglecellValueData("Leads", 7, 5);
		String state = eUtil.getSinglecellValueData("Leads", 7, 6);
		String country = eUtil.getSinglecellValueData("Leads", 7, 7);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lName, company, noOfEmp, phone, email, state, country);
	}
}
