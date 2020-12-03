package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchBarPage extends BasePage {
	//String url = "http://automationpractice.com/index.php";
	public SearchBarPage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public SearchBarPage navigateTo() {
		super.navigateTo("");
		return this;
	}
	
	public String useSearch() {
		WebElement searchBar = driver.findElement(By.id("search_query_top"));
		searchBar.sendKeys("Dress");
		searchBar.sendKeys(Keys.ENTER);
		return  driver.findElement(By.xpath("//div[@id='center_column']//span[@class='lighter']")).getText();
		
		


	}

}
