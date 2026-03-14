package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangleHRMLoginByFileProperty {

	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Aditya\\Desktop\\OrangeHRMLogin.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("URL");
		String UN = prop.getProperty("Username");
		String Pass = prop.getProperty("Password");
		System.out.println(URL);
		System.out.println(UN);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
