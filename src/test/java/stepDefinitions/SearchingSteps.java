package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SearchPage;
import utils.TestContextSetup;

public class SearchingSteps {
    TestContextSetup testContextSetup;
    SearchPage searchPage;

    public SearchingSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.searchPage = testContextSetup.pageObjectManager.getSearchPage();
    }

    @Given("User clicks search box")
    public void userClicksSearchBox() {
        searchPage.clickSearchBox();
    }
    
    @And("types a {string}")
    public void typesA(String topic) {
        searchPage.enterText(topic);
    }

    @And("clicks Enter")
    public void clicksEnter() {
        searchPage.clickEnter();
    }

    @Then("System shows the result page")
    public void systemShowsTheResultPage() {
        Assert.assertEquals(searchPage.getCurrentUrl(), "https://www.pinterest.com/search/pins/?q=cricket&rs=typed&term_meta[]=cricket%7Ctyped");
    }

}
