package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage {
	String url = "/index.php?controller=authentication&back=my-account";

	public SignInPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public SignInPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public String signIn() {
		driver.findElement(By.xpath("/html//input[@id='email']")).sendKeys("testingemail@gmail.com");
		driver.findElement(By.xpath("/html//input[@id='passwd']")).sendKeys("test123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
		return driver.findElement(By.xpath("/html//header[@id='header']//nav//a[@title='Log me out']")).getText();
	}

}
