package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
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

//    @And("^click 'Check Shoes' button in 'shoes' page$")
//    public void clickCheckShoesButtonInShoesPage() {
//        login.clickShoes();
//    }


}
