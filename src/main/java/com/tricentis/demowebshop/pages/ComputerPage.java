package com.tricentis.demowebshop.pages;

import com.tricentis.demowebshop.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement categoriesName;

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement desktop;

    /**
     * This method will get computer text
     */
    public String getProductCategoriesText() {
        log.info("Product Category Name :" + categoriesName.toString());
        return getTextFromElement(categoriesName);
    }

    /**
     * This method will click on Desktop
     */
    public void clickOnDesktop() {
        clickOnElement(desktop);
        log.info("Clicking on the Desktop :" + desktop.toString());
    }
}
