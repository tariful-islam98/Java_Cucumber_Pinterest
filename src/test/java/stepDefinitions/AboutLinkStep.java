package stepDefinitions;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.AboutLinkPage;
import utils.TestContextSetup;

public class AboutLinkStep {
    TestContextSetup testContextSetup;
    AboutLinkPage aboutLinkPage;

    public AboutLinkStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.aboutLinkPage = testContextSetup.pageObjectManager.getAboutLinkPage();
    }

    @Given("User clicks About Link")
    public void userClicksAboutLink(){
        aboutLinkPage.getOptions();
    }

    @Then("About page is opened in new tab")
    public void aboutPageIsOpenedInNewTab() {
        Assert.assertTrue(aboutLinkPage.isTabOpened());
    }
}
