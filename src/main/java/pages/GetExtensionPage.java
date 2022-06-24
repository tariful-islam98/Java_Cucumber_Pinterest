package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GetExtensionPage {
    WebDriver driver;

    private By getBrowser = By.xpath("//div[@id= \"AddPinDropdown-item-0\"]");

    public GetExtensionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGetBrowserOption(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(getBrowser).click();
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
        wait.until(ExpectedConditions.titleContains("Pinterest Save Button - Chrome Web Store"));
        return driver.getTitle().contains("Pinterest Save Button - Chrome Web Store");
    }
}
