package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDescriptionPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductDescriptionPage.class.getName());

    @CacheLookup
    @FindBy(css = "#product_attribute_16_5_4")
    WebElement processor;

    @CacheLookup
    @FindBy(css = "#product_attribute_16_6_5")
    WebElement selectRAM;

    @CacheLookup
    @FindBy(xpath = "//div[@class='add-to-cart-panel']/input[2]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(css = "body > div:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > dl:nth-child(1) > dd:nth-child(6) > ul>li>label")
    List<WebElement> hdd;

    @CacheLookup
    @FindBy(css = "body > div:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > dl:nth-child(1) > dd:nth-child(8) > ul:nth-child(1) > li>label")
    List<WebElement> os;

    @CacheLookup
    @FindBy(css = "body > div:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > dl:nth-child(1) > dd:nth-child(10) > ul:nth-child(1) > li>label")
    List<WebElement> software;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement successfulMessage;

    /**
     * This method will select processor
     */
    public void selectProcessorType(String option) {
        selectByVisibleTextFromDropDown(processor, option);
        log.info("Select Processor :" + processor.toString());
    }

    /**
     * This method will select RAM
     */
    public void selectRAMType(String option) {
        selectByVisibleTextFromDropDown(selectRAM, option);
        log.info("Select RAM :" + selectRAM.toString());
    }

    /**
     * This method will Click on Add To Cart Button
     */
    public void clickOnAddToCartButton() {
        clickOnElement(addToCart);
        log.info("Click on Add To Cart Button :" + addToCart.toString());
    }

    /**
     * This method will select hdd
     */
    public void selectHdd(String h) {
        for (WebElement element : hdd) {
            if (element.getText().equals(h)) {
                element.click();
            }
        }
        log.info("Select HDD :" + hdd.toString());
    }

    /**
     * This method will select os
     */
    public void selectOs(String o) {
        for (WebElement element : os) {
            if (element.getText().equals(o)) {
                element.click();
            }
        }
        log.info("Select OS :" + os.toString());
    }

    /**
     * This method will select software
     */
    public void selectSoftware(String s) {
        for (WebElement element : software) {
            if (element.getText().equals(s)) {
                element.click();
            }
        }
        log.info("Select Software :" + software.toString());
    }

    public String getSuccessfulMessage() {
        return getTextFromElement(successfulMessage);
    }
}
