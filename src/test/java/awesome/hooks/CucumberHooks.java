package awesome.hooks;

import awesome.data.Constants;
import awesome.factory.DriverFactory;
import awesome.utils.ConfigReader;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class CucumberHooks {
    private static WebDriver driver;

    @AfterAll
    public static void afterAll() {
        DriverFactory.quitDriver();
    }

    @BeforeAll
    public static void beforeAll() {
        driver = DriverFactory.getDriver();
        String baseurl = ConfigReader.get(Constants.BASE_URL);
        driver.get(baseurl);
        System.out.println("Navigated to URL :" + baseurl);
    }
}
