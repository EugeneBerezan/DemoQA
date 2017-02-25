package pageObjects;

public class DatepickerPage extends BasePage {

    private static final String DATEPICKER_TEXT = "Datepicker";

    DatepickerPage() {
        waitForHeaderText(DATEPICKER_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(DATEPICKER_TEXT);
    }

}
