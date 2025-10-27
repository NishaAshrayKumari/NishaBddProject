package awesome.pages;

import awesome.pojo.UserDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a[href='/login']")
    private WebElement signupLink;
    @FindBy(css = "[data-qa='signup-name']")
    private WebElement signupName;
    @FindBy(css = "[data-qa='signup-email']")
    private WebElement signupEmail;
    @FindBy(css= "[data-qa='signup-button']")
    private WebElement signupButton;
    @FindBy(css= "[id='id_gender1']")
    private WebElement titleMrRadioBtn;
    @FindBy(css= "[data-qa='password']")
    private WebElement userPassword;
    @FindBy(css= "[data-qa='first_name']")
    private WebElement firstName;
    @FindBy(css= "[data-qa='last_name']")
    private WebElement lastName;
    @FindBy(css= "[data-qa='company']")
    private WebElement company;
    @FindBy(css= "[data-qa='address']")
    private WebElement address;
    @FindBy(css= "[data-qa='state']")
    private WebElement state;
    @FindBy(css= "[data-qa='city']")
    private WebElement city;
    @FindBy(css= "[data-qa='zipcode']")
    private WebElement zipCode;
    @FindBy(css= "[data-qa='mobile_number']")
    private WebElement mobileNumber;


    public void clickSignupLink() {
        wait.until(ExpectedConditions.elementToBeClickable(signupLink)).click();
    }

    public void newSignupPage(String s_name, String s_email){
        wait.until(ExpectedConditions.visibilityOf(signupName)).sendKeys(s_name);
        wait.until(ExpectedConditions.visibilityOf(signupEmail)).sendKeys(s_email);
        wait.until(ExpectedConditions.visibilityOf(signupButton)).click();
    }

    public void enterRegistrationDetails(UserDetails userDetails){
        wait.until(ExpectedConditions.visibilityOf(titleMrRadioBtn)).click();
        wait.until(ExpectedConditions.visibilityOf(userPassword)).sendKeys(userDetails.getPassword());
        wait.until(ExpectedConditions.visibilityOf(firstName)).sendKeys(userDetails.getFirstName());
        wait.until(ExpectedConditions.visibilityOf(lastName)).sendKeys(userDetails.getLastName());
        wait.until(ExpectedConditions.visibilityOf(company)).sendKeys(userDetails.getCompany());
        wait.until(ExpectedConditions.visibilityOf(address)).sendKeys(userDetails.getAddress());
        wait.until(ExpectedConditions.visibilityOf(state)).sendKeys(userDetails.getState());
        wait.until(ExpectedConditions.visibilityOf(city)).sendKeys(userDetails.getCity());
        wait.until(ExpectedConditions.visibilityOf(zipCode)).sendKeys(userDetails.getZipCode());
        wait.until(ExpectedConditions.visibilityOf(mobileNumber)).sendKeys(userDetails.getMobileNumber());
    }
}
