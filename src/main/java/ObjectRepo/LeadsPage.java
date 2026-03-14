package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Leads Page pom class
 * 
 * @author aditya
 * @version 26-02-12
 * @return
 */

public class LeadsPage {

	@FindBy(xpath = "//img[@alt='Create Lead...']")
	private WebElement plusIcon;


	public LeadsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	/**
	 * This is a business library to click on create New Lead icon
	 */

	public void clickOnCraeteLeadicon() {
		getPlusIcon().click();
	}

}
