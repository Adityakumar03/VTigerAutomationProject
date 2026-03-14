package Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	@Test
	public void strictLevelComparisionSoftAssertion() {
		String expectedFood = "Benne Dosa";
		String actualFood = "Benn Dosa";
		System.out.println("Strict Level Soft Assertion Starts");
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualFood, expectedFood);
		System.out.println("Strict Level Soft Assertion Ends");
		s.assertFalse(actualFood.contains(expectedFood));
		s.assertAll();
	}

	@Test
	public void containsLevelComparisionSoftAssertion() {
		String expectedMovie = "Avatar";
		String actualMovie = "Avatar 1";
		System.out.println("Contains Level Soft Assertion starts");
		SoftAssert s = new SoftAssert();
		s.assertTrue(actualMovie.contains(expectedMovie));
		System.out.println("Contains Level Soft Assertion Ends");
		s.assertAll();
	}
}
