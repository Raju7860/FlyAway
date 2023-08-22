package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PgObjForFlightBook {
	WebDriver driver;

	public PgObjForFlightBook(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Login/Signup']")
	WebElement SignUp_LoginBtn;

	@FindBy(xpath = "//input[@name='email_id']")
	WebElement emailid;

	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement home;

	@FindBy(xpath = "//select[@name='source']")
	WebElement source;

	@FindBy(xpath = "//select[@name='destination']")
	WebElement destination;

	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//a[normalize-space()='Book Flight']")
	WebElement book_Flight;
	
	@FindBy(css = "a[href='completepurchase']")
	WebElement completeBooking;
	
	@FindBy(xpath = "//h3[normalize-space()='FLYAWAY - BOOKING CONFIRMATION']")
	WebElement confirmationTxt;
	
	@FindBy(xpath = "//a[normalize-space()='See Your Bookings']")
	WebElement seeYourBookings;

	public void clickonSignUp_Login() {
		SignUp_LoginBtn.click();
	}

	public void loginIntoFlyaway() {

		Actions actions = new Actions(driver);
		Action seriesOfAction = actions.moveToElement(emailid).click().sendKeys("rajusharma@gmail.com", Keys.TAB)
				.sendKeys("Raju@123", Keys.ENTER).build();
		seriesOfAction.perform();
	}

	public void clickOnHome() {
		home.click();
	}

	public void selectSource() {

		Select select = new Select(source);
		select.selectByIndex(2);

	}

	public void selectDestination() {

		Select select2 = new Select(destination);
		select2.selectByIndex(4);
	}

	public void clickonSubmitBtn() {
		submitBtn.click();
	}

	public void clickonBookFlight() {
		
		book_Flight.click();

	}
	
	public void clickToCompleteBooking() {
		
		completeBooking.click();

	}
	
	public void validateFlyAway_BookingConfirmationTxt() {
		
		Assert.assertTrue(confirmationTxt.isDisplayed());
	}

	public void clickonSeeYourBooking() {
		
		seeYourBookings.click();
	}
	
	
}
