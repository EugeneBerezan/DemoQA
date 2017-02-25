package pageObjects;

import utils.Driver;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_URL = "http://demoqa.com/";
    private static final String HOME_TEXT = "Home";

    public static void Goto() {
        Driver.getInstance().get(HOME_PAGE_URL);
    }

    public static boolean isAt() {
        return BasePage.isAt(HOME_TEXT);
    }

}