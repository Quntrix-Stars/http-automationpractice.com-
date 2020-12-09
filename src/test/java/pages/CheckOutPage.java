package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frameworks.Waiters;
import tests.AddToCart;

public class CheckOutPage extends AddToCartPage implements Waiters{
	
	public CheckOutPage(String url, WebDriver driver) {
		super(url,driver);
	}
	
	public CheckOutPage navigateTo() {
		super.navigateTo();
		return this;
	}

	public CheckOutPage addProduct() {
		super.hoverItem().clickAddCart();
		return this;
	}

	public CheckOutPage proceedToCheckOut() {
		waitForClickableByXpath(driver, "/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span").click();
		waitForClickableByXpath(driver, "//div[@id='center_column']//a[@title='Proceed to checkout']/span").click();
		return this;
	}
	
	public CheckOutPage signIn() {
		driver.findElement(By.xpath("/html//input[@id='email']")).sendKeys("testingemail@gmail.com");
		driver.findElement(By.xpath("/html//input[@id='passwd']")).sendKeys("test123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
		return this;
	}
	
	


	public CheckOutPage proceedToCheckOut2() {
		waitForClickableByXpath(driver, "//form[@action='http://automationpractice.com/index.php?controller=order']//button/span").click();
		return this;
	}
	
	public CheckOutPage proceedToCheckOut3() {
		waitForClickableByXpath(driver, "//*[@id=\"form\"]/div/p[2]/label").click();
		driver.findElement(By.xpath("//form[@id='form']//button[@name='processCarrier']/span")).click();
		return this;
	}
	
	public CheckOutPage paymentMethod() {
		waitForClickableByXpath(driver, "/html//div[@id='HOOK_PAYMENT']//a[@title='Pay by bank wire']").click();
		return this;
	}
	
	public CheckOutPage confirmOrder() {
		waitForClickableByXpath(driver, "//p[@id='cart_navigation']//span").click();
		return this;
	}
	
	
	
}
