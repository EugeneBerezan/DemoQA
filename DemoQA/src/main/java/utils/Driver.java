package utils;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static final int TIME_TO_WAIT_IN_SECONDS = 10;
    private static String browser = null;
    private static WebDriver driver = null;
    private static String nodeURL = "http://localhost:4446/wd/hub";

    private Driver() {

    }

    public static void setBrowser(String browser) {
        Driver.browser = browser;
    }

    public static WebDriver getInstance() throws MalformedURLException {
        if (driver == null) {
//            getDriver(browser);
            getGrid(browser);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(TIME_TO_WAIT_IN_SECONDS, TimeUnit.SECONDS);
        }
        return driver;
    }

//    public static WebDriver getGridInstance() throws MalformedURLException {
//        if (driver == null) {
//            getGrid(browser);
//        }
//        return driver;
//    }

    private static WebDriver getGrid(String browser) throws MalformedURLException {
        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                DesiredCapabilities capabilitiesChrome = DesiredCapabilities.chrome();
                capabilitiesChrome.setBrowserName(browser);
                capabilitiesChrome.setPlatform(Platform.LINUX);
                capabilitiesChrome.setVersion("");
                driver = new RemoteWebDriver(new URL(nodeURL), capabilitiesChrome);
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                DesiredCapabilities capabilitiesFirefox = DesiredCapabilities.firefox();
                capabilitiesFirefox.setBrowserName(browser);
                capabilitiesFirefox.setPlatform(Platform.LINUX);
                capabilitiesFirefox.setVersion("");
                driver = new RemoteWebDriver(new URL(nodeURL), capabilitiesFirefox);
                break;
            default:
                new NoSuchElementException("Invalid browser name");
        }
        return driver;
    }

    private static WebDriver getDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                new NoSuchElementException("Invalid browser name");
        }
        return driver;
    }

    public static void close() throws MalformedURLException {
        Driver.getInstance().quit();
//        Driver.getGridInstance().quit();
        driver = null;
    }

}
