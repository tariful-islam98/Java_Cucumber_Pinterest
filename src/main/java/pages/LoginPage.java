package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;

    By homePageLoginBtn = By.xpath("//div[@data-test-id=\"simple-login-button\"]/button");//get login button
    By userEmailField = By.id("email");
    By userPasswordField = By.id("password");
    By loginBtn = By.xpath("//div[@data-test-id=\"registerFormSubmitButton\"]/button");
    By profileId = By.xpath("//div[@data-test-id=\"header-profile\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginBtn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.findElement(homePageLoginBtn).click();
    }

    public void setUserEmail(String userEmail) {
        driver.findElement(userEmailField).sendKeys(userEmail);
    }

    public void setPassword(String password) {
        driver.findElement(userPasswordField).sendKeys(password);
    }

    /**
     * TC_2.1
     * login with email and password
     * load Home Page
     */
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public boolean isLoggedIn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver.findElement(profileId).isDisplayed();
    }
}
