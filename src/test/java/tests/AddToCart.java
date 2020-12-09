package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddToCartPage;

public class AddToCart extends TestBase{
	@Test
	public void transferToCart() {
		String actual = new AddToCartPage(baseUrl, driver)
				.navigateTo()
				.hoverItem()
				.clickAddCart()
				.getString();
		Assert.assertEquals(actual, "Product successfully added to your shopping cart");
	}
}
