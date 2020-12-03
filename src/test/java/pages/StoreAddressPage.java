package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frameworks.Waiters;

public class StoreAddressPage extends BasePage implements Waiters{
	String url = "/index.php?controller=stores";
	
	public StoreAddressPage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public StoreAddressPage navigateTo() {
		super.navigateTo(url);
		return this;
	}
	
	public String getStores() {
		return driver.findElement(By.cssSelector(".page-heading")).getText();
	}

}
