package Practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingAndAddingDataUsingMetchod {

	public static void main(String[] args) throws IOException {

		PropertiesUtility pUtil = new PropertiesUtility();
		String URL = pUtil.getDataFromProperties("URL");
		System.out.println(URL);
		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		pUtil.writingDataToPropertiesFile("khushi", "khushi@gmail.com", "user added");
	}

}
