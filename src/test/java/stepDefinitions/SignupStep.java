package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SignupPage;
import utils.TestContextSetup;

public class SignupStep {
    TestContextSetup testContextSetup;
    SignupPage signupPage;

    public SignupStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.signupPage = testContextSetup.pageObjectManager.getSignupPage();
    }

    @Given("user is in signup page")
    public void user_is_in_signup_page(){
        signupPage.clickSignup();
    }

    @When("user enters {string} , {string} and {string}")
    public void user_enters_And(String email, String password, String age) {
        signupPage.setUserEmail(email);
        signupPage.setPassword(password);
        signupPage.setAge(age);
    }

    @And("clicks continue button")
    public void clicks_continue_button() {
        signupPage.clickContinueBtn();
    }

    @And("clicks next button")
    public void clicks_next_button() {
        signupPage.clickNextBtn();
    }

    @And("selects a gender")
    public void selects_a_gender() {
        signupPage.selectGenderBtn();
    }

    @And("clicks next again")
    public void clicks_next_again() {
        signupPage.clickCountryPageNxtBtn();
    }

    @And("selects topics")
    public void selects_topics() {
        signupPage.selectTopic();
    }

    @And("clicks done button")
    public void clicks_done_button() {
        signupPage.clickTopicDoneBtn();
    }

    @And("clicks done button again")
    public void clicks_done_button_again() {
        signupPage.clickQrDoneBtn();
    }

    @And("clicks save button")
    public void clicks_save_button() {
        signupPage.clickSaveBtn();
    }

    @Then("home is visible")
    public void home_is_visible() {
        Assert.assertTrue(signupPage.isSignedup());
    }
}
