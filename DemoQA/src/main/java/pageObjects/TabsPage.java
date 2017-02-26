package pageObjects;

import java.net.MalformedURLException;

public class TabsPage extends BasePage {

    private static final String TABS_TEXT = "Tabs";

    TabsPage() throws MalformedURLException {
        waitForHeaderText(TABS_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(TABS_TEXT);
    }

}
