package tests;

import org.testng.annotations.Test;

import pages.SortSizePage;

public class SortSize extends TestBase {
  @Test
  public void sortSize() throws InterruptedException{
	  String actual = new SortSizePage(baseUrl, driver).navigateTo().sortSize();
  }
}
