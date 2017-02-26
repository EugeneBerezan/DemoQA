package pageObjects;

import java.net.MalformedURLException;

public class ResizablePage extends BasePage {

    private static final String RESIZABLE_TEXT = "Resizable";

    ResizablePage() throws MalformedURLException {
        waitForHeaderText(RESIZABLE_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(RESIZABLE_TEXT);
    }

}
