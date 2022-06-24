package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FollowPage {
    WebDriver driver;

    private By followBtn = By.xpath("//div[@data-test-id=\"user-follow-button\"]/button[@aria-label=\"Follow\"]");
    private By unFollowBtn = By.xpath("//div[@data-test-id=\"user-unfollow-button\"]/button[@aria-label=\"Following\"]");

    public FollowPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFollowBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement element = driver.findElement(followBtn);

        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public boolean isVisible(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(unFollowBtn));
        return driver.findElement(unFollowBtn).isDisplayed();
    }
}
