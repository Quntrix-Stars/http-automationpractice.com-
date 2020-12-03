package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SortSizePage extends BasePage {
	String url = "/index.php?id_category=8&controller=category";
	
	public SortSizePage(String url, WebDriver driver) {
		super(url, driver);
	}
	
	public SortSizePage navigateTo() {
		super.navigateTo(url);
		return this;
	}

	public String sortSize() throws InterruptedException {
		WebElement smallSize = driver.findElement(By.xpath("/html//form[@id='layered_form']/div/div[2]/ul[@class='col-lg-12 layered_filter_ul']/li[1]/div//input[@name='layered_id_attribute_group_1']"));
		WebElement mediumSize = driver.findElement(By.xpath("/html//form[@id='layered_form']/div/div[2]/ul[@class='col-lg-12 layered_filter_ul']/li[2]/div//input[@name='layered_id_attribute_group_2']"));
		WebElement largeSize = driver.findElement(By.xpath("/html//form[@id='layered_form']/div/div[2]/ul[@class='col-lg-12 layered_filter_ul']/li[3]/div//input[@name='layered_id_attribute_group_3']"));
		//Click ON
		smallSize.click();
		Thread.sleep(2000);
		mediumSize.click();
		Thread.sleep(2000);
		largeSize.click();
		Thread.sleep(2000);
		//Click OFF
		smallSize.click();
		Thread.sleep(2000);
		mediumSize.click();
		Thread.sleep(2000);
		largeSize.click();
		return url;
		
	}
}
