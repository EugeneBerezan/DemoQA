package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    public static final int TIME_TO_WAIT_IN_SECONDS = 10;
    private static WebDriver driver = null;

    private Driver() {

    }

    public static WebDriver getInstance() {
        if (driver == null) {
//            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//        driver = new ChromeDriver();
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(TIME_TO_WAIT_IN_SECONDS, TimeUnit.SECONDS);

        }

        return driver;
    }

    public static void close() {
        Driver.getInstance().quit();
        driver = null;
    }

}
