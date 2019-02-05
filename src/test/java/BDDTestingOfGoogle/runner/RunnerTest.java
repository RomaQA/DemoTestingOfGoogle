package BDDTestingOfGoogle.runner;


import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-html-reports/runnertest", "json:target/cucumber.json"},
        features = "src/test/java/BDDTestingOfGoogle/features/smoke_test.features",
        glue = "BDDTestingOfGoogle.steps",
        dryRun = false,
        strict = false
)

public class RunnerTest {
    @BeforeClass
    static public void testSetup()
    {
        Configuration.timeout = 10000;

    }
}
