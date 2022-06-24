package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.NotificationPage;
import utils.TestContextSetup;

public class NotificationSteps {
    TestContextSetup testContextSetup;
    NotificationPage notificationPage;

    public NotificationSteps(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.notificationPage = testContextSetup.pageObjectManager.getNotificationPage();
    }

    @Given("user clicks notification icon")
    public void userClicksNotificationIcon(){
        notificationPage.clickNotificationIcon();
    }

    @And("selects a notification")
    public void selectsANotification() {
        notificationPage.selectNotification();
    }

    @Then("notification detail page loaded")
    public void notificationDetailPageLoaded() {
        String expectedUrl = "https://www.pinterest.com/news_hub/"+notificationPage.getNotificationId();
        Assert.assertEquals(notificationPage.currentUrl(), expectedUrl);
    }
}
