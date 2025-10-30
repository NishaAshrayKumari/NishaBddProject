package awesome.stepDef;

import awesome.data.Constants;
import awesome.pages.HomePage;
import awesome.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DummyStepDef extends BaseStepDef {
    private final HomePage home = new HomePage(driver);

    @Given("I am on Ecommerce/Shopping application")
    public void iAmOnEcommerceApplication() {
        driver.get(ConfigReader.get(Constants.BASE_URL));
        List<WebElement> homepageLink = home.homePageNavLink();
        for (WebElement ele : homepageLink) {
            System.out.println(ele.getText());
        }
    }

    @When("I click on {string}")
    public void iClickOn(String arg0) {
        System.out.println("I click on " + arg0);
    }

    @Then("{string} opens")
    public void opens(String arg0) {
        System.out.println(arg0 + " opens");
    }

    @Then("{string} will get open")
    public void willGetOpen(String arg0) {
        System.out.println(arg0 + " opens ");
    }
}
