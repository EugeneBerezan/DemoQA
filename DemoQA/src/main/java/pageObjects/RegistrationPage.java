package pageObjects;

public class RegistrationPage extends BasePage {

    private static final String REGISTRATION_TEXT = "Registration";

    RegistrationPage() {
        waitForHeaderText(REGISTRATION_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(REGISTRATION_TEXT);
    }
}
