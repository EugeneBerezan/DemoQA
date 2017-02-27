import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.HomePage;
import utils.Driver;

import java.net.MalformedURLException;

public class BaseTestClass {

    @BeforeMethod
    public void setUp() throws InterruptedException, MalformedURLException {
        Driver.getInstance();
        HomePage.Goto();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException, MalformedURLException {
        Driver.close();
    }
}
