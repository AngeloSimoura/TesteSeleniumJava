package steps;

import org.openqa.selenium.WebDriver;

import comum.GlobalDriver;
import io.cucumber.java.en.When;
import page.MenuFormPage;

public class MenuFormSteps {
	public static WebDriver driver;

	public MenuFormPage menuForm;

	public MenuFormSteps() {
		driver = GlobalDriver.getDriver();
		menuForm = new MenuFormPage(driver);
	}
	@When("clica Practice Form")
	public void clica_Practice_Form() {
	    menuForm.clicarPracticeForm();
	}


}
