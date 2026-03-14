package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {

	@FindBy(name = "firstname")
	private WebElement firstNameTF;

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastNameTF;

	@FindBy(xpath = "//input[@name='title']")
	private WebElement titleTF;

	@FindBy(xpath = "//input[@name='department']")
	private WebElement departmentTF;

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailTF;

	@FindBy(xpath = "//input[@name='mobile']")
	private WebElement mobileTF;

	@FindBy(xpath = "//input[@name='mailingcity']")
	private WebElement mailingcityTF;

	@FindBy(xpath = "//input[@name='mailingstate']")
	private WebElement mailingstateTF;

	@FindBy(xpath = "//input[@name='mailingcountry']")
	private WebElement mailingcountryTF;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	public CreatingNewContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	public WebElement getTitleTF() {
		return titleTF;
	}

	public WebElement getDepartmentTF() {
		return departmentTF;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getMobileTF() {
		return mobileTF;
	}

	public WebElement getMailingcityTF() {
		return mailingcityTF;
	}

	public WebElement getMailingstateTF() {
		return mailingstateTF;
	}

	public WebElement getMailingcountryTF() {
		return mailingcountryTF;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	// creating methods
	public void createnewContact(String firstName, String lastName, String title) {
		getFirstNameTF().sendKeys(firstName);
		getLastNameTF().sendKeys(lastName);
		getTitleTF().sendKeys(title);
		getSaveBtn().click();
	}

	public void createNewContact(String lastName, String department, String email, String mobile) {
		getLastNameTF().sendKeys(lastName);
		getDepartmentTF().sendKeys(department);
		getEmailTF().sendKeys(email);
		getMobileTF().sendKeys(mobile);
		getSaveBtn().click();
	}

	public void createNewContact(String lastName, String departmnet, String email, String mailingCity,
			String mailingState, String mailingCountry) {
		getLastNameTF().sendKeys(lastName);
		getDepartmentTF().sendKeys(departmnet);
		getEmailTF().sendKeys(email);
		getMailingcityTF().sendKeys(mailingCity);
		getMailingstateTF().sendKeys(mailingState);
		getMailingcountryTF().sendKeys(mailingCountry);
		getSaveBtn().click();
	}
}
