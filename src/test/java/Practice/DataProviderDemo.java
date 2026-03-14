//package TestNgPractice;
//
//import java.io.IOException;
//import java.time.Duration;
//
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//
//import org.testng.annotations.Test;
//
//import genericUtility.PropertiesUtility;
//
//
//
//
//
//public class DataProviderDemo {
//	WebDriver driver;
//	
//
//	PropertiesUtility x = new PropertiesUtility();
//	
//	String email;
//	String password;
//	
//	
//	@FindBy(name = "email")
//	WebElement emailTF;
//	
//	@FindBy(name = "password")
//	WebElement passwordTF;
//	
//	@FindBy(xpath = "//input[@type='submit']")
//	WebElement loginButton;
//	
//	@FindBy(xpath = "//h2[text()='My Account']")
//	WebElement myAccountPage;
//
//	@FindBy(linkText = "Logout")
//	WebElement logout;
//	
//	
//	@BeforeClass
//	void setUp() throws IOException {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		PageFactory.initElements(driver, this);
//		email = x.getDataFromPropertiesFile("email");
//		password = x.getDataFromPropertiesFile("password");
//	}
//	
//	
//	
//	
//	
//	@Test
//	void testLogin() {
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//		driver.manage().window().maximize();
//		
//		
//		
//		emailTF.sendKeys(email);
//		passwordTF.sendKeys(password);
//		loginButton.click();
//		
//		boolean status = myAccountPage.isDisplayed();
//		if(status == true) {
//			logout.click();
//			Assert.assertTrue(true);
//		}else {
//			Assert.fail();
//		}
//		
//	}
//	
//	
//	@AfterClass
//	void tearDown() {
//		driver.close();
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
