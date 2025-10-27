package awesome.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
        plugin = "message:target/cucumber-report.ndjson",
        glue = {"awesome.stepDef","awesome.hooks","awesome.customType","awesome.pojo"},
        features = "src/test/resources/awesome",
        tags = "@smokeTest"
)
public class TestNgRunnerTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }
}
