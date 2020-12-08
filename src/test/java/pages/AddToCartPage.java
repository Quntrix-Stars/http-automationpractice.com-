package pages;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import frameworks.Waiters;

public class AddToCartPage extends BasePage implements Waiters {
	String url = "/index.php?id_category=5&controller=category";

	public AddToCartPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public AddToCartPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public AddToCartPage hoverItem() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Actions actions = new Actions(driver);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		WebElement image = driver.findElement(By.xpath("//li[@id='list']//i[@class='icon-th-list']"));
		waitVisibility(image, driver);
		image.click();


		return this;
	}

	public AddToCartPage clickAddCart() {
		WebElement button = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div/div[3]/div/div[2]/a[1]/span"));
		waitForClickable(driver, button);
		button.click();
		return this;
	}

	public String getString() {
		WebElement text = waitForClickable(driver, driver.findElement(By.xpath("/html//div[@id='layer_cart']/div[1]/div[1]/h2")));
		return text.getText();
	}

}
