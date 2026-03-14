package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import genericUtility.SeleniumUtility;

/**
 * This is a CreateNewLeadPage POM class
 */

public class CreatingNewLeadPage {

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstNameTF;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameTF;

	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyTF;

	@FindBy(xpath = "//input[@name='designation']")
	private WebElement titleTF;

	@FindBy(xpath = "//select[@name='leadsource']")
	private WebElement leadSourceDropdown;

	@FindBy(xpath = "//input[@name='noofemployees']")
	private WebElement noOfEmplyoeesTF;

	@FindBy(id = "phone")
	private WebElement phoneTF;

	@FindBy(id = "email")
	private WebElement emailTF;

	@FindBy(id = "state")
	private WebElement stateTF;

	@FindBy(id = "country")
	private WebElement countryTF;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	// initilizing constructor
	public CreatingNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getCompanyTF() {
		return companyTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getLeadSourceDropdown() {
		return leadSourceDropdown;
	}

	public WebElement getNoOfEmplyoees() {
		return noOfEmplyoeesTF;
	}

	public WebElement getPhoneTF() {
		return phoneTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getStateTF() {
		return stateTF;
	}

	public WebElement getCountryTF() {
		return countryTF;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	//creating methods
	public void createNewLead(String firstName, String lastName, String company) {
		getFirstNameTF().sendKeys(firstName);
		getLastNameTF().sendKeys(lastName);
		getCompanyTF().sendKeys(company);
		getSaveBtn().click();
	}

	public void createNewLead(String lastName, String company, String title, String leadsource, String noOfEmp) {
		getLastNameTF().sendKeys(lastName);
		getCompanyTF().sendKeys(company);
		getTitleTF().sendKeys(title);
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.selectoptionbyValue(getLeadSourceDropdown(), leadsource);
		getNoOfEmplyoees().sendKeys(noOfEmp);
		getSaveBtn().click();
	}

	public void createNewLead(String lastName, String company, String noOfEmployee, String phone, String email,
			String state, String country) {
		getLastNameTF().sendKeys(lastName);
		getCompanyTF().sendKeys(company);
		getNoOfEmplyoees().sendKeys(noOfEmployee);
		getPhoneTF().sendKeys(phone);
		getEmailTF().sendKeys(email);
		getStateTF().sendKeys(state);
		getCountryTF().sendKeys(country);
		getSaveBtn().click();
	}
}
