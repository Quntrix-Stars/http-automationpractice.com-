package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SearchBarPage;

public class SearchBar extends TestBase {

	@Test
	public void searchBar() {
		String actual = new SearchBarPage(baseUrl, driver)
				.navigateTo()
				.useSearch();
		System.out.println(actual);
		Assert.assertEquals(actual, "\"DRESS\"");
	}
}
