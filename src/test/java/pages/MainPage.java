package pages;

import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

	public MainPage(String url, WebDriver driver) {
		super(url, driver);
	}

	public MainPage navigateTo() {
		super.navigateTo("");
		return this;
	}

	public String getTitle() {
		return super.getTitle();
	}

}
