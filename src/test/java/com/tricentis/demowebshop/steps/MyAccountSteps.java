package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountSteps {

    @Then("I should see that the LogOut link is displayed")
    public void iShouldSeeThatTheLogOutLinkIsDisplayed() {
        String expectedMessage = "Log out";
        String actualMessage = new MyAccountPage().getLogOutLink();
        Assert.assertEquals(actualMessage, expectedMessage, "Log out link not displayed");
    }

    @And("I click on the Logout Button")
    public void iClickOnTheLogoutButton() {
        new MyAccountPage().clickOnLogoutLink();
    }
}
