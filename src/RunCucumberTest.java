package com.wdms.mmc.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"},
        glue = {"com.wdms.mmc.test"},
        plugin = {"pretty",
                "html:reports/html-report",
                "json:reports/cucumber.json",
                "junit:reports/cucumber.xml"})
public class RunCucumberTest {

}
