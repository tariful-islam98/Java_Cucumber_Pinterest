package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelpCenterPage {
    public WebDriver driver;

    //help center
    private By helpIconLnk = By.xpath("//button[@aria-label= \"More\"]");
    private By helpCenterLayout = By.xpath("//div[@id= \"QuestionMarkFlyout\"]");
    private By visitHlpLnk = By.xpath("//div[@id= \"QuestionMarkFlyout-item-0\"]");

    public HelpCenterPage(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * TC_4.7
     * Help Center
     */
    public void clickHelpIcon(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = driver.findElement(helpIconLnk);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public boolean isPopupDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(helpCenterLayout));
        return driver.findElement(helpCenterLayout).isDisplayed();
    }

    public void clickHelpCenterOption(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(visitHlpLnk));
        driver.findElement(visitHlpLnk).click();
    }

    public boolean isTabOpened(){
        String originalWindow = driver.getWindowHandle();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String windowHandle : driver.getWindowHandles()){
            if(!originalWindow.contentEquals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        wait.until(ExpectedConditions.titleContains("Pinterest Help"));
        return driver.getTitle().contains("Pinterest Help");
    }
}
