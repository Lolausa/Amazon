package com.Amazon.Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                plugin = {
                        "pretty", "json:target/cucumber.json",
                        "html:target/cucumber-report.html",
                        "rerun:target/rerun.txt"
                },

                features = "src/test/resources/Features",
                glue = "com/Amazon/Step_Definition",
                dryRun = false,
                tags = ""
        )

public class CukesRunner {
}
