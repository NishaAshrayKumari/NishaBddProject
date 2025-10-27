package awesome.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    } //Construction has PageFactory.initElements which initializes all the WebElements

    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a")
    private  List<WebElement> homePageNavLink;

    public List<WebElement> homePageNavLink() {
        return (homePageNavLink);
    }
}
