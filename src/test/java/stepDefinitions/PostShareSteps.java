package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PostSharePage;
import utils.TestContextSetup;

public class PostShareSteps {
    TestContextSetup testContextSetup;
    PostSharePage postSharePage;

    public PostShareSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.postSharePage = testContextSetup.pageObjectManager.getPostSharePage();
    }

    @Given("User clicks share icon")
    public void userClicksShareIcon() {
        postSharePage.clickShareIcon();
    }

    @Then("Share page is popped up")
    public void sharePageIsPoppedUp() {
        Assert.assertTrue(postSharePage.isDisplayed());
    }
}
