package FlyAwayTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PgObjForSignUp;
import resources.Base;

public class SignUpPageTest extends Base {
	@BeforeTest
	public void openUrl() throws IOException {
		WebDriver driver = openBrowser();
		driver.get(prop.getProperty("Url"));

	}
	
	@Test
	public void signUpTest() {
		
		PgObjForSignUp flyawaysignup = new PgObjForSignUp(driver);
		flyawaysignup.clickonSignUp_Login();
		flyawaysignup.clickonSignUp();
		flyawaysignup.flyawayRegistration();	
		
		
	}
}
