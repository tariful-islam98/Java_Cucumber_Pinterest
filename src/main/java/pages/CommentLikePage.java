package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CommentLikePage {
    WebDriver driver;

    private By likeBtn = By.xpath("//div[@data-test-id=\"reactions-likeWithCountButton\"]/button");
    private By likeCount = By.xpath("//div[@data-test-id=\"reactions-likeWithCountButton\"]/div");
    private By commentList = By.xpath("//div[@data-test-id=\"aggregated-comment-list\"]");

    int count = 0;

    public CommentLikePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLikeBtn(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(commentList));
        if (driver.findElement(commentList).isDisplayed()) {
            wait.until(ExpectedConditions.visibilityOfElementLocated(likeBtn));

            List<WebElement> iconList = driver.findElements(likeBtn);
            List<WebElement> countList = driver.findElements(likeCount);
            if (countList.isEmpty()){
                count = 0;
            }else {
                count = Integer.parseInt(countList.get(0).getText());
            }
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", iconList.get(0));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }else System.out.println("No comment available");
    }

    public boolean isCountIncreased(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        int count1 = Integer.parseInt(driver.findElement(likeCount).getText());

        return count1>count;
    }
}
