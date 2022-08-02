package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions"
        , monochrome = false,
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}