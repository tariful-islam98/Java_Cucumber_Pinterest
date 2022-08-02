package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class TestBase {

    public WebDriver driver;

    public WebDriver WebDriverManager() throws IOException
    {
        /*FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("QAUrl");
        String browser_properties = prop.getProperty("browser");
        String browser_maven=System.getProperty("browser");
        // result = testCondition ? value1 : value2

        String browser = browser_maven!=null ? browser_maven : browser_properties;*/

        ResourceHelper global = new ResourceHelper().getResource("global");
        String url = global.getString("QAUrl");
        String browser = global.getString("browser");

        if(driver == null)
        {
            if(browser.equalsIgnoreCase("chrome"))
            {
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
                driver = new ChromeDriver();
            }
            if(browser.equalsIgnoreCase("firefox"))
            {
                System.setProperty("webdriver.gecko.driver","C:/Users/tarif/Downloads/Compressed/geckodriver.exe");
                driver = new FirefoxDriver();
            }
            assert driver != null;
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get(url);
        }

        return driver;

    }


}

