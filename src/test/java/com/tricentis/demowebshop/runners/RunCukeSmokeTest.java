package com.tricentis.demowebshop.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/tricentis/demowebshop/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html", //default cucumber plug in
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",  // extent report plug in
                "json:target/cucumber-reports/cucumber.json"},
        tags="@smoke"
)
public class RunCukeSmokeTest extends AbstractTestNGCucumberTests {
}
