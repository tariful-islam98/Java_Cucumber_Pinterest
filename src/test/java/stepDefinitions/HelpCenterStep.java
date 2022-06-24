package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.HelpCenterPage;
import utils.TestContextSetup;

public class HelpCenterStep {
    TestContextSetup testContextSetup;
    HelpCenterPage helpCenterPage;

    public HelpCenterStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.helpCenterPage = testContextSetup.pageObjectManager.getHelpCenterPage();
    }

    @Given("User clicks Question mark icon")
    public void userClicksQuestionMarkIcon() {
        helpCenterPage.clickHelpIcon();
    }

    @Then("Help Center options are popped up")
    public void helpCenterOptionsArePoppedUp() {
        Assert.assertTrue(helpCenterPage.isPopupDisplayed());
    }

    @Given("User clicks visit help center option")
    public void userClicksVisitHelpCenterOption() {
        helpCenterPage.clickHelpCenterOption();
    }

    @Then("Help page opened in new tab")
    public void helpPageOpenedInNewTab() {
        Assert.assertTrue(helpCenterPage.isTabOpened());
    }
}
