package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.FollowPage;
import utils.TestContextSetup;

public class PostFollowSteps {
    TestContextSetup testContextSetup;
    FollowPage followPage;

    public PostFollowSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.followPage = testContextSetup.pageObjectManager.getFollowPage();
    }

    @Given("User clicks follow button")
    public void userClicksFollowButton() {
        followPage.clickFollowBtn();
    }

    @Then("button text and color changed")
    public void buttonTextAndColorChanged() {
        Assert.assertTrue(followPage.isVisible());
    }
}
