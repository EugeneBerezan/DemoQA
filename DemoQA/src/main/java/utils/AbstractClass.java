package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

public abstract class AbstractClass {

    public static void waitForElementToBeClicable(By locator) throws MalformedURLException {
//        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 120);
        WebDriverWait wait = new WebDriverWait(Driver.getGridInstance(), 120);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void waitForVisibilityOfElement(By locator) throws MalformedURLException {
//        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 120);
        WebDriverWait wait = new WebDriverWait(Driver.getGridInstance(), 120);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForInVisibilityOfElement(By locator) throws MalformedURLException {
//        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), 120);
        WebDriverWait wait = new WebDriverWait(Driver.getGridInstance(), 120);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static void selectOptionInBlock(By block, By option) throws MalformedURLException {
//        Driver.getInstance().findElement(block).findElement(option).click();
        Driver.getGridInstance().findElement(block).findElement(option).click();
    }
}

