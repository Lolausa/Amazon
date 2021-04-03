package com.Amazon.Step_Definition;

import com.Amazon.Utilities.Configuration_reader;
import com.Amazon.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Given("user gets to Amazon page")
    public void user_gets_to_amazon_page() {

    }
    @Then("user sees the Amazon title")
    public void user_sees_the_amazon_title() {
        String expectedTitle = "Amazon.com";
        String actualTitle = Driver.getDriver().getTitle();

   //     wait.until(ExpectedConditions.urlToBe(Configuration_reader.getProperties("url")));
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
