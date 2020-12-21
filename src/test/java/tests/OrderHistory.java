package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.OrderHistoryPage;

public class OrderHistory extends TestBase {
	OrderHistoryPage page;

	@BeforeMethod
	public void func() {
		page = new OrderHistoryPage(baseUrl, driver).navigateTo().addProduct().proceedToCheckOut().signIn()
				.proceedToCheckOut2().proceedToCheckOut3().paymentMethod().confirmOrder();
	}

	@Test
	public void f() {
		String expected = page.getOrderNumber();
		String actual = page.returnToOrders().getLastOrderNo();
		Assert.assertEquals(actual, expected);
	}
}
