package gayathri.testerscafe.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public abstract class PageActions {
    public List<WebElement> getElements(WebDriver driver, By locator) {
        return driver.findElements(locator);
    }

}
