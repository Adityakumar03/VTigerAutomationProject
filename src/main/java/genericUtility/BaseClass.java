package genericUtility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import ObjectRepo.HomePage;
import ObjectRepo.Loginpage;

@SuppressWarnings("unused")
public class BaseClass {
	public ExcelUtility eUtil = new ExcelUtility();
	public SeleniumUtility sUtil = new SeleniumUtility();
	public PropertiesUtility pUtil = new PropertiesUtility();
	public WebDriver driver;
	public static WebDriver sDriver;

	@BeforeSuite(alwaysRun = true)
	public void bsConfig() {
		System.out.println("Database connected");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void bcConfig(@Optional("chrome") String browser) throws IOException {
//		String browser = "chrome";
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equals("safari")) {
			driver = new SafariDriver();
		} else
			driver = new ChromeDriver();
		sDriver = driver;
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 20);
		String URL = pUtil.getDataFromProperties("url");
		sUtil.accessApplication(driver, URL);
		System.out.println("Browser launched successfully");
	}

	@BeforeMethod(alwaysRun = true)
	public void bmConfig() throws IOException {
		String UN = pUtil.getDataFromProperties("username");
		String PWD = pUtil.getDataFromProperties("password");
		Loginpage lp = new Loginpage(driver);
		lp.loginToApplication(UN, PWD);
		System.out.println("Login done successfully");
	}

	@AfterMethod(alwaysRun = true)
	public void afConfig() {
		HomePage hp = new HomePage(driver);
		hp.signOut(driver);
		System.out.println("Logout done successfully");
	}

	@AfterClass(alwaysRun = true)
	public void acConfig() {
		driver.quit();
		System.out.println("Browser closed");
	}

	@AfterSuite(alwaysRun = true)
	public void asConfig() {
		System.out.println("DB conn closed");
	}
}
