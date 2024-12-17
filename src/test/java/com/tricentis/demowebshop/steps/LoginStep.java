package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStep {
    @Given("I am on homepage")
    public void iAmOnHomepage() {

    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }


    @Then("I should see the {string} message display")
    public void iShouldSeeTheMessageDisplay(String expectedMessage) {
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Welcome, Please Sign In!");
    }

    @And("I Enter EmailId {string}")
    public void iEnterEmailId(String e) {
        new LoginPage().setEmail(e);
    }

    @And("I Enter Password {string}")
    public void iEnterPassword(String pass) {
        new LoginPage().setPassword(pass);
    }

    @And("I click on the Login Button")
    public void iClickOnTheLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the Error message")
    public void iShouldSeeTheErrorMessage() {
        String actualMessage = new LoginPage().getErrorMessage();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect";
        Assert.assertEquals(actualMessage, expected, "Error message is not displayed");

    }

    @Then("I should see that Login link is displayed")
    public void iShouldSeeThatLoginLinkIsDisplayed() {
        String actualText = new HomePage().getLoginText();
        String expectedText = "Log in";
        Assert.assertEquals(actualText, expectedText, "Log in link not displayed");
    }
}
