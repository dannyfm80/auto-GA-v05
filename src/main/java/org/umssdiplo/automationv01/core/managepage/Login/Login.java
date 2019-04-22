package org.umssdiplo.automationv01.core.managepage.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Login extends BasePage {
    @FindBy(name = "email")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(css = ".btn-primary.btn-block")
    private WebElement loginBtn;

    @FindBy(partialLinkText = "")
    private WebElement testing;

//

    @FindBy(xpath = "html/body/div[2]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement tabHombre;

//    @FindBy(css = "span.site-nav_list_name")
//    private WebElement Mens;

    public void setCredentials() {
        String username = PropertyAccessor.getInstance().getUser();
        String password = PropertyAccessor.getInstance().getPassword();
        CommonEvents.setInputField(usernameInputField, username);
        CommonEvents.setInputField(passwordInputField, password);
        CommonEvents.clickButton(loginBtn);
    }


    public void hoverToElement() {
        CommonEvents.hoverToElement(tabHombre);
    }


//    public void clickShoes() {
//        CommonEvents.clickButton(Shoes);
//    }
}
