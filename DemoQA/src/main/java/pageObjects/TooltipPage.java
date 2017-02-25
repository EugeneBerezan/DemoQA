package pageObjects;

public class TooltipPage extends BasePage {

    private static final String TOOLTIP_TEXT = "Tooltip";

    TooltipPage() {
        waitForHeaderText(TOOLTIP_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(TOOLTIP_TEXT);
    }

}
