package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

/**
 * This is a pom class for Homepage
 * 
 * @author aditya
 * @version 26-02-12
 */

public class HomePage {

	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement Leads;

	@FindBy(xpath = "//a[text()='Contacts']")
	private WebElement contact;

	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountIcon;

	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signOutBtn;

	/**
	 * Initizling the constructor
	 * 
	 * @param driver
	 */
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeads() {
		return Leads;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getAccountIcon() {
		return accountIcon;
	}

	public WebElement getSignOutBtn() {
		return signOutBtn;
	}

	/**
	 * This is a busines library to click on leads menu
	 */

	public void clickOnLeads() {
		getLeads().click();
	}

	/**
	 * This is a business library to click on contact menu
	 */
	public void clickOnContact() {
		getContact().click();
	}


	/**
	 * This is a business library to perform logout operation
	 * 
	 * @param driver
	 */
	public void signOut(WebDriver driver) {
		SeleniumUtility sUtil = new SeleniumUtility();
		sUtil.mouseHoverAction(driver, accountIcon);
		getSignOutBtn().click();
	}
}