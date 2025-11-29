package runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"C:\\Users\\Admin\\eclipse-workspace\\Penta\\allfeatures"},
    glue = {"stepDefinitionFiles"},
   dryRun = false,
    monochrome = true,
    plugin = {
        "pretty",
        "html:reports/cucumber-html-report.html",
        "json:reports/cucumber.json",
        "junit:reports/cucumber.xml"
    }
  )
public class Runfile extends AbstractTestNGCucumberTests{

}
