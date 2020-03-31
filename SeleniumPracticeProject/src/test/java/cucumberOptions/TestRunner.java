package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features", glue="stepDefinitions",dryRun=false, monochrome=true,plugin= {"pretty", "json:output/cucumber.json","junit:output/cucumber.xml","html:output"},
tags= {"@MyntraLogin"})
public class TestRunner {

}
