package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(name = "user_name")
	private WebElement UsernameTF;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement PasswordTF;

	@FindBy(id = "submitButton")
	private WebElement LoginBtn;

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameTF() {
		return UsernameTF;
	}

	public WebElement getPasswordTF() {
		return PasswordTF;
	}

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public void loginToApplication(String username, String password) {
		getUsernameTF().sendKeys(username);
		getPasswordTF().sendKeys(password);
		getLoginBtn().click();
	}

}
