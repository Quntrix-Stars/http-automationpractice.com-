package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SignInPage;


public class SignIn extends TestBase {

	@Test
	public void signIn() {
		String actual = new SignInPage(baseUrl,driver).navigateTo().signIn();
		System.out.println(actual);
		Assert.assertEquals(actual, "Sign out");
	}
}
