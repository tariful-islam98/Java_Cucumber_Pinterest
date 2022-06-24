package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PinOptionsPage {
    WebDriver driver;

    private By pinIconLnk = By.xpath("//button[@aria-label= \"Add Pin\"]");
    private By pinFlyout = By.xpath("//div[@id= \"AddPinDropdown\"]");
    private By createPin = By.xpath("//div[@data-test-id= \"createAPin\"]");

    public PinOptionsPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * TC_4.8
     * Add/create pins
     */
    public void clickPinIcon(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        WebElement element = driver.findElement(pinIconLnk);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public boolean isPinOptionsDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinFlyout));
        return driver.findElement(pinFlyout).isDisplayed();
    }

    public void clickCreatePin(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(createPin));

        driver.findElement(createPin).click();
    }

    public String currentUrl(){
        return driver.getCurrentUrl();
    }
}
