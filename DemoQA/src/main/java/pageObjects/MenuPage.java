package pageObjects;

import java.net.MalformedURLException;

public class MenuPage extends BasePage {

    private static final String MENU_TEXT = "Menu";

    MenuPage() throws MalformedURLException {
        waitForHeaderText(MENU_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(MENU_TEXT);
    }

}
