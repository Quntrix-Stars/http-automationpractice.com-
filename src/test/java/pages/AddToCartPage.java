package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import frameworks.Waiters;

public class AddToCartPage extends BasePage implements Waiters{
	String url="/index.php?id_category=5&controller=category";
	
	public AddToCartPage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public AddToCartPage navigateTo() {
		super.navigateTo(url);
		return this;
	}
	
	public AddToCartPage hoverItem() {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
		WebElement item = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		item.click();
		waitVisibilityId(driver, "add_to_cart");
		return this;
	}
	
	public AddToCartPage clickAddCart() {
//		waitForClickableByXpath(driver, "//*[@id=\"add_to_cart\"]/button").click();
		WebElement base = driver.findElement(By.xpath("//*[@id=\"product\"]/div"));
		base.findElement(By.xpath("//*[@id=\\\"add_to_cart\\\"]/button")).click();
		
		return this;
	}
	
	public String getString() {
		return driver.findElement(By.className("h2 i.icon-ok")).getText();
	}
	
	

}
