package com.MyStore.Test_Cases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import com.MyStore.Utilities.Read_Config_File;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test_CasesClass {

	Read_Config_File readConfig = new Read_Config_File();
	String url = readConfig.getBaseURL();
	String browser = readConfig.getBrowser();
		
	public String emailAddress=readConfig.getEmail();
	String password=readConfig.getPassword();

	public static WebDriver driver;
	public static Logger logger;

	@BeforeClass
	@Parameters("browser")
	public void setUp() {
		
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			// WebDriverManager.chromedriver().clearResolutionCache().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			// WebDriverManager.edgedriver().clearResolutionCache().setup();
			driver = new EdgeDriver();
			break;
		default:
			driver = null;
			break;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// initialization Logger

		logger = LogManager.getLogger("CodeStudio_Project");

		// Maximize window:
		driver.manage().window().maximize();

		// Open URl
		driver.get(url);
		logger.info("My Store Is URL Opened");
		
		
	}

	/*
	 * @AfterClass public void tearDown() {
	 *  driver.close(); 
	 *  driver.quit(); }
	 */

	public void captureFullPageScreenShot(WebDriver driver, String testName) throws IOException {

		// Capture Full Page ScreenShot
		// Step 1 :COnvert WebDriver Object to TakeScreenShot interface:

		TakesScreenshot screenshot = ((TakesScreenshot) driver);

		File src = screenshot.getScreenshotAs(OutputType.FILE);
		 	

		File screenShotImage = new File(System.getProperty("user.dir")+ "//ScreenShorts_Folder//" + testName + ".png");

		FileUtils.copyFile(src, screenShotImage);

	}

}
