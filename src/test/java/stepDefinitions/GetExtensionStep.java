package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GetExtensionPage;
import utils.TestContextSetup;

public class GetExtensionStep {
    TestContextSetup testContextSetup;
    GetExtensionPage extensionPage;


    public GetExtensionStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.extensionPage = testContextSetup.pageObjectManager.getExtensionPage();
    }

    @Given("User clicks get browser option")
    public void userClicksGetBrowserOption() {
        extensionPage.clickGetBrowserOption();
    }

    @Then("Extension tab is opened")
    public void extensionTabIsOpened() {
        Assert.assertTrue(extensionPage.isTabOpened());
    }
}
