package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WomenCategoryPage extends BasePage {
	String url = "/index.php?id_category=3&controller=category";

	public WomenCategoryPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public WomenCategoryPage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public String getCategory() {
		return driver.findElement(By.xpath("//span[@class='category-name']")).getText();
	}

}
