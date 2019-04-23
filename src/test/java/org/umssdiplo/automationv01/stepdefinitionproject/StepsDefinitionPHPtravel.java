package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionPHPtravel {
    private Login login;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @And("^click 'Check mens' button in 'mens' page$")
    public void clickCheckMensButtonInMensPage() {
//        login.clickMens();
        login.hoverToElement();
    }

    @And("^hover 'Check mens' button in 'mens' page$")
    public void hoverCheckMensButtonInMensPage() {
        login.hoverToElement();
    }


    @And("^click 'Check futbol' button in 'shoes' page$")
    public void clickCheckFutbolButtonInShoesPage() {
        login.clickFutbol();
    }


    @And("^click 'Check Shoe' button in 'shoes' page$")
    public void clickCheckShoeButtonInShoesPage() {
        login.clickShoe();
    }


    @And("^click 'Check tam' button in 'shoes' page$")
    public void clickCheckTamButtonInShoesPage() {
        login.clickTam();
    }

    @And("^click 'Check Size' button in 'shoes' page$")
    public void clickCheckSizeButtonInShoesPage() {
        login.clickSize();
    }

    @And("^click 'Check AddCar' button in 'shoes' page$")
    public void clickCheckAddCarButtonInShoesPage() {
        login.clickAddCarrito();
    }

    @Then("^validate 'CantIsOne' is 'Car' top page$")
    public void validateCantIsOneIsCarTopPage() {
        Integer valueActual = login.getViewShopingCar();
        Integer valueEsperado = 1;
        Assert.assertEquals(valueActual, valueEsperado);
    }

    @And("^click 'Check viewCar' button in 'shoes' page$")
    public void clickCheckViewCarButtonInShoesPage() {
        login.clickVerCarrito();
    }

    @And("^Verify \"([^\"]*)\" title is displayed$")
    public void verifyTitleIsDisplayed(String title) throws Throwable {
        String aux = login.getTitle(title);
        System.out.println(aux);
    }

    @Then("^Verify \"([^\"]*)\" should be displayed$")
    public void verifyShouldBeDisplayed(String amount) throws Throwable {
        String aux = login.getPrice();
        System.out.println("el precio total" + aux);
        Assert.assertEquals(aux, amount, "no es igual");
    }

    @And("^Verify \"([^\"]*)\" price Total$")
    public void verifyPriceTotal(String amount) throws Throwable {
        String aux = login.getPriceTotal();
        System.out.println("el precio total" + aux);
        Assert.assertEquals(aux, amount, "no es igual");
    }


}
