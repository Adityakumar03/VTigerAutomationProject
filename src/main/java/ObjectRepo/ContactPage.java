package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This is a Contact page pom class
 */
public class ContactPage {
	@FindBy(xpath = "//img[@title='Create Contact...']")
	WebElement contactLink;

	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getContactLink() {
		return contactLink;
	}

	public void clickOnNewContactIcon() {
		contactLink.click();
	}
}
