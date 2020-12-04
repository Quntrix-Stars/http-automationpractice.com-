package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactUsPage;

public class ContactUs extends TestBase{
	@Test
	public void contactUs() {
		String actual = new ContactUsPage(baseUrl, driver)
				.navigateTo()
				.inputMessage("Test")
				.chooseDropDown("Customer service")
				.inputEmailAdd("test@gmail.com")
				.inputOrderNum("123")
//				.chooseFile("/Users/joe/Desktop/TECH.JOE/http-automationpractice.com-/src/test/resources/config.properties")
				.submit()
				.getMessage();
		
		Assert.assertEquals(actual, "CUSTOMER SERVICE - CONTACT US");
	}

}
