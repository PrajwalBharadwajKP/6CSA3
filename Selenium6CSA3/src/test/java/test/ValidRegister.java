package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.ReadDataFromExcel;
import pom.RegisterPage;
import pom.WelcomePage;

public class ValidRegister extends BaseTest{
	@Test
	void validRegister() throws EncryptedDocumentException, IOException {
		ReadDataFromExcel rdfe= new ReadDataFromExcel();
		String firstname=rdfe.fetchData("Sheet1",0,0);
		String lastname = rdfe.fetchData("Sheet1",1,0);
		String email=rdfe.fetchData("Sheet1",2,0);
		String password=rdfe.fetchData("Sheet1",3,0);
		WelcomePage wp=new WelcomePage(driver);
		wp.getRegisterBTN().click();
		RegisterPage rp=new RegisterPage(driver);
		rp.getMaleRadioBTN().click();
		rp.getFirstnameTXT().sendKeys(firstname);
		rp.getLastnameTXT().sendKeys(lastname);
		rp.getEmailTXT().sendKeys(email+"@gmail.com");
		rp.getPasswordTXT().sendKeys(password);
		rp.getConfirmPasswordTXT().sendKeys(password);
		rp.getRegisterBTN().click();
	}
}