package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logoutLink;

    /**
     * This method will get text of logout link
     */
    public String getLogOutLink() {
        log.info("Logout Link :" + logoutLink.toString());
        return getTextFromElement(logoutLink);
    }

    /**
     * This method will click on logout link
     */
    public void clickOnLogoutLink() {
        clickOnElement(logoutLink);
        log.info("Click on logout link :" + logoutLink.toString());
    }
}
