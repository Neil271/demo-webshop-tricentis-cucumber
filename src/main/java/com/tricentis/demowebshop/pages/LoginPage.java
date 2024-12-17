package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    WebElement errorMessage;

    /**
     * This method will get welcome text
     */
    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("Welcome text  : " + welcomeText.toString());
        return message;

    }

    /**
     * This method will enter email
     */
    public void setEmail(String emailId) {
        sendTextToElement(email, emailId);
        log.info("Enter Email : " + email.toString());
    }

    /**
     * This method will enter password
     */
    public void setPassword(String pass) {
        sendTextToElement(password, pass);
        log.info("Enter Password : " + password.toString());
    }

    /**
     * This method will click on login button
     */
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Clicking on the login button : " + loginButton.toString());
    }

    /**
     * This method will verify the error message
     */
    public String getErrorMessage() {
        log.info("Error message : " + errorMessage.toString());
        return getTextFromElement(errorMessage);

    }


}
