package pageObjects;

import java.net.MalformedURLException;

public class RegistrationPage extends BasePage {

    private static final String REGISTRATION_TEXT = "Registration";

    RegistrationPage() throws MalformedURLException {
        waitForHeaderText(REGISTRATION_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(REGISTRATION_TEXT);
    }
}
