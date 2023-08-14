package FlyAwayTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PgObjForLogin;
import resources.Base;

public class LoginPageTest extends Base {
	@BeforeTest
	public void openUrl() throws IOException {
		WebDriver driver = openBrowser();
		driver.get(prop.getProperty("Url"));

	}
	@Test
	public void loginTest() {
		PgObjForLogin flayawaylogin = new PgObjForLogin(driver);
		flayawaylogin.clickonSignUp_Login();
		flayawaylogin.loginIntoFlyaway();
	}
}
