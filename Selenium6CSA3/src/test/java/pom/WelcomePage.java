package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerBTN;
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginBTN;
	public WebElement getRegisterBTN() {
		return registerBTN;
	}
	public WebElement getLoginBTN() {
		return loginBTN;
	}
}