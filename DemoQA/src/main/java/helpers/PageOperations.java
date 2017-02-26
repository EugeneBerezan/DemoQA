package helpers;

import org.openqa.selenium.By;
import utils.Driver;

import java.net.MalformedURLException;

public class PageOperations{

    static void select(By block, By option) throws MalformedURLException {

//        Driver.getInstance().findElement(block).findElement(option).click();
        Driver.getGridInstance().findElement(block).findElement(option).click();
    }

}
