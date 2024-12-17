package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[2]/a")
    WebElement computerTab;


    /**
     * This method will Click on login link
     */
    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    /**
     * This method will get login text
     */
    public String getLoginText() {
        log.info("Login link : " + loginLink.toString());
        return getTextFromElement(loginLink);
    }

    /**
     * This method will click on register link
     */
    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    /**
     * This method will Click on computer tab
     */
    public void clickOnComputerTab() {
        clickOnElement(computerTab);
        log.info("Clicking on computer tab : " + computerTab.toString());
    }
}
