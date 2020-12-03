package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ReturnHomePage;

public class ReturnHome extends TestBase{
  @Test
  public void returnHome() {
	  String actual = new ReturnHomePage(baseUrl, driver).navigateTo().returnHome();
	  System.out.println(actual);
		Assert.assertEquals(actual, "http://automationpractice.com/index.php");
  }
}
