package pageObjects;

public class DraggablePage extends BasePage {

    private static final String DRAGGABLE_TEXT = "Draggable";

    DraggablePage() {
        waitForHeaderText(DRAGGABLE_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(DRAGGABLE_TEXT);
    }

}
