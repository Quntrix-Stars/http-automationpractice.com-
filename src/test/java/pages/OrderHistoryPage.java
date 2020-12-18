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

	@FindBy(xpath = "//*[@id=\"center_column\"]/div")
	WebElement orderBox;

	public String getOrderNumber() {
	String script="function getStr(){\r\n"
			+ "return document.getElementById('center_column').children[2].childNodes[22].textContent.substring(9,0)\r\n"
			+ "}"
			+ "return getStr()";
		JavascriptExecutor js=(JavascriptExecutor) driver;
		System.out.println((String)js.executeAsyncScript(script));
		
		
		
		//$x("//*[@id='center_column']")[0].children[2].childNodes[22].textContent
		
//		System.out.println(waitVisibilityXPath(driver, "//*[@id=\"center_column\"]/div/text()[12]"));
		
//		String ordN = orderNumber.substring(0, 8);
//		return ordN;
		return null;
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
