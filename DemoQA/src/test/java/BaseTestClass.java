import pageObjects.HomePage;
import utils.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        HomePage.Goto();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Driver.close();
    }
}
