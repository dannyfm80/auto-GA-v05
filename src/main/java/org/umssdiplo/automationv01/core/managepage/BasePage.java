package org.umssdiplo.automationv01.core.managepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;


/**
 * Class represent the base page
 *
 * @author <a href="mailto:luis.marcelo.garay@gmail.com">Marcelo Garay</a>
 * @version 1.0.0
 */
public abstract class BasePage {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;

    /**
     * This method is the constructor class.
     */
    public BasePage() {
        webDriver = ManageDriver.getInstance().getWebDriver();
        webDriverWait = ManageDriver.getInstance().getWebDriverWait();
        PageFactory.initElements(webDriver, this);
    }

    public static void hoverToElement(String ele) {
        Actions builder = new Actions(ManageDriver.getInstance().getWebDriver());
        WebElement element = ManageDriver.getInstance().getWebDriver().findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a"));
        builder.moveToElement(element).build().perform();
    }


}
