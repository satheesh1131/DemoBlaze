package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\java\\com\\feature\\demoBlaze.feature"},
				 glue = {"com\\stepdefinition","com\\hooks"},
				 stepNotifications = true,
				 dryRun = !true,
				 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				 snippets = SnippetType.CAMELCASE)
public class Runner {

}
