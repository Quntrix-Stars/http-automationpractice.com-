package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReturnHomePage extends BasePage{
	String url = "/index.php?id_category=8&controller=category";
	
	public ReturnHomePage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public ReturnHomePage navigateTo() {
		super.navigateTo(url);
		return this;
	}
	
	public String returnHome() {
		WebElement homeButton = driver.findElement(By.xpath("//div[@id='header_logo']//img[@alt='My Store']"));
		homeButton.click();		
		return driver.getCurrentUrl();
	}

}
