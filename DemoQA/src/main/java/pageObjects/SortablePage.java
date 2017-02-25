package pageObjects;

public class SortablePage extends BasePage {

    private static final String SORTABLE_TEXT = "Sortable";

    SortablePage() {
        waitForHeaderText(SORTABLE_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(SORTABLE_TEXT);
    }

}
