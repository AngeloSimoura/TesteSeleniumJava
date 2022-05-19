package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MenuFormPage extends BasePage {

	public MenuFormPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[text()='Practice Form']")
	private WebElement linkPracticeForm;
	
	public void clicarPracticeForm() {
		Actions act = new Actions(driver);
		act.moveToElement(linkPracticeForm);
		linkPracticeForm.click();
	}

}
