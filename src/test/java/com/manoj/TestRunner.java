package com.manoj;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.manoj.stepdefinitions" // Specify the package containing all step definition files
)
public class TestRunner {
}
