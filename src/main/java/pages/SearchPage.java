package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage{
    WebDriver driver;
    //Search
    private By searchBoxLink = By.xpath("//input[@data-test-id=\"search-box-input\"]");
    private By homeLink = By.xpath("//a/div/div/span[contains(text(), \"Home\")]");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadHomePage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(homeLink).click();
    }

    public void clickSearchBox(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLink));
        driver.findElement(searchBoxLink).click();
    }

    public void enterText(String topic){
        driver.findElement(searchBoxLink).sendKeys(topic);
    }

    public void clickEnter(){
        driver.findElement(searchBoxLink).sendKeys(Keys.ENTER);
    }

    public String getCurrentUrl(){
        return driver.getCurrentUrl();
    }
}
