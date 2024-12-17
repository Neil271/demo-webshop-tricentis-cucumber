package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.DesktopPage;
import com.tricentis.demowebshop.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ComputerSteps {
    @When("I click on the COMPUTER tab")
    public void iClickOnTheCOMPUTERTab() {
        new HomePage().clickOnComputerTab();
    }


    @And("I click on the Desktops link")
    public void iClickOnTheDesktopsLink() {
        new ComputerPage().clickOnDesktop();
    }

    @And("I click on the product name Build your own computer")
    public void iClickOnTheProductNameBuildYourOwnComputer() {
        new DesktopPage().clickOnBuildYourOwnComputer();
    }
}
