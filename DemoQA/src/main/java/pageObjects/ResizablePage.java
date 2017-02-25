package pageObjects;

public class ResizablePage extends BasePage {

    private static final String RESIZABLE_TEXT = "Resizable";

    ResizablePage() {
        waitForHeaderText(RESIZABLE_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(RESIZABLE_TEXT);
    }

}
