package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;

public class Cart extends TestBase{
	@Test
	public void cartView() {
		String actual = new CartPage(baseUrl, driver)
				.navigateTo()
				.getCart();
		Assert.assertEquals(actual, "Cart");
	}

}
