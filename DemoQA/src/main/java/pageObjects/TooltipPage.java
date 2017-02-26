package pageObjects;

import java.net.MalformedURLException;

public class TooltipPage extends BasePage {

    private static final String TOOLTIP_TEXT = "Tooltip";

    TooltipPage() throws MalformedURLException {
        waitForHeaderText(TOOLTIP_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(TOOLTIP_TEXT);
    }

}
