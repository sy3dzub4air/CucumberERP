package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"},monochrome = true, glue = {"stepDefinations"})
public class Runner {

}
