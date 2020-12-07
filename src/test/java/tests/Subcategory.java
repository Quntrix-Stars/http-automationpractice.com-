package tests;

import fundamentals.FailListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SubcategoryPage;

@Listeners(FailListener.class)
public class Subcategory extends TestBase {
    @Test
    public void subcat() {
        String inpt = "Blouses";
        String expected = inpt + " - My Store";
        String actual = new SubcategoryPage(baseUrl, driver).navigateTo().chooseSubcat(inpt).getTitle();
        Assert.assertEquals(actual, expected);
    }
}
