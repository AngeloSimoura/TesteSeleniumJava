package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import comum.GlobalDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.MyScreenRecorder;

public class Hooks {
	
	public static Scenario scenario;
	
	@Before
	public void iniciar(Scenario scenario) {
		GlobalDriver.iniciarDriver();
		Hooks.scenario=scenario;
		try {
			MyScreenRecorder.startRecording(Hooks.scenario.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@After
	public void fechar() {
		GlobalDriver.fecharDriver();
		try {
			MyScreenRecorder.stopRecording();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterStep
	public void  depoisStep() {
		WebDriver driver= GlobalDriver.getDriver();
		scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
	}
}
