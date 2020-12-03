package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import loadingConfig.TestLoadManager;

public class TestBase {
	public WebDriver driver;
	protected String baseUrl;

	@BeforeMethod
	public void beforeMethod(ITestContext context) {
		TestLoadManager manager = new TestLoadManager();
		manager.loadConfigurations("config.properties");
		driver = manager.driver;
		baseUrl = manager.baseUrl;
		context.setAttribute("driver", driver);
	}
	


	@AfterMethod
	public void afterMethod(ITestResult result) {
		driver.close();
	}

}
