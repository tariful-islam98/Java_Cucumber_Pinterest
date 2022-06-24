package utils;

import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;

import java.io.IOException;

public class TestContextSetup {
    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;


    public TestContextSetup() throws IOException
    {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.WebDriverManager());

    }
}
