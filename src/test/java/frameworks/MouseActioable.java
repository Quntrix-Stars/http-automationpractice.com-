package frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public interface MouseActioable {
    default void mouseMoveTo(WebDriver driver, WebElement target) {
        Actions actions = new Actions(driver);
        actions.moveToElement(target).perform();
    }
}
