package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PostSavePage;
import utils.TestContextSetup;

public class PostSaveSteps {
    TestContextSetup testContextSetup;
    PostSavePage postSavePage;

    public PostSaveSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.postSavePage = testContextSetup.pageObjectManager.getPostSavePage();
    }

    @Given("User clicks post save button")
    public void userClicksPostSaveButton() {
        postSavePage.clickSaveBtn();
    }

    @Then("button named saved is visible")
    public void buttonNamedSavedIsVisible() {
        Assert.assertTrue(postSavePage.isVisible());
    }
}
