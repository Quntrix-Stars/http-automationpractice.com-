package tests;

import frameworks.Person;
import fundamentals.CSVDataReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.RegisterPage;

import java.util.List;

public class RegisterPageTest extends TestBase {
    List<Person> personsList;
    String fileName = "PersonData.csv";

    @DataProvider(name = "data-provider")
    public Object[] studentProvider() {
        return new Object[]{personsList.get(0)};
    }

    @Test(dataProvider = "data-provider")
    public void registerAccount(Person person) {
        String actual = new RegisterPage(baseUrl, driver, person).navigateTo()
                .insertEmail()
                .fillUpForm()
                .getTitle();
        Assert.assertEquals(actual, "My account - My Store");
    }

    @BeforeClass
    public void getPersons() {
        personsList = new CSVDataReader().csvRead(fileName);
    }
}
