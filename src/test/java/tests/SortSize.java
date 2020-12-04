package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SortSizePage;

public class SortSize extends TestBase {
  @Test
  public void sortSize() throws InterruptedException{
	  String actual = new SortSizePage(baseUrl, driver)
			  .navigateTo()
			  .sortSize();
	  System.out.println("THIS IS THE STRING ACTUAL :" + actual);
	  //I do not know what to Assert since page does not load.
	  Assert.assertEquals(actual, "/index.php?id_category=8&controller=category");
	  
  }
}
