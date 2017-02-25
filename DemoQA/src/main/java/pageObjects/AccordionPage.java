package pageObjects;

public class AccordionPage extends BasePage {

    private static final String ACCORDION_TEXT = "Accordion";

    AccordionPage() {
        waitForHeaderText(ACCORDION_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(ACCORDION_TEXT);
    }

}
