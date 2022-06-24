package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FbLoginPage;
import utils.TestContextSetup;

public class FbLoginStep {
    TestContextSetup testContextSetup;
    FbLoginPage facebookLoginPage;

    public FbLoginStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.facebookLoginPage = testContextSetup.pageObjectManager.getFbLoginPage();
    }

    @Given("user is in Login page")
    public void user_is_in_Login_page(){
        facebookLoginPage.clickLoginButton();
    }

    @When("user clicks continue with facebook button")
    public void user_clicks_continue_with_facebook_button() {
        facebookLoginPage.clickFbLoginBtn();
    }

    @Then("Facebook login window appears")
    public void facebook_login_window_appears() {
        Assert.assertEquals(facebookLoginPage.isWindowOpened(), "Facebook");
    }
}
