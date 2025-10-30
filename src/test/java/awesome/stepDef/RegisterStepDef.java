package awesome.stepDef;

import awesome.pages.RegisterPage;
import awesome.pojo.UserDetails;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterStepDef extends BaseStepDef {
    private final RegisterPage register = new RegisterPage(driver);

    @Given("I am on signup page")
    public void iAmOnSignupPage() {
        register.clickSignupLink();
    }

    @When("I register as new user with {string} and {string}")
    public void iRegisterAsNewUserWithAnd(String signupName, String signupEmail) {
        register.newSignupPage(signupName, signupEmail);
    }

    @And("I should fill all mandatory registration details")
    public void iShouldFillAllMandatoryRegistrationDetails(UserDetails userDetails) {
        register.enterRegistrationDetails(userDetails);
    }
}
