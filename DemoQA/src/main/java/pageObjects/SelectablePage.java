package pageObjects;

import java.net.MalformedURLException;

public class SelectablePage extends BasePage {

    private static final String SELECTABLE_TEXT = "Selectable";

    SelectablePage() throws MalformedURLException {
        waitForHeaderText(SELECTABLE_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(SELECTABLE_TEXT);
    }


}
