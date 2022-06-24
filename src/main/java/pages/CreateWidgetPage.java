package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateWidgetPage {
    WebDriver driver;

    private By createWidgetLnk = By.xpath("//div[@id= \"QuestionMarkFlyout-item-1\"]");

    public CreateWidgetPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreateOption() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(createWidgetLnk));
        driver.findElement(createWidgetLnk).click();
    }

    public boolean isTabOpened(){
        String originalWindow = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

//        assert driver.getWindowHandles().size() == 1;
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(ExpectedConditions.titleContains("Pinterest Developers"));
        return driver.getTitle().contains("Pinterest Developers");
    }
}
