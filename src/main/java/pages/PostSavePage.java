package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PostSavePage {
    WebDriver driver;

    private By postSaveBtn = By.xpath("//div[@data-test-id=\"quick-save-button\"]/button");
    private By savedBtn = By.xpath("//div[@data-test-id=\"quick-save-button\"]/button[@aria-label=\"Saved\"]");

    public PostSavePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSaveBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(postSaveBtn);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public boolean isVisible(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(savedBtn));
        return driver.findElement(savedBtn).isDisplayed();
    }
}
