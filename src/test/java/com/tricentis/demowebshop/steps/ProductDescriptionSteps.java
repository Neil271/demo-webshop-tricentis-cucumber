package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.pages.ProductDescriptionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductDescriptionSteps {
    @And("I select processor {string}")
    public void iSelectProcessor(String p) {
        new ProductDescriptionPage().selectProcessorType(p);
    }

    @And("I select RAM {string}")
    public void iSelectRAM(String r) {
        new ProductDescriptionPage().selectRAMType(r);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String h) {
        new ProductDescriptionPage().selectHdd(h);
    }

    @And("I select OS {string}")
    public void iSelectOS(String o) {
        new ProductDescriptionPage().selectOs(o);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String s) {
        new ProductDescriptionPage().selectSoftware(s);
    }

    @And("I click on ADD TO CART Button")
    public void iClickOnADDTOCARTButton() {
        new ProductDescriptionPage().clickOnAddToCartButton();
    }

    @Then("I should see the sucesssfull message {string}")
    public void iShouldSeeTheSuccessfulMessage(String expected) {
        Assert.assertEquals(new ProductDescriptionPage().getSuccessfulMessage(),expected,"Successful Message is not displayed");
    }
}
