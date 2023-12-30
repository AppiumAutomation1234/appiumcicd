package com.qa.stepdef;

import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @When("I enter the user name as {string}")
    public void iEnterTheUserNameAs(String username) throws InterruptedException {
        //new LoginPage().enterUserName(username);
        System.out.println(username);
    }

    @When("I enter the password as {string}")
    public void iEnterThePasswordAs(String password) {
        new LoginPage().enterPassword(password);
    }

    @When("I clicked on login button")
    public void iClickedOnLoginButton() {
        new LoginPage().pressLoginBtn();
    }

    @Then("login should fail with an error {string}")
    public void loginShouldFailWithAnError(String errorMessage) {
        Assert.assertEquals(new LoginPage().getErrTxt(), errorMessage);
    }

    @Then("I should see product page with title as {string}")
    public void iShouldSeeProductPageWithTitleAs(String title) {
        Assert.assertEquals(new ProductsPage().getTitle(), title);
    }
}
