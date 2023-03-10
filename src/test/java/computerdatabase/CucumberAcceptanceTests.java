package computerdatabase;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("computerdatabase")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "me.jvt.cucumber.report.PrettyReports:target/cucumber" )
public class CucumberAcceptanceTests {
	//Lance tous les scénarios des features j'ai pas eu le temps de lire la suite mais c'est franchement pas grave
}