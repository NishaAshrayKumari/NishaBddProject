package awesome.factory;


import awesome.data.BrowserType;
import awesome.data.Constants;
import awesome.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browserName = System.getProperty("browser", ConfigReader.get(Constants.BROWSER, "chrome")).toUpperCase();
            BrowserType browser = BrowserType.valueOf(browserName);
            System.out.println("Launching browser: " + browser);

            switch (browser) {
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions ffOptions = new FirefoxOptions();
                    driver = new FirefoxDriver(ffOptions);
                    System.out.println(BrowserType.FIREFOX);
                    break;
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    driver = new EdgeDriver(edgeOptions);
                    break;
                case SAFARI:
                    SafariOptions safariOptions = new SafariOptions();
                    driver = new SafariDriver(safariOptions);
                    break;
                case CHROME:
                default:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    driver = new ChromeDriver(chromeOptions);
                    break;
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
