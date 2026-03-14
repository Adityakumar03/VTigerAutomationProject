package Practice;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(genericUtility.ListnersImplementation.class)
public class TestNGPractice {

	// @Ignore
	@Test(priority = 1/* ,invocationCount = 2,enabled = false */)
	public void createUser() {
		System.out.println("User Created");
	}

	@Test(priority = 2, dependsOnMethods = { "createUser", "deleteUser" })
	public void modifyUser() {

		System.out.println("User Modified");
	}

	@Test(priority = 3)
	public void deleteUser() {
//		Assert.fail();
		System.out.println("User Deleted");
	}

}
