package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuInicialPage extends BasePage {

	public MenuInicialPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[text()='Forms']")
	private WebElement linkForm;
	
	public void clicarLinkForm() {
		((JavascriptExecutor) driver).
		executeScript("arguments[0].scrollIntoView()", linkForm);
		linkForm.click();
	}
}
