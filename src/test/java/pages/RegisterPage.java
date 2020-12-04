package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworks.Person;

public class RegisterPage extends BasePage {
	String url = "/index.php?controller=authentication&back=my-account";
	Person person = new Person();

	public RegisterPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public RegisterPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public RegisterPage insertEmail() {
		waitVisibilityXPath(driver, "//input[@id='email_create']").sendKeys(person.getEmail());
		waitForClickableByXpath(driver, "//button[@id='SubmitCreate']/span").click();
		return this;

	}

	public RegisterPage fillUpForm() {
		// Call other methods to fill form
		fillFirstName();
		fillLastName();
//		fillEmail();
		fillPassword();
		fillAddress();
		fillCity();
		fillState();
		fillZip();
		fillMobile();
		clickRegister();
		return this;
	}

	private void fillFirstName() {
		waitVisibilityXPath(driver, "//*[@id=\"customer_firstname\"]").sendKeys(person.getFirstName());
	}

	private void fillLastName() {
		waitVisibilityXPath(driver, "//input[@id='customer_lastname']").sendKeys(person.getLastName());
	}

	private void fillEmail() {
		waitVisibilityXPath(driver, "/input[@id='email']").sendKeys(person.getEmail());
	}

	private void fillPassword() {
		waitVisibilityXPath(driver, "//input[@id='passwd']").sendKeys(person.getPassword());
	}

	private void fillAddress() {
		waitVisibilityXPath(driver, "//input[@name='address1']").sendKeys(person.getAddress());
	}

	private void fillCity() {
		waitVisibilityXPath(driver, "//input[@id='city']").sendKeys(person.getCity());
	}

	private void fillState() {
		Select dropDown = new Select(driver.findElement(By.xpath("//*[@id='id_state']")));		
		dropDown.selectByVisibleText(person.getState());
	}

	private void fillZip() {
		waitVisibilityXPath(driver, "//input[@id='postcode']").sendKeys(person.getZip());
	}

	private void fillMobile() {
		waitVisibilityXPath(driver, "//input[@id='phone_mobile']").sendKeys(person.getMobile());
	}

	private void clickRegister() {
		waitForClickableByXpath(driver, "//button[@id='submitAccount']/span").click();
	}

}
