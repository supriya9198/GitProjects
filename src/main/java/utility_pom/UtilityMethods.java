package utility_pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityMethods {
	
	//Common methods
	//screenshot wait scrolling excel reading
	
	public static String excelDataReading(int Row, int Cell) throws EncryptedDocumentException, IOException
	{
		
		//Reading Excel data
		File myFile= new File("F:\\Software Testing Data class\\ExcelSheets\\neostoxdata.xlsx");
		String Value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(Row).getCell(Cell).getStringCellValue();
		Reporter.log("reading data from excel", true);
		return Value;
		
	}
	
	public static void scrollIntoView(WebDriver driver,WebElement Element) {
	
		JavascriptExecutor JS = ((JavascriptExecutor)driver);
		JS.executeScript("arguments[0].scrollIntoView(true)",Element);
		Reporter.log("SCrolling into view",true);
	}
	
	public static void screenshot(WebDriver driver,String ScrnshotName) throws IOException
	{
		File temp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\Software Testing Data class\\Screenshots"+ScrnshotName+".png");
		FileHandler.copy(temp, dest);
		Reporter.log("Taking ScreenShots", true);
		
	}
	
	public static void wait(WebDriver driver,int waitTime) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
		Reporter.log("Waithing for "+waitTime+" ms time", true);
	}

}
