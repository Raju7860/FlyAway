package FlyAwayTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PgObjForFlightBook;
import resources.Base;

public class FlightBookTest extends Base {
	@BeforeTest
	public void openUrl() throws IOException {
		WebDriver driver = openBrowser();
		driver.get(prop.getProperty("Url"));
	}

	@Test
	public void flightBookingTest() {
		PgObjForFlightBook flyawayflightbook = new PgObjForFlightBook(driver);
		flyawayflightbook.clickonSignUp_Login();
		flyawayflightbook.loginIntoFlyaway();
		flyawayflightbook.clickOnHome();
		flyawayflightbook.selectSource();
		flyawayflightbook.selectDestination();
		flyawayflightbook.clickonSubmitBtn();
		flyawayflightbook.clickonBookFlight();
		flyawayflightbook.clickToCompleteBooking();
		flyawayflightbook.validateFlyAway_BookingConfirmationTxt();
		flyawayflightbook.clickonSeeYourBooking();
		
		
}
	
}

