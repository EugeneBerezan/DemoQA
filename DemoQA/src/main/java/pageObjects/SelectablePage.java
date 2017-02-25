package pageObjects;

public class SelectablePage extends BasePage {

    private static final String SELECTABLE_TEXT = "Selectable";

    SelectablePage() {
        waitForHeaderText(SELECTABLE_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(SELECTABLE_TEXT);
    }


}
