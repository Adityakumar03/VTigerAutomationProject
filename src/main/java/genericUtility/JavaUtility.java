package genericUtility;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is a genetic utility class which stores the functionality from java
 * package
 * 
 * @author aditya
 * @version 16-02-09
 */
public class JavaUtility {
	/**
	 * This is a genetic method to fetch calandar details
	 * 
	 * @param pattern
	 * @return
	 */
	public String getCalandarDetails(String pattern) {
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String value = sdf.format(d);
		return value;
	}
	/**
	 * This is a generic method to get Random number
	 * 
	 * @param bound
	 * @return random number
	 */
	public int genetareRandomNum(int bound) {
		Random r = new Random();
		int num = r.nextInt(bound);
		return num;
	}
}

