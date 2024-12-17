package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement registerButton;

    @CacheLookup
    @FindBy(css = "span[for='FirstName']")
    WebElement requireFirstName;

    @CacheLookup
    @FindBy(css = "span[for='LastName']")
    WebElement requireLastName;

    @CacheLookup
    @FindBy(css = "span[for='Email']")
    WebElement requireEmail;

    @CacheLookup
    @FindBy(css = "span[for='Password']")
    WebElement requirePassword;

    @CacheLookup
    @FindBy(css = "span[for='ConfirmPassword']")
    WebElement requireConfirmPassword;

    @CacheLookup
    @FindBy(css = "#FirstName")
    WebElement firstName;

    @CacheLookup
    @FindBy(css = "#LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(css = "#Email")
    WebElement emailId;

    @CacheLookup
    @FindBy(css = "#Password")
    WebElement password;

    @CacheLookup
    @FindBy(css = "#ConfirmPassword")
    WebElement confirmPassword;

    @CacheLookup
    @FindBy(css = ".result")
    WebElement registeredUserSuccessful;

    @CacheLookup
    @FindBy(css = "label[class='forcheckbox']")
    List<WebElement> gender;


    /**
     * This method will get register text
     */
    public String getRegisterText() {
        log.info("Register Text :" + registerText.toString());
        return getTextFromElement(registerText);
    }

    /**
     * This method will click on register button
     */
    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("Clicking on register button :" + registerButton.toString());
    }

    /**
     * This method will get the FirstName error message
     */
    public String getRequiredFirstNameErrorMessage() {
        log.info("First Name Error Message :" + requireFirstName.toString());
        return getTextFromElement(requireFirstName);
    }

    /**
     * This method will get the LastName error message
     */
    public String getRequiredLastNameErrorMessage() {
        log.info("Last Name Error Message :" + requireLastName.toString());
        return getTextFromElement(requireLastName);
    }

    /**
     * This method will get the Email error message
     */
    public String getRequiredEmailErrorMessage() {
        log.info("Email error message :" + requireEmail.toString());
        return getTextFromElement(requireEmail);
    }

    /**
     * This method will get the Password error message
     */
    public String getRequiredPasswordErrorMessage() {
        log.info("Password error message :" + requirePassword.toString());
        return getTextFromElement(requirePassword);
    }

    /**
     * This method will get the ConfirmPassword error message
     */
    public String getRequiredConfirmPasswordErrorMessage() {
        log.info("Confirm Password Error Message :" + requireConfirmPassword.toString());
        return getTextFromElement(requireConfirmPassword);
    }

    /**
     * This method will enter the first name
     */
    public void setFirstName(String fName) {
        log.info("Enter The First Name :" + firstName.toString());
        sendTextToElement(firstName, fName);
    }

    /**
     * This method will enter the last name
     */
    public void setLastName(String lName) {
        log.info("Enter The Last Name :" + lastName.toString());
        sendTextToElement(lastName, lName);
    }

    /**
     * This method will enter the email
     */
    public void setEmail(String email) {
        log.info("Enter The Last email :" + emailId.toString());
        sendTextToElement(emailId, email);
    }

    /**
     * This method will enter the password
     */
    public void setPassword(String pass) {
        log.info("Enter The Password :" + password.toString());
        sendTextToElement(password, pass);
    }

    /**
     * This method will enter the confirm password
     */
    public void setConfirmPassword(String cPass) {
        log.info("Enter The Confirm Password :" + confirmPassword.toString());
        sendTextToElement(confirmPassword, cPass);
    }

    /**
     * This method will get register user message
     */
    public String getRegisteredUserMessage() {
        log.info("Registered User Message :" + registeredUserSuccessful.toString());
        return getTextFromElement(registeredUserSuccessful);
    }

    /**
     * This method will select gender
     */
    public void selectGender(String g) {
        for (WebElement element : gender) {
            if (element.getText().equals(g)) {
                element.click();
            }
        }
        log.info("Select Gender :" + gender.toString());
    }

}
