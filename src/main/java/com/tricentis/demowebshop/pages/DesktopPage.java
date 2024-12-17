package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerProduct;


    /**
     * This method will click on build your own computer
     */
    public void clickOnBuildYourOwnComputer() {
        clickOnElement(buildYourOwnComputerProduct);
        log.info("Clicking on the build your own computer :" + buildYourOwnComputerProduct.toString());
    }
}
