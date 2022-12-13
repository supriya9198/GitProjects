package pom_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility_pom.UtilityMethods;

public class PasswordPOM {

	
		
		@FindBy(id="txt_accesspin")private WebElement Password;
		@FindBy(id="lnk_submitaccesspin") private WebElement Submitutton;
		
		public PasswordPOM(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void EnterPassword(WebDriver driver, String PasswordData)
		{
			UtilityMethods.wait(driver, 1000);
			Password.sendKeys(PasswordData);
			Reporter.log("Entering Password ", true);
		}
		
		public void clickingOnSubmitButton(WebDriver driver)
		{
			UtilityMethods.wait(driver, 1000);
			Submitutton.click();
			Reporter.log("Clicking on submit button", true);
		}
	
}
