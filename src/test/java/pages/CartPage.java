package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
	String url = "index.php?controller=order";
	
	public CartPage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public CartPage navigateTo() {
		super.navigateTo(url);
		return this;
	}
	
	
	public String getCart() {
		return driver.findElement(By.cssSelector("div.shopping_cart a b")).getText();
	}

}
