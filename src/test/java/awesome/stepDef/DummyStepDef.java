package awesome.stepDef;

import awesome.factory.DriverFactory;
import awesome.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DummyStepDef {
    WebDriver driver = DriverFactory.getDriver();
    HomePage home = new HomePage(driver); //creating object of the class so that constructor gets called.
    // Construction has PageFactory.initElements which initializes all the WebElements

    @Given("I am on Ecommerce/Shopping application")
    public void iAmOnEcommerceApplication() {
//        home.load("https://automationexercise.com/");
        driver.get("https://automationexercise.com/");
        List<WebElement> homepageLink = home.homePageNavLink();
        for(WebElement ele : homepageLink){
            System.out.println(ele.getText());
        }
    }

    @When("I click on {string}")
    public void iClickOn(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I click on " + arg0);
    }

    @Then("{string} opens")
    public void opens(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg0 + " opens");
    }

    @Then("{string} will get open")
    public void willGetOpen(String arg0) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(arg0 + " opens ");
    }
}
