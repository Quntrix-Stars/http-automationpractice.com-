package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.MainPage;


//COMMENT TESTING STUFF I DONT KNOW
public class MainP extends TestBase {
	@Test
	public void f() {
		String actualTitle = new MainPage(baseUrl, driver).navigateTo().getTitle();
		Assert.assertNotEquals(actualTitle, null);
	}
}
