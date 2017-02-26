package pageObjects;

import com.sun.javafx.binding.StringFormatter;
import org.openqa.selenium.By;
import utils.AbstractClass;
import utils.Driver;

import java.net.MalformedURLException;

abstract class BasePage extends AbstractClass {

    private static By header(String header) {
        return new By.ByXPath(StringFormatter.format("//header//h1[text()='%s']", header).getValue());
    }

    static void waitForHeaderText(String textToWait) throws MalformedURLException {
        waitForVisibilityOfElement(header(textToWait));
    }

    static boolean isAt(String h1TextOnPage) throws MalformedURLException {
//        return h1TextOnPage.equals(Driver.getInstance().findElement(header(h1TextOnPage)).getText());
        return h1TextOnPage.equals(Driver.getGridInstance().findElement(header(h1TextOnPage)).getText());
    }
}
