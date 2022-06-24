package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AboutLinkPage {
    WebDriver driver;

    private By optionsList = By.xpath("//div[@role=\"listitem\"][@class=\"zI7 iyn Hsu\"]");
    private List<WebElement> options;

    public AboutLinkPage(WebDriver driver) {
        this.driver = driver;
    }


    public void getOptions(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(optionsList));
        options = driver.findElements(optionsList);

        options.get(0).click();
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
        wait.until(ExpectedConditions.titleContains("All about Pinterest "));
        return driver.getTitle().contains("All about Pinterest ");
    }
}
