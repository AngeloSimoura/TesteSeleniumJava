package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;

public class PracticeFormPage extends BasePage {

	public PracticeFormPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "firstName")
	private WebElement txtFirstName;
	@FindBy(id = "lastName")
	private WebElement txtLastName;
	@FindBy(id = "userEmail")
	private WebElement txtEmail;
	@FindBy(xpath = "//*/label[text()='Female']")
	private WebElement radioBTGenderFemale;
	@FindBy(xpath = "//*/label[text()='Male']")
	private WebElement radioBTGenderMale;
	@FindBy(xpath = "//*/label[text()='Other']")
	private WebElement radioBTGenderOther;
	@FindBy(id = "userNumber")
	private WebElement txtNumber;
	@FindBy(id = "subjectsInput")
	private WebElement txtSubjects;
	@FindBy(xpath = "//*/label[text()='Sports']")
	private WebElement checkBoxHobbiesSports;
	@FindBy(xpath = "//*/label[text()='Reading']")
	private WebElement checkBoxHobbiesReading;
	@FindBy(xpath = "//*/label[text()='Music']")
	private WebElement checkBoxHobbiesMusic;
	@FindBy(id = "currentAddress")
	private WebElement txtCurrentAddress;
	@FindBy(xpath = "//*[text()='Select State']")
	private WebElement selectState;
	@FindBy(xpath = "//*[text()='Select City']")
	private WebElement selectCity;
	@FindBy(id = "submit")
	private WebElement buttonSubmit;
	@FindBy(id = "example-modal-sizes-title-lg")
	private WebElement titleSuccess;


	private void firstName(String valor) {
		txtFirstName.sendKeys(valor);
	}

	private void lastName(String valor) {
		txtLastName.sendKeys(valor);
	}

	private void email(String valor) {
		txtEmail.sendKeys(valor);
	}

	private void gender(String valor) {
		switch (valor) {
		case "Male":
			radioBTGenderMale.click();
			break;
		case "Female":
			radioBTGenderFemale.click();
			break;
		case "Other":
			radioBTGenderOther.click();
			break;
		default:
			break;
		}
	}

	private void number(String valor) {
		txtNumber.sendKeys(valor);
	}

	private void subjects(String valor) {
		txtSubjects.sendKeys(valor);
	}

	private void hobbies(String valor) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", checkBoxHobbiesSports);
		switch (valor) {
		case "Sports":
			checkBoxHobbiesSports.click();
			break;
		case "Reading":
			checkBoxHobbiesReading.click();
			break;
		case "Music":
			checkBoxHobbiesMusic.click();
			break;
		default:
			break;
		}
	}

	private void currentAddress(String valor) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", txtCurrentAddress);
		txtCurrentAddress.sendKeys(valor);
	}

	private void selectState(String valor) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", selectState);
		selectState.click();
		driver.findElement(By.xpath("//*[text()='" + valor + "']")).click();
	}

	private void selectCity(String valor) {
		selectCity.click();
		driver.findElement(By.xpath("//*[text()='" +valor + "']")).click();
	}

	public void preencherCampos(DataTable table) {
		for (int i = 0; i < table.height(); i++) {
			switch (table.cell(i, 0)) {
			case "firstName":
				firstName(table.cell(i, 1));
				break;
			case "lastName":
				lastName(table.cell(i, 1));
				break;
			case "email":
				email(table.cell(i, 1));
				break;
			case "gender":
				gender(table.cell(i, 1));
				break;
			case "mobile":
				number(table.cell(i, 1));
				break;
			case "subject":
				subjects(table.cell(i, 1));
				break;
			case "hobbies":
				hobbies(table.cell(i, 1));
				break;
			case "currentAddress":
				currentAddress(table.cell(i, 1));
				break;
			case "state":
				selectState(table.cell(i, 1));
				break;
			case "city":
				selectCity(table.cell(i, 1));
				break;
			default:
				break;
			}
		}
	}

	public void submit() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", buttonSubmit);
		buttonSubmit.click();
	}
	
	public String title() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(titleSuccess));
		return titleSuccess.getText();
	}
	

}
