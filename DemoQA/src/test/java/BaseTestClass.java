import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pageObjects.HomePage;
import utils.Driver;

import java.net.MalformedURLException;

public class BaseTestClass {

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) throws InterruptedException, MalformedURLException {
        Driver.setBrowser(browser);
        Driver.getInstance();
//        Driver.getGridInstance();
        HomePage.Goto();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException, MalformedURLException {
        Driver.close();
    }
}
