package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",glue= {"stepDefinitions"},
monochrome = true, plugin = {"pretty", "html:target/cucumber-reports"})

public class TestRunner {

}
