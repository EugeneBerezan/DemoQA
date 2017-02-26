package pageObjects;

import java.net.MalformedURLException;

public class AutocompletePage extends BasePage {

    private static final String AUTOCOMPLETE_TEXT = "Autocomplete";

    AutocompletePage() throws MalformedURLException {
        waitForHeaderText(AUTOCOMPLETE_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(AUTOCOMPLETE_TEXT);
    }

}
