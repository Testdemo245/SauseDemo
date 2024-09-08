package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features= "C:\\Users\\Sumit\\eclipse-workspace\\CucumberJava\\src\\test\\java\\Feature\\login.feature",
glue = {"StepDefinition"},
monochrome = true,
plugin={"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports"},
       
dryRun = false)


public class TestRunner {

}
