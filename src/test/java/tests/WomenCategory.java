package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.WomenCategoryPage;

public class WomenCategory extends TestBase {
	@Test
	public void womenCat() {
		String actual = new WomenCategoryPage(baseUrl, driver).navigateTo().getCategory();
		System.out.println(actual);
		Assert.assertEquals(actual, "Women");
	}

}
