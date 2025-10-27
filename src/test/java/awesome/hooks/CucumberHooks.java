package awesome.hooks;

import awesome.factory.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {
    @BeforeAll
    public static void beforeAll(){
        DriverFactory.initDriver();
    }

    @AfterAll
    public static  void afterAll(){
        DriverFactory.quitDriver();
    }
}
