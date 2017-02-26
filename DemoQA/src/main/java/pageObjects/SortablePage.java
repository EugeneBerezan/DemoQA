package pageObjects;

import java.net.MalformedURLException;

public class SortablePage extends BasePage {

    private static final String SORTABLE_TEXT = "Sortable";

    SortablePage() throws MalformedURLException {
        waitForHeaderText(SORTABLE_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(SORTABLE_TEXT);
    }

}
