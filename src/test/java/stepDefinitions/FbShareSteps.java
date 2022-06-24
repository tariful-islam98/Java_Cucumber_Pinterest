package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ShareWithFbPage;
import utils.TestContextSetup;

public class FbShareSteps{
    TestContextSetup testContextSetup;
    ShareWithFbPage shareWithFbPage;

    public FbShareSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.shareWithFbPage = testContextSetup.pageObjectManager.getShareWithFbPage();
    }

    @Given("user clicks Fb button")
    public void userClicksFbButton(){
        shareWithFbPage.shareByFb();
    }

    @Then("Fb window is opened")
    public void fbWindowIsOpened() {
        Assert.assertTrue(shareWithFbPage.isTabOpened());
    }
}
