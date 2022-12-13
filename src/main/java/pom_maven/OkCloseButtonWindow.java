package pom_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility_pom.UtilityMethods;

public class OkCloseButtonWindow {
	
	
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement closeButton;
	
	
	public OkCloseButtonWindow(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void handlePopUp(WebDriver driver)
	{
	UtilityMethods.wait(driver, 1000);
	okButton.click();
	Reporter.log("clciking on OK button of Popup", true);
	UtilityMethods.wait(driver, 1000);
	closeButton.click();
	Reporter.log("clciking on Close button of Popup", true);
	}

}
