package com.qa.stepdef;

import com.qa.pages.GeneralStorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class GeneralStoreStepDef {

    @When("I select the country name as {string} from drop down want to shop")
    public void iSelectTheCountryNameAsFromDropDownWantToShop(String country) throws InterruptedException {
        new GeneralStorePage().setCountrySelection(country);
    }
    @When("I enter the user name as {string} in General")
    public void iEnterTheUserNameAsInGeneral(String username) throws InterruptedException {
        new GeneralStorePage().enterUserNameStore(username);
    }

    @And("Select the gender as {string}")
    public void selectTheGenderAs(String genderName) {
        new GeneralStorePage().setGender(genderName);
    }

    @And("Click on shop button")
    public void clickOnShopButton() {
        new GeneralStorePage().setShopButton();
    }
}
