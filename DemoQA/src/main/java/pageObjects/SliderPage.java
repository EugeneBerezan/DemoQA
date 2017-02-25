package pageObjects;

public class SliderPage extends BasePage {

    private static final String SLIDER_TEXT = "Slider";

    SliderPage() {
        waitForHeaderText(SLIDER_TEXT);
    }

    public static boolean isAt() {
        return BasePage.isAt(SLIDER_TEXT);
    }

}
