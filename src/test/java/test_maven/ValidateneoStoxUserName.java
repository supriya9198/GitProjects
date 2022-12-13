package test_maven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_pom.Base;
import pom_maven.LoginPOM;
import pom_maven.OkCloseButtonWindow;
import pom_maven.PasswordPOM;
import utility_pom.UtilityMethods;

public class ValidateneoStoxUserName extends Base {
	LoginPOM Login;
	PasswordPOM password;
	OkCloseButtonWindow PopUP;
	@BeforeClass
	public void launchneoStox() throws InterruptedException
	{
		 LaunchBrowser();
		 Login = new LoginPOM(driver);
		 password = new PasswordPOM(driver);
		 PopUP = new OkCloseButtonWindow(driver);
		
	}
	
	@BeforeMethod
	
	public void logintoneoStox() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Login.sendMobileNo(driver, UtilityMethods.excelDataReading(0, 0));
		Login.clickOnSignInButton(driver);
		UtilityMethods.wait(driver, 1000);
		Thread.sleep(2000);
		password.EnterPassword(driver, UtilityMethods.excelDataReading(0, 1));
		Thread.sleep(3000);
		password.clickingOnSubmitButton(driver);
		UtilityMethods.wait(driver, 1000);
		Thread.sleep(1000);
		PopUP.handlePopUp(driver);
		
		
		
	} 
  @Test
  public void f() {
  }
}
