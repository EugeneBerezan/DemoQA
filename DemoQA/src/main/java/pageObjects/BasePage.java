package pageObjects;

import utils.AbstractClass;
import utils.Driver;
import com.sun.javafx.binding.StringFormatter;
import org.openqa.selenium.By;

abstract class BasePage extends AbstractClass {

    private static By header(String header) {
        return new By.ByXPath(StringFormatter.format("//header//h1[text()='%s']", header).getValue());
    }

    static void waitForHeaderText(String textToWait) {
        waitForVisibilityOfElement(header(textToWait));
    }

    static boolean isAt(String h1TextOnPage) {
        return h1TextOnPage.equals(Driver.getInstance().findElement(header(h1TextOnPage)).getText());
    }
}
