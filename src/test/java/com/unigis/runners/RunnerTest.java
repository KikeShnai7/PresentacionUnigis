package com.unigis.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
				strict = false,
				plugin = {"pretty", "json:target/cucumber_json_reports/UnigisWebSite.json", "html:target/UnigisWebSite-html"},
				glue = {"com.unigis.hooks",
						"com.unigis.helps",
						"com.unigis.pages",
					   	"com.unigis.steps"})

public class RunnerTest {}