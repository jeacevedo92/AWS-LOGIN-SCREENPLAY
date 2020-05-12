package co.com.cafeto.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/aws.feature",
		tags= "@Login",
		glue="co.com.cafeto.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class AwsLogin {

}
