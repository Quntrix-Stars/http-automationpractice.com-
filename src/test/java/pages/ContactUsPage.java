package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import frameworks.Waiters;

public class ContactUsPage extends BasePage implements Waiters {
	String url = "/index.php?controller=contact";

	public ContactUsPage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public ContactUsPage navigateTo() {
		super.navigateTo(url);
		return this;
	}
	
	public String getMessage() {
		return driver.findElement(By.cssSelector("div.form-group label[for='message']")).getText();
	}

}
