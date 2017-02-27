package pageObjects;

import utils.Driver;

import java.net.MalformedURLException;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "http://demoqa.com/";
    private static final String HOME_TEXT = "Home";

    public static void Goto() throws MalformedURLException {
        Driver.getInstance().get(HOME_PAGE_URL);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(HOME_TEXT);
    }

}