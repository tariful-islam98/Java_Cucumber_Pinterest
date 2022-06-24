package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CommentLikePage;
import utils.TestContextSetup;

public class CommentLikeSteps {
    TestContextSetup testContextSetup;
    CommentLikePage commentLikePage;

    public CommentLikeSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.commentLikePage = testContextSetup.pageObjectManager.getCommentLikePage();
    }

    @Given("user clicks like icon under a comment")
    public void userClickLikeIconUnderAComment() {
        commentLikePage.clickLikeBtn();
    }

    @Then("comment like count is increased")
    public void commentLikeCountIsIncreased() {
        Assert.assertTrue(commentLikePage.isCountIncreased());
    }
}
