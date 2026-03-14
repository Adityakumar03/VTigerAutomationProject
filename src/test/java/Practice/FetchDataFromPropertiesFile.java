package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

@SuppressWarnings("unused")
public class FetchDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {

//		FileInputStream fis = new FileInputStream("C:\\Users\\Aditya\\Desktop\\Data.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String URL = prop.getProperty("URL");
//		String UN = prop.getProperty("Username");
//		String Pass = prop.getProperty("Password");
//		System.out.println(URL);
//		System.out.println(UN);
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(URL);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UN);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Pass);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		PropertiesUtility pUtil = new PropertiesUtility(); 
		String value = pUtil.getDataFromProperties("url");
		System.out.println(value);
	}
}