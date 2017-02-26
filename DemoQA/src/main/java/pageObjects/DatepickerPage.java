package pageObjects;

import java.net.MalformedURLException;

public class DatepickerPage extends BasePage {

    private static final String DATEPICKER_TEXT = "Datepicker";

    DatepickerPage() throws MalformedURLException {
        waitForHeaderText(DATEPICKER_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(DATEPICKER_TEXT);
    }

}
