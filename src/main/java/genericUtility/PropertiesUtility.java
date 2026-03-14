package genericUtility;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This is an utility class for Properties File
 * @author aditya
 * @version 26-02-02
 */
public class PropertiesUtility {
	/**
	 * This is an utility method to fetch data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperties(String key) throws IOException {
		
		// fetching data
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	/**
	 * This is an utility method to add data to properties file
	 * @author aditya
	 * @param key
	 * @param value
	 * @param message
	 * @throws IOException
	 */
	public void writingDataToPropertiesFile(String key, String value, String message) throws IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
		Properties prop = new Properties();
		prop.load(fis);
		prop.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.propertiesPath);
		prop.store(fos, message);
	}
}
