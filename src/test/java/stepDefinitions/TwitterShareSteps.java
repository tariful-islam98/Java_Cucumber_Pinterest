package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ShareWithTwitterPage;
import utils.TestContextSetup;

public class TwitterShareSteps{
    TestContextSetup testContextSetup;
    ShareWithTwitterPage shareByTwitter;

    public TwitterShareSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.shareByTwitter = testContextSetup.pageObjectManager.getTwitterPage();
    }

    @Given("user clicks Twitter button")
    public void userClicksTwitterButton() {
        shareByTwitter.sharByTwitter();
    }

    @Then("Twitter window is opened")
    public void twitterWindowIsOpened() {
        Assert.assertTrue(shareByTwitter.isTabOpened());
    }
}
