package com.Amazon.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = "src/test/resources/Features",
                glue = "com/Amazon/Step_Definition",
                dryRun = false
        )

public class CukesRunner {
}
