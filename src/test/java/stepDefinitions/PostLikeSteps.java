package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PostLikePage;
import utils.TestContextSetup;

public class PostLikeSteps {
    TestContextSetup testContextSetup;
    PostLikePage postLikePage;

    public PostLikeSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.postLikePage = testContextSetup.pageObjectManager.getPostLikePage();
    }

    @Given("User click like icon")
    public void userClickLikeIcon() {
        postLikePage.clickLickIcon();
    }

    @Then("Like count is increased")
    public void likeCountIsIncreased() {
        String reaction = postLikePage.getReactionCount();
        Assert.assertTrue(reaction.contains("You and "));
    }
}
