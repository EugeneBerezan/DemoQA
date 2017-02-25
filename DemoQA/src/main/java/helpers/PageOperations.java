package helpers;

import org.openqa.selenium.By;
import utils.Driver;

public class PageOperations{

    static void select(By block, By option) {
        Driver.getInstance().findElement(block).findElement(option).click();
    }

}
