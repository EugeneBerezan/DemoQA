package pageObjects;

public class TabsPage extends BasePage {

    private static final String TABS_TEXT = "Tabs";

    TabsPage() {
        waitForHeaderText(TABS_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(TABS_TEXT);
    }

}
