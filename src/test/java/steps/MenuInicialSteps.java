package steps;

import org.openqa.selenium.WebDriver;

import comum.GlobalDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page.MenuInicialPage;

public class MenuInicialSteps {
	public static WebDriver driver;

	public MenuInicialPage menuInicial;

	public MenuInicialSteps() {
		driver = GlobalDriver.getDriver();
		menuInicial = new MenuInicialPage(driver);
	}

	@Given("que o usuario acessa a aplicacao")
	public void que_o_usuario_acessa_a_aplicacao() {
		driver.get("https://demoqa.com/");
	}
	@When("clica em Forms")
	public void clica_em_Forms() {
	    menuInicial.clicarLinkForm();
	}
}