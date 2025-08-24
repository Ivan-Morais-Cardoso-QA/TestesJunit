package com.mycompany.app.steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.mycompany.app.steps", // pacote das step definitions
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true
)
)
public class RunCucumberTest {
}