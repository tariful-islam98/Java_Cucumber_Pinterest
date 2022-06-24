package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class PostSharePage {
    WebDriver driver;

    private By shareIcon = By.xpath("//button[@aria-label=\"Send\"]");
    private By shareOptions = By.xpath("//div[@class=\"YDx MIw\"]");

    public PostSharePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickShareIcon(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(shareIcon).click();
    }

    public boolean isDisplayed(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(shareOptions).isDisplayed();
    }
}
