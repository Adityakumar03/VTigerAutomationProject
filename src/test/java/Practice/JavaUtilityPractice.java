package Practice;

import genericUtility.JavaUtility;

public class JavaUtilityPractice {

	public static void main(String[] args) {

		JavaUtility JUtil = new JavaUtility();
		String value = JUtil.getCalandarDetails("dd-MM-YYYY");
		System.out.println(value);
		String value1 = JUtil.getCalandarDetails("dd-MM_YYYY hh-mm-ss");
		System.out.println(value1);
		int num = JUtil.genetareRandomNum(100);
		System.out.println(num);
	}
}
