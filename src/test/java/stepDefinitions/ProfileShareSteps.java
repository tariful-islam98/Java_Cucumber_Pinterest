package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ProfileSharePage;
import utils.TestContextSetup;

public class ProfileShareSteps{
    TestContextSetup testContextSetup;
    ProfileSharePage profileSharePage;

    public ProfileShareSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.profileSharePage = testContextSetup.pageObjectManager.getProfileSharePage();
    }

    @Given("user clicks profile icon")
    public void userClicksProfileIcon(){
        profileSharePage.clickProfileIcon();
    }

    @And("clicks share button")
    public void clicksShareButton() {
        profileSharePage.clickShareBtn();
    }

    @Then("Share modal is displayed")
    public void shareModalIsDisplayed() {
        Assert.assertTrue(profileSharePage.isPopupDisplayed());
    }

    @Given("user clicks email input field")
    public void userClicksEmailInputField() {
        profileSharePage.clickInputField();
    }

    @And("types the {string} address")
    public void typesTheAddress(String email) {
        profileSharePage.typeEmail(email);
    }

    @And("selects contact to share")
    public void selectsContactToShare() {
        profileSharePage.selectContact();
    }

    @And("writes {string} to share")
    public void writesToShare(String msg) {
        profileSharePage.writeMessage(msg);
    }

    @And("clicks send button")
    public void clicksSendButton() {
        profileSharePage.clickSendBtn();
    }

    @Then("user is returned to share modal")
    public void userIsReturnedToShareModal() {
        Assert.assertTrue(profileSharePage.isPopupDisplayed());
    }
}
