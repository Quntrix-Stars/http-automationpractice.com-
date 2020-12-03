package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.StoreAddressPage;

public class StoreAddress extends TestBase{
	@Test
	public void storeAddress() {
		String actual = new StoreAddressPage(baseUrl, driver)
				.navigateTo()
				.getStores();
		Assert.assertEquals(actual, "OUR STORE(S)!");
	}
}
