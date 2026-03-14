package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.CreatingNewLeadPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import ObjectRepo.Loginpage;
//import genericUtility.BaseClass;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class TC_001Practice {

	@Test
	public void m1() throws EncryptedDocumentException, IOException {
		ExcelUtility eUtil = new ExcelUtility();
		PropertiesUtility pUtil = new PropertiesUtility();
		SeleniumUtility sUtil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 20);

		String URL = pUtil.getDataFromProperties("url");
		String UN = pUtil.getDataFromProperties("username");
		String PWD = pUtil.getDataFromProperties("password");

		String fName = eUtil.getSinglecellValueData("Leads", 1, 1);
		String lName = eUtil.getSinglecellValueData("Leads", 1, 2);
		String company = eUtil.getSinglecellValueData("Leads", 1, 3);

		sUtil.accessApplication(driver, URL);

		Loginpage lp = new Loginpage(driver);
		lp.loginToApplication(UN, PWD);

		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();

		LeadsPage lpage = new LeadsPage(driver);
		lpage.clickOnCraeteLeadicon();

		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company);

		hp.signOut(driver);
		driver.quit();

	}
}
