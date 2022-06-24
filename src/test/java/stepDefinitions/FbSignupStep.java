package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FbSignupPage;
import utils.TestContextSetup;

public class FbSignupStep {
    TestContextSetup testContextSetup;
    FbSignupPage fbSignupPage;

    public FbSignupStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.fbSignupPage = testContextSetup.pageObjectManager.getFbSignupPage();
    }

    @Given("user is in Signup page")
    public void user_is_in_Signup_page(){
        fbSignupPage.clickSignup();
    }

    @When("User clicks continue with facebook button")
    public void User_clicks_continue_with_facebook_button(){
        fbSignupPage.clickFbBtn2();
    }

    @Then("Facebook Login window appears")
    public void Facebook_Login_window_appears(){
        Assert.assertEquals(fbSignupPage.isFbSignupWindowOpened(), "Facebook");
    }
}
