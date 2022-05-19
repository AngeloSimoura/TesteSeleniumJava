package comum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GlobalDriver {
	
	public static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void iniciarDriver() {
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	    ChromeOptions ops = new ChromeOptions();
	    ops.addArguments("start-maximized");
	    driver = new ChromeDriver(ops);
	}
	public static void fecharDriver() {
	    driver.close();
	    driver.quit();
	}
}
