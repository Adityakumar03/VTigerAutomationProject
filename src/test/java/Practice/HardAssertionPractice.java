package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	@Test
	public void atrictLevelComparisonHardAssertion() {
		String expectedCity = "Mysore";
		String actualCity = "Mysuru";
		System.out.println("Strict level Hard Assertion starts");
		Assert.assertEquals(actualCity, expectedCity);
		System.out.println("Strict Level Hard Assertion Ends");
	}

	@Test
	public void containsLevelHardAssertion() {
		String expectedName = "babu";
		String actualName = "Giri babu";
		System.out.println("Contains level Hard Assertion starts");
		Assert.assertEquals(actualName.contains(expectedName), true);
		System.out.println("Contains level Hard Assertion ends");

	}

}
