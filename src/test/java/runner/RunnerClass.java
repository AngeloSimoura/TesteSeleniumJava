package runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.sorting.SortingMethod;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
		glue={"steps"}, monochrome=true, dryRun = false
		,plugin = {"pretty","html:test-output","json:target/cucumber-report/cucumber.json"}		)

public class RunnerClass {
	@AfterClass
	public static void finTeste() {
		File file = new File("target/maven-cucumber-report");
		List jsonFiles=new ArrayList<>();
		jsonFiles.add("target/cucumber-report/cucumber.json");
		Configuration config = new Configuration(file, "Teste");
		config.setBuildNumber("01");
		config.addClassifications("Environment","QA");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Platform",System.getProperty("os.name").toUpperCase());
		config.setSortingMethod(SortingMethod.NATURAL);
		config.addPresentationModes(PresentationMode.EXPAND_ALL_STEPS);
		config.setTrendsStatsFile(new File("target/test-classes/demo-trends.json"));
		ReportBuilder reporter= new ReportBuilder(jsonFiles, config);
		reporter.generateReports();
	}
}
