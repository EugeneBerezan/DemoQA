package pageObjects;

import java.net.MalformedURLException;

public class AccordionPage extends BasePage {

    private static final String ACCORDION_TEXT = "Accordion";

    AccordionPage() throws MalformedURLException {
        waitForHeaderText(ACCORDION_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(ACCORDION_TEXT);
    }

}
