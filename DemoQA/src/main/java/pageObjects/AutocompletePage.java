package pageObjects;

public class AutocompletePage extends BasePage {

    private static final String AUTOCOMPLETE_TEXT = "Autocomplete";

    AutocompletePage() {
        waitForHeaderText(AUTOCOMPLETE_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(AUTOCOMPLETE_TEXT);
    }

}
