package awesome.stepDef;

import awesome.factory.DriverFactory;
import awesome.pages.RegisterPage;
import awesome.pojo.UserDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegisterStepDef {
    WebDriver driver = DriverFactory.getDriver();
    RegisterPage register = new RegisterPage(driver);
    private UserDetails userDetails;

    @Given("I am on signup page")
    public void iAmOnSignupPage() {
        driver.get("https://automationexercise.com/");
        register.clickSignupLink();
    }

    @When("I register as new user with {string} and {string}")
    public void iRegisterAsNewUserWithAnd(String signupName, String signupEmail) {
        register.newSignupPage(signupName,signupEmail);
    }

    @And("I should fill all mandatory registration details")
    public void iShouldFillAllMandatoryRegistrationDetails(UserDetails userDetails) {
        register.enterRegistrationDetails(userDetails);
    }
}
