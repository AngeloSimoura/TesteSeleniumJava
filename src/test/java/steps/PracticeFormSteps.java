package steps;

import org.openqa.selenium.WebDriver;

import comum.GlobalDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.PracticeFormPage;

public class PracticeFormSteps {
	public static WebDriver driver;

	public PracticeFormPage practiceForm;

	public PracticeFormSteps() {
		driver = GlobalDriver.getDriver();
		practiceForm = new PracticeFormPage(driver);
	}
	@When("preenche os campos:")
	public void preenche_os_campos(io.cucumber.datatable.DataTable dataTable) {
		practiceForm.preencherCampos(dataTable);
	}

	@When("clica no botao Submit")
	public void clica_no_botao_Submit() {
		practiceForm.submit();
	}
	@Then("o sistema apresenta a mensagem de sucesso")
	public void o_sistema_apresenta_a_mensagem_de_sucesso() {
		Assert.assertEquals("Thanks for submitting the form",  practiceForm.title());
	}
}