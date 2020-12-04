package tests;

import org.testng.annotations.Test;

import pages.RegisterPage;

public class RegisterPageTest extends TestBase {
  @Test
  public void registerAccount() {
	  String actual = new RegisterPage(baseUrl, driver).navigateTo().insertEmail().fillUpForm().getTitle();
	  System.out.println(actual);
	  
  }
}
