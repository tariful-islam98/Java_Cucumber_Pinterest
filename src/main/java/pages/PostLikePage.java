package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class PostLikePage {
    WebDriver driver;

    private By likeIcon = By.xpath("//div[@aria-label=\"reaction\"]");
    private By reactionCount = By.xpath("//div[@class=\"tBJ dyH iFc sAJ O2T zDA IZT swG\"]");

    public PostLikePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLickIcon(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(likeIcon).click();
    }

    public String getReactionCount(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver.findElement(reactionCount).getText();
    }
}
