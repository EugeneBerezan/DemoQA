package pageObjects;

public class MenuPage extends BasePage {

    private static final String MENU_TEXT = "Menu";

    MenuPage() {
        waitForHeaderText(MENU_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(MENU_TEXT);
    }

}
