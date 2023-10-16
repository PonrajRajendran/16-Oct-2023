package org.runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\eclipse-workspace\\CucumberProject\\Featurefiles",
glue="org.stepdifinitions",dryRun=false)
public class AdactinRun {

}
 