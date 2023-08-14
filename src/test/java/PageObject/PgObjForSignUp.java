package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PgObjForSignUp {

	WebDriver driver;

	public PgObjForSignUp(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[normalize-space()='Login/Signup']")
	WebElement SignUp_LoginBtn;
	
	@FindBy(xpath="//a[normalize-space()='Not a member? Signup']")
	WebElement signUp;
	
	@FindBy(xpath="//input[@name='email_id']")
	WebElement emailid;
	
	public void clickonSignUp_Login(){
		SignUp_LoginBtn.click();
	}
	
	public void clickonSignUp() {
		signUp.click();
	}
	
	public void flyawayRegistration() {
		Actions actions = new Actions(driver);
		Action seriesOfAction = actions 
				.moveToElement(emailid)
				.click()
				.sendKeys("rajusharma@gmail.com",Keys.TAB)
				.sendKeys("Raju@123",Keys.TAB)
				.sendKeys("Raju@123",Keys.TAB)
				.sendKeys("Raju Sharma",Keys.TAB)
				.sendKeys("Madurdaha , Kolkata",Keys.TAB)
				.sendKeys("Kolkata",Keys.ENTER).build();
		seriesOfAction.perform();
	}
	
	

}