package pageObjects;

public class DroppablePage extends BasePage {

    private static final String DROPPABLE_TEXT = "Droppable";

    DroppablePage() {
        waitForHeaderText(DROPPABLE_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(DROPPABLE_TEXT);
    }

}
