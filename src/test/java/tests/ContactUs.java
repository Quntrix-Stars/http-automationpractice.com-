package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;

public class ContactUs extends TestBase{
	@Test
	public void contactUs() {
		String actual = new ContactUsPage(baseUrl, driver)
				.navigateTo()
				.getMessage();
		Assert.assertEquals(actual, "Message");
	}

}
