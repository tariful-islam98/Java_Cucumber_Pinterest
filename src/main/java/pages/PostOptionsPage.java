package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PostOptionsPage {
    WebDriver driver;

    String pinId;
    private By postListPath = By.xpath("//div[@data-test-id=\"pin\"]");
    private By menuIcon = By.xpath("//button[@aria-label=\"More options\"]");
    private By menuDropdown = By.xpath("//div[@id=\"pin-action-dropdown\"]");

    public PostOptionsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickPost(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        List<WebElement> postList = driver.findElements(postListPath);
        pinId = postList.get(0).getAttribute("data-test-pin-id");
        wait.until(ExpectedConditions.elementToBeClickable(postList.get(0)));
        postList.get(0).click();
    }

    public String getPinId(){
        return pinId;
    }

    public void clickMenuIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.urlContains("https://www.pinterest.com/pin/"));
        driver.findElement(menuIcon).click();
    }

    public boolean isDisplayed(){
        return driver.findElement(menuDropdown).isDisplayed();
    }

    public String currentUrl(){
        return driver.getCurrentUrl();
    }
}
