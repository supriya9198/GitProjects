package pom_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility_pom.UtilityMethods;

public class LoginPOM 
{
	@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement mobileNo;
	@FindBy(id="lnk_signup1") private WebElement SignUpButton;
	
	
	public LoginPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendMobileNo(WebDriver driver,String mobileNumber ) {
		UtilityMethods.wait(driver, 1000);
		mobileNo.sendKeys(mobileNumber);
		Reporter.log("Entering mobile Number ", true);
	}
	
	public void clickOnSignInButton(WebDriver driver) {
		
		UtilityMethods.wait(driver, 1000);
		SignUpButton.click();
		Reporter.log("Signing up ", true);
	}
}
