package Practice;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepo.ContactPage;
import ObjectRepo.CreatingNewContactPage;
import ObjectRepo.HomePage;
import ObjectRepo.LeadsPage;
import ObjectRepo.Loginpage;
import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;
import genericUtility.SeleniumUtility;

public class VTigerPassvalueToUserName {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException, InterruptedException {

		PropertiesUtility pUtil = new PropertiesUtility();
		SeleniumUtility selUtil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		String URL = pUtil.getDataFromProperties("url");
		String UN = pUtil.getDataFromProperties("username");
		String PWD = pUtil.getDataFromProperties("password");
		selUtil.maximizeWindow(driver);
		selUtil.implicitWait(driver, 15);
		selUtil.accessApplication(driver, URL);
//		WebElement usernameTF = driver.findElement(By.xpath("//input[@type='text']"));
//		usernameTF.sendKeys(UN);
//		Thread.sleep(2000);
//		selUtil.refreshWebPage(driver);
//		Thread.sleep(2000);
//		usernameTF.sendKeys(UN);

		Loginpage loginpage = new Loginpage(driver);
		loginpage.loginToApplication(UN, PWD);

		HomePage hp = new HomePage(driver);
		hp.clickOnLeads();
		// hp.signOut(driver);

		LeadsPage lp = new LeadsPage(driver);
//		lp.clickOnCraeteLeadicon();

//		ContactPage cp = new ContactPage(driver);
//		cp.clickOnContactIcon();

		ExcelUtility eUtil = new ExcelUtility();
//		String firstName = eUtil.getSinglecellValueData("Leads", 1, 1);
//
//		String lastName = eUtil.getSinglecellValueData("Leads", 1, 2);
//
//		String company = eUtil.getSinglecellValueData("Leads", 1, 3);
//
//		CreatingNewLeadPage clp = new CreatingNewLeadPage(driver);
//		clp.createNewLead(firstName, lastName, company);

		hp.clickOnContact();
		ContactPage cp = new ContactPage(driver);
		cp.clickOnNewContactIcon();

		CreatingNewContactPage ccp = new CreatingNewContactPage(driver);

		// String firstName1 = eUtil.getSinglecellValueData("Contacts", 1, 1);

		String lastName1 = eUtil.getSinglecellValueData("Contacts", 1, 2);

		// String title = eUtil.getSinglecellValueData("Contacts", 1, 3);
		// ccp.createnewContact(firstName1, lastName1, title);

		String department = eUtil.getSinglecellValueData("Contacts", 4, 2);
		String email = eUtil.getSinglecellValueData("Contacts", 4, 3);
		String mobile = eUtil.getSinglecellValueData("Contacts", 4, 3);

		ccp.createNewContact(lastName1, department, email, mobile);

		String mailingCity = eUtil.getSinglecellValueData("Contacts", 7, 4);
		String mailingState = eUtil.getSinglecellValueData("Contacts", 7, 5);
		String mailingCountry = eUtil.getSinglecellValueData("Contacts", 7, 6);
		ccp.createNewContact(lastName1, department, email, mailingCity, mailingState, mailingCountry);
		
		hp.signOut(driver);
	}
}
