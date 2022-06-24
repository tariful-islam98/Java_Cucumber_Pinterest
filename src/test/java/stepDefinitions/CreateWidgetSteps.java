package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CreateWidgetPage;
import utils.TestContextSetup;

public class CreateWidgetSteps{
    TestContextSetup testContextSetup;
    CreateWidgetPage createWidgetPage;

    public CreateWidgetSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.createWidgetPage = testContextSetup.pageObjectManager.getCreateWidgetPage();
    }

    @Given("User clicks Create Widget Option")
    public void userClicksCreateWidgetOption() {
        createWidgetPage.clickCreateOption();
    }

    @Then("Developers page opened in new tab")
    public void developersPageOpenedInNewTab() {
        Assert.assertTrue(createWidgetPage.isTabOpened());
    }
}
