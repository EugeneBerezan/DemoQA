package pageObjects;

import java.net.MalformedURLException;

public class DraggablePage extends BasePage {

    private static final String DRAGGABLE_TEXT = "Draggable";

    DraggablePage() throws MalformedURLException {
        waitForHeaderText(DRAGGABLE_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(DRAGGABLE_TEXT);
    }

}
