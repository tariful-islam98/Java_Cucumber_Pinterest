package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import utils.TestContextSetup;

public class LoginStep {
    TestContextSetup testContextSetup;
    LoginPage loginPage;

    public LoginStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
    }

    @Given("user is in login page")
    public void user_is_in_login_page(){
        loginPage.clickLoginBtn();
    }

    @When("user Enters {string} and {string}")
    public void user_Enters_And(String email, String password) {
        loginPage.setUserEmail(email);
        loginPage.setPassword(password);
    }

    @And("click Login Button")
    public void click_Login_Button(){
        loginPage.clickLogin();
    }

    @Then("Home Page is visible")
    public void Home_Page_is_visible(){
        Assert.assertTrue(loginPage.isLoggedIn());
    }
}
