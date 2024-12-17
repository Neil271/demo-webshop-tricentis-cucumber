package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on the Register Link")
    public void iClickOnTheRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should see the {string} text")
    public void iShouldSeeTheText(String expected) {
        Assert.assertEquals(new RegisterPage().getRegisterText(), expected, "Register text not displayed");
    }

    @And("I click on the Register Button")
    public void iClickOnTheButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I should see the error message {string}")
    public void iShouldSeeTheErrorMessage(String expected) {
        if (expected.equals("First name is required.")) {
            Assert.assertEquals(new RegisterPage().getRequiredFirstNameErrorMessage(), expected, "Error message not displayed");
        }
        if (expected.equals("Last name is required.")) {
            Assert.assertEquals(new RegisterPage().getRequiredLastNameErrorMessage(), expected, "Error message not displayed");
        }
        if (expected.equals("Email is required.")) {
            Assert.assertEquals(new RegisterPage().getRequiredEmailErrorMessage(), expected, "Error message not displayed");
        }
        if (expected.equals("Password is required.")) {
            Assert.assertEquals(new RegisterPage().getRequiredPasswordErrorMessage(), expected, "Error message not displayed");
        }

    }

    @Then("And I should see the error message {string}")
    public void andIShouldSeeTheErrorMessage(String expected) {
        Assert.assertEquals(new RegisterPage().getRequiredConfirmPasswordErrorMessage(), expected, "Error message not displayed");
    }

    @And("I select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().selectGender(gender);
    }

    @And("I enter the first name {string}")
    public void iEnterTheFirstName(String fName) {
        new RegisterPage().setFirstName(fName);
    }

    @And("I enter the last name {string}")
    public void iEnterTheLastName(String lName) {
        new RegisterPage().setLastName(lName);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String e) {
        new RegisterPage().setEmail(e);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String pass) {
        new RegisterPage().setPassword(pass);
    }

    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String cPass) {
        new RegisterPage().setConfirmPassword(cPass);
    }

    @Then("I should see the message {string}")
    public void iShouldSeeTheMessage(String expected) {
        Assert.assertEquals(new RegisterPage().getRegisteredUserMessage(), expected, "Registered Successful message not displayed");
    }
}
