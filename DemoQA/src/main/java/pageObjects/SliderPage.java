package pageObjects;

import java.net.MalformedURLException;

public class SliderPage extends BasePage {

    private static final String SLIDER_TEXT = "Slider";

    SliderPage() throws MalformedURLException {
        waitForHeaderText(SLIDER_TEXT);
    }

    public static boolean isAt() throws MalformedURLException {
        return BasePage.isAt(SLIDER_TEXT);
    }

}
