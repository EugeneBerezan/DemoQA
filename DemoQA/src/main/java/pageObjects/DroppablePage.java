package pageObjects;

import java.net.MalformedURLException;

public class DroppablePage extends BasePage {

    private static final String DROPPABLE_TEXT = "Droppable";

    DroppablePage() throws MalformedURLException {
        waitForHeaderText(DROPPABLE_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(DROPPABLE_TEXT);
    }

}
