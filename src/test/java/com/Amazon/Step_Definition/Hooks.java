package com.Amazon.Step_Definition;

import com.Amazon.Utilities.Configuration_reader;
import com.Amazon.Utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Before
    public static void setup() {

        Driver.getDriver().get(Configuration_reader.getProperties("url"));

 //       wait.until(ExpectedConditions.urlToBe(Configuration_reader.getProperties("url")));
    }

    @After
    public static void teardown() {

        Driver.getDriver().close();
    }
}
