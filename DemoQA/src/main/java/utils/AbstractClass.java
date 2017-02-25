package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractClass {

    public static void waitForElementToBeClicable(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 120);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForVisibilityOfElement(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForInVisibilityOfElement(By locator) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 120);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static void selectOptionInBlock(By block, By option) {
        Driver.getInstance().findElement(block).findElement(option).click();
    }
}

