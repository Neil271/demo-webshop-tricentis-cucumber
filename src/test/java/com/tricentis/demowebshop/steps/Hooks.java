package com.tricentis.demowebshop.steps;

import com.tricentis.demowebshop.propertyreader.PropertyReader;
import com.tricentis.demowebshop.utility.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.annotations.BeforeMethod;

public class Hooks extends Utility {

    @BeforeMethod(alwaysRun = true)
    @Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }

    @After
    public void tearDown(Scenario scenario) {
        if(scenario.isFailed()){
            final byte[] screenshot=getScreenShot();
            scenario.attach(screenshot,"image/png",scenario.getName());
        }

        closeBrowser();
    }

}
