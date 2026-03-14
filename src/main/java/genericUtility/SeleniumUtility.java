package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

/**
 * This is an utiluty class which has functionalities from selenium library
 */
public class SeleniumUtility {

	/**
	 * This is a generic method to access a web application
	 * 
	 * @param driver
	 * @param url
	 */
	public void accessApplication(WebDriver driver, String url) {
		driver.get(url);
	}
	
	/**
	 * This is a generic method to refresh the webpage
	 */
	
	public void refreshWebPage(WebDriver driver){
		driver.navigate().refresh();
	}
	
	/**
	 * This is a generic method to maximize the window
	 * 
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This is a generic method to provide implicit wait
	 * 
	 * @param driver
	 * @param maxTime
	 */
	public void implicitWait(WebDriver driver, int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}

	// Handing mouse actions
	/**
	 * This is a generic method to handle mouse hover action
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	/**
	 * This is a generic method to handle double click
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	/**
	 * This is a generic method to handle right click
	 * 
	 * @param driver
	 * @param element
	 */
	public void rightClick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

//	Handling dropdown

	/**
	 * This is a generic method to select an element by passing index
	 * 
	 * @param dropdownEle
	 * @param index
	 */
	public void selectoptionbyIndex(WebElement dropdownEle, int index) {
		Select s = new Select(dropdownEle);
		s.selectByIndex(index);
	}

	/**
	 * This is a generic method to select an element by passing its value
	 * 
	 * @param dropdownEle
	 * @param value
	 */
	public void selectoptionbyValue(WebElement dropdownEle, String value) {
		Select s = new Select(dropdownEle);
		s.selectByValue(value);
	}

	/**
	 * This is a generic method to select an element by its visible text
	 * 
	 * @param dropdownElement
	 * @param VisibleText
	 */
	public void selectoptionbyVisibleText(WebElement dropdownElement, String VisibleText) {
		Select s = new Select(dropdownElement);
		s.selectByVisibleText(VisibleText);
	}

	// Handling alert popups
	/**
	 * This is a generic method to accept a alert popups
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This is generic method to cancel ab alert popup
	 * @param driver
	 */

	public void cancelAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	// capturing screenshot
	/**
	 * This is a generic method to capture screenshot
	 * 
	 * @throws IOException
	 * 
	 */

	public String captureScreenshot(WebDriver driver, String ScreenshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\" + ScreenshotName + ".png");
		Files.copy(src, dest);
		
		return dest.getAbsolutePath(); // used in listeners
	}
}
