package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
	
	public ContactUsPage inputMessage(String text) {
		WebElement message = driver.findElement(By.cssSelector("div.form-group textarea"));
		
		
		message.sendKeys(text);
		
		return this;
	}

	public ContactUsPage chooseDropDown(String option) {
		Select dropDown = new Select(driver.findElement(By.id("id_contact")));
		
		dropDown.selectByVisibleText(option);
		return this;
	}
	
	public ContactUsPage inputEmailAdd(String email) {
		WebElement emailAdd = driver.findElement(By.id("email"));
		
		emailAdd.sendKeys(email);
		return this;
	}
	
	public ContactUsPage inputOrderNum(String orderNum) {
		WebElement orderRef = driver.findElement(By.id("id_order"));
		
		orderRef.sendKeys(orderNum);
		return this;
	}
	
	//Need to fix this
	public ContactUsPage chooseFile(String file) {
		WebElement chosenFile = driver.findElement(By.cssSelector("span.filename"));
		
		chosenFile.sendKeys(file);
		return this;
	}
	
	public ContactUsPage submit() {
		WebElement send = driver.findElement(By.id("submitMessage"));
		
		send.click();
		return this;
	}
	
	public String getMessage() {
		return driver.findElement(By.cssSelector("div#center_column h1")).getText();
	}



}
