package pages;

import frameworks.MouseActioable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubcategoryPage extends BasePage implements MouseActioable {
    @FindBy(xpath = "//ul//a[@title='Women']")
    WebElement womenCat;

    public SubcategoryPage(String url, WebDriver driver) {
        super(url, driver);
        PageFactory.initElements(driver, this);
    }


    public SubcategoryPage navigateTo() {
        super.navigateTo("");
        return this;
    }

    private void moveMouseToWCat() {
        mouseMoveTo(driver, womenCat);
    }

    private void clickOnSubcat(String subcat) {
        String xpath = "//ul//a[@title='" + subcat + "']";
        driver.findElement(By.xpath(xpath)).click();
    }


    public SubcategoryPage chooseSubcat(String subcat) {
        moveMouseToWCat();
        clickOnSubcat(subcat);
        return this;
    }
}
