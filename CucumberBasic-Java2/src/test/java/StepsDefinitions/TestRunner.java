package StepsDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = { "StepsDefinitions" }, monochrome = true, plugin = {
		"pretty", "html:target/HTMLReports/index.html", "json:target/JSONReports/report.json",
		"junit:target/XMLReports/report.xml" }, tags = "@E2E")
public class TestRunner {

//	in this example i will executed 2 scenarios with same tags

}
