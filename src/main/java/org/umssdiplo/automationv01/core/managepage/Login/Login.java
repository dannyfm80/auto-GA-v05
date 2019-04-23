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

    @FindBy(xpath = "//a[@manual_cm_sp='header-_-HOMBRE']")
    private WebElement tabHombre;

    @FindBy(xpath = "//a[@manual_cm_sp='header-_-hombre-_-tenis-_-fútbol']")
//    a[@manual_cm_sp='header-_-hombre-_-tenis-_-fútbol']
    private WebElement Futbol;

    @FindBy(xpath = "//img[@title='Calzado de Fútbol X 18.3 TF']")
    private WebElement Shoe;

    @FindBy(xpath = "//button[@title='Elige tu talla']")
    private WebElement TAM;

    @FindBy(xpath = "//button[@value='BB9398_680']")
    private WebElement Size;

    @FindBy(xpath = "//button[@data-auto-id='add-to-bag']")
    private WebElement AddCarrit;

    @FindBy(xpath = "//span[@data-auto-id='add-to-bag-product-info-qty']")
    private WebElement bagCount;

    @FindBy(xpath = "//a[@data-auto-id='view-bag-desktop']")
    private WebElement VerCar;

    @FindBy(xpath = "//a[@class=\"name\"]")
    private WebElement titleElement;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement pricePartial;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement priceTotal;


    private String priceShoe;

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

    public void clickFutbol() {
        CommonEvents.clickButton(Futbol);
    }

    public void clickShoe() {
        CommonEvents.clickButton(Shoe);
    }

    public void clickTam() {
        CommonEvents.clickButton(TAM);
    }

    public void clickSize() {
        CommonEvents.clickButton(Size);
    }

    public void clickAddCarrito() {
        CommonEvents.clickButton(AddCarrit);
    }

    public int getViewShopingCar() {
        String aux = bagCount.getText();
        aux = aux.replaceAll("\\D+", "");
        System.out.println("  numero es   " + aux);
        int num = Integer.parseInt(aux);
        return num;
    }

    public void clickVerCarrito() {
        CommonEvents.clickButton(VerCar);
    }

    public String getTitle(String title) {
        return titleElement.getText();
    }

    public String getPrice() {
        String aux = pricePartial.getText();
        return aux;
    }

    public String getPriceTotal() {
        String aux = priceTotal.getText();
        return aux;
    }

}
