package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PostOptionsPage;
import utils.TestContextSetup;

public class PostOptionsStep {
    TestContextSetup testContextSetup;
    PostOptionsPage postOptionsPage;

    public PostOptionsStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.postOptionsPage = testContextSetup.pageObjectManager.getPostOptionsPage();
    }

    @Given("User clicks a post")
    public void userClicksAPost() {
        postOptionsPage.clickPost();
    }

    @And("post page is loaded")
    public void postPageIsLoaded() {
        String expectedUrl = "https://www.pinterest.com/pin/"+postOptionsPage.getPinId()+"/";
        Assert.assertEquals(postOptionsPage.currentUrl(), expectedUrl);
    }

    @Given("user clicks menu icon")
    public void userClicksMenuIcon() {
        postOptionsPage.clickMenuIcon();
    }

    @Then("menu options are popped up")
    public void menuOptionsArePoppedUp() {
        Assert.assertTrue(postOptionsPage.isDisplayed());
    }
}
