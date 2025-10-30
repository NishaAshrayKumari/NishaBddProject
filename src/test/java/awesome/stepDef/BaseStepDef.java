package awesome.stepDef;

import awesome.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class BaseStepDef {
    protected WebDriver driver;

    public BaseStepDef() {
        this.driver = DriverFactory.getDriver();
    }
}

//This class provides shared functionality, not actual test logic. hence it is abstract class