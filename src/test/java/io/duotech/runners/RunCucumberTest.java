package io.duotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/io/duotech/features/enrollment_page.feature",
		glue = "io/duotech/step_definitions",
		strict = true,
		dryRun = true
				)
public class RunCucumberTest {

}
