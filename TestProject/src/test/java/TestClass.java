import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestClass {

    private WebDriver driver;

    @Test
    public void test1() throws MalformedURLException, InterruptedException {
//        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        DesiredCapabilities capabilitiesFirefox = DesiredCapabilities.firefox();
        capabilitiesFirefox.setBrowserName("Firefox");
        capabilitiesFirefox.setPlatform(Platform.LINUX);
        capabilitiesFirefox.setVersion("");
        driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"), capabilitiesFirefox);

        driver.get("https://google.com");
        Thread.sleep(10000);
    }

}
