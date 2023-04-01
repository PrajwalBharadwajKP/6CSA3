package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="gender-male")
	private WebElement maleRadioBTN;
	@FindBy(id="gender-female")
	private WebElement femaleRadioBTN;
	@FindBy(id="FirstName")
	private WebElement firstnameTXT;
	@FindBy(id="LastName")
	private WebElement lastnameTXT;
	@FindBy(id="Email")
	private WebElement emailTXT;
	@FindBy(id="Password")
	private WebElement passwordTXT;
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTXT;
	@FindBy(id="register-button")
	private WebElement registerBTN;
	public WebElement getMaleRadioBTN() {
		return maleRadioBTN;
	}
	public WebElement getFemaleRadioBTN() {
		return femaleRadioBTN;
	}
	public WebElement getFirstnameTXT() {
		return firstnameTXT;
	}
	public WebElement getLastnameTXT() {
		return lastnameTXT;
	}
	public WebElement getEmailTXT() {
		return emailTXT;
	}
	public WebElement getPasswordTXT() {
		return passwordTXT;
	}
	public WebElement getConfirmPasswordTXT() {
		return confirmPasswordTXT;
	}
	public WebElement getRegisterBTN() {
		return registerBTN;
	}
}