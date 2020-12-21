package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistoryPage extends CheckOutPage {

	public OrderHistoryPage(String url, WebDriver driver) {
		super(url, driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/p/a")
	WebElement backToOrders;
	
	@FindBy(xpath = "//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a")
	WebElement lastOrderRef;
	
	public OrderHistoryPage returnToOrders() {
		backToOrders.click();
		return this;
	}
	
	public String getLastOrderNo() {
		return lastOrderRef.getText();
	}
	

	public String getOrderNumber() {
		String script = "function getStr(){"
				+ "return document.getElementById('center_column').children[2].childNodes[20].textContent.substring(47,47+9)"
				+ "}" + "return getStr()";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return (String) js.executeScript(script);
	}

	@Override
	public OrderHistoryPage navigateTo() {
		super.navigateTo();
		return this;
	}

	@Override
	public OrderHistoryPage addProduct() {
		super.addProduct();
		return this;
	}

	@Override
	public OrderHistoryPage proceedToCheckOut() {
		super.proceedToCheckOut();
		return this;
	}

	@Override
	public OrderHistoryPage proceedToCheckOut2() {
		super.proceedToCheckOut2();
		return this;
	}

	@Override
	public OrderHistoryPage proceedToCheckOut3() {
		super.proceedToCheckOut3();
		return this;
	}

	@Override
	public OrderHistoryPage signIn() {
		super.signIn();
		return this;
	}

	@Override
	public OrderHistoryPage paymentMethod() {
		super.paymentMethod();
		return this;
	}

	@Override
	public OrderHistoryPage confirmOrder() {
		super.confirmOrder();
		return this;
	}
}
