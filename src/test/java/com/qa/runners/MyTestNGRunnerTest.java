package  com.qa.runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        plugin = {
                "pretty"
                , "html:target/cucumber/Shareef/report.html"
                , "summary"
        }
        ,features = {"src/test/resources"}
        ,glue = {"com.qa.stepdef"}
        ,dryRun=false
        ,monochrome=true
        ,tags = "@test"
)
public class MyTestNGRunnerTest  extends RunnerBase{

}
