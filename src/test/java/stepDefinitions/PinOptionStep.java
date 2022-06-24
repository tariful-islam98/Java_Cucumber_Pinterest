package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PinOptionsPage;
import utils.TestContextSetup;

public class PinOptionStep {
    TestContextSetup testContextSetup;
    PinOptionsPage pinOptionsPage;

    public PinOptionStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.pinOptionsPage = testContextSetup.pageObjectManager.getPinOptionsPage();
    }

    @Given("User clicks Plus icon")
    public void userClicksPlusIcon() {
        pinOptionsPage.clickPinIcon();
    }

    @Then("Pin options are popped up")
    public void pinCreatingOptionsArePoppedUp() {
        Assert.assertTrue(pinOptionsPage.isPinOptionsDisplayed());
    }

    @Given("User clicks create pin option")
    public void userClicksCreatePinOption() {
        pinOptionsPage.clickCreatePin();
    }

    @Then("Create pin page is opened")
    public void createPinPageIsOpened() {
        String expectedUrl = "https://www.pinterest.com/pin-builder/";
        Assert.assertEquals(pinOptionsPage.currentUrl(), expectedUrl);
    }
}
