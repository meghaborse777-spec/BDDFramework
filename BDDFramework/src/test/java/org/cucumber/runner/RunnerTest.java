package org.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources",
                   glue = "stepdefination",
                   plugin = {"pretty", "html:target/cucumber-report.html", "html:target/Cucumber.json"},
                   monochrome = true)

public class RunnerTest extends AbstractTestNGCucumberTests {
	
}
