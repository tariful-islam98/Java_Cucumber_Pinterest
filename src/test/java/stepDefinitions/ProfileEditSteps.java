package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ProfileEditPage;
import utils.TestContextSetup;

public class ProfileEditSteps{
    TestContextSetup testContextSetup;
    ProfileEditPage profileEditPage;

    public ProfileEditSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.profileEditPage = testContextSetup.pageObjectManager.getProfileEditPage();
    }

    @Given("User clicks profile icon")
    public void userClicksProfileIcon(){
        profileEditPage.clickProfileIcon();
    }

    @And("clicks edit profile button")
    public void clicksEditProfileButton() {
        profileEditPage.clickEditProfile();
    }

    @When("user clicks last name field")
    public void userClicksLastNameField() {
        profileEditPage.clickLastNameField();
    }


    @And("user sets {string}")
    public void userSets(String lastname) {
        profileEditPage.enterLastName(lastname);
    }

    @And("clicks profile save button")
    public void clicksProfileSaveButton() {
        profileEditPage.clickSaveButton();
    }

    @Then("user profile gets updated")
    public void userProfileGetsUpdated() {
        Assert.assertTrue(profileEditPage.isEdited());
    }
}
