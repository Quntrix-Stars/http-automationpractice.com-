package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckOutPage;

public class CheckOut extends TestBase{
	@Test
	public void finalCheckOut() {
		String actual = new CheckOutPage(baseUrl, driver)
				.navigateTo()
				.addProduct()
				.proceedToCheckOut()
				.signIn()
				.proceedToCheckOut2()
				.proceedToCheckOut3()
				.paymentMethod()
				.confirmOrder()
				.getTitle();
		
		Assert.assertEquals(actual, "Order confirmation - My Store");
				
	}
}
