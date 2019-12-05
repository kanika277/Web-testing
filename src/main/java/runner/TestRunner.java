package runner;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions( features = "src/main/resources/" ,
        glue = {"StepDefinitions"},
        tags = {"@Parent"}
)
public class TestRunner {
}
