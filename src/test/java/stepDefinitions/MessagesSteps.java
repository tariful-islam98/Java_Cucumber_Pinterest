package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MessagePage;
import utils.TestContextSetup;

public class MessagesSteps{
    TestContextSetup testContextSetup;
    MessagePage messagePage;

    public MessagesSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.messagePage = testContextSetup.pageObjectManager.getMessagePage();
    }

    @Given("User clicks message icon")
    public void userClicksMessageIcon(){
        messagePage.clickMsgIcon();
    }

    @And("user clicks new message button")
    public void userClicksNewMessageButton() {
        messagePage.clickNewMsgBtn();
    }

    @When("user enters {string}")
    public void userEnters(String email) {
        messagePage.inputEmail(email);
    }

    @And("selects an email")
    public void selectsAnEmail() {
        messagePage.selectContact();
    }

    @And("types {string}")
    public void types(String msg) {
        messagePage.typeMessage(msg);
    }

    @And("clicks send")
    public void clicksSend() {
        messagePage.clickSendButton();
    }

    @Then("message is sent")
    public void messageIsSent() {
        Assert.assertTrue(messagePage.isSent());
    }
}
