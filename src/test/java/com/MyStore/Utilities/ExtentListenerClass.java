package com.MyStore.Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentListenerClass implements ITestListener {

	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void configureReport() {
		
		
		Read_Config_File redconfig=new Read_Config_File();
		
		String timestamp=new SimpleDateFormat("yyyy.mmmm.dd.hh.mm.ss").format(new Date());
		String reportName=" My Store Test Reports -" +timestamp +".html";
		
		htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir")+ "//Reports//" + reportName);
		reports =new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		// Add System Information / Environment information to reports:
		reports.setSystemInfo("Machine", "TestPc1");
		reports.setSystemInfo("Os", "Windows 11");
		reports.setSystemInfo("Browser",redconfig.getBrowser());
		reports.setSystemInfo("User Name","Ashwini");
		
		//Configuration to change look and feel of reports:
		htmlReporter.config().setDocumentTitle("Extends Listener Reports Demo:");
		htmlReporter.config().setReportName("This Is My Frist Reports");
		htmlReporter.config().setTheme(Theme.DARK);
		
		}
	
	//onStart method is called when Any Test case Starts;
	public void onStart(ITestContext Result) 
	{
		configureReport();
		
		System.out.println("On Start Method Invoked...");
		
	}
	// Its Called After All Test case are executed
	public void onFinish(ITestContext Result) {
		
		System.out.println("On Finished Method Invoked");
		reports.flush();
	}
	
		
	// When test Case get Filed this method is called.
public void onTestFailure(ITestResult Result) {
	
		
		System.out.println("Name Of Test Mehtod Failed : " +Result.getName());
		
		// Create Entry in HTML reports;
		test=reports.createTest(Result.getName()); 
		
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of failed testCase :"+Result.getName(),ExtentColor.RED));
		                           		
		String screenshotPath=System.getProperty("user.dir")+"\\ScreenShorts_Folder\\" +Result.getName()+ ".png";
		File screenShotFile =new File(screenshotPath);
		
		
		if(screenShotFile.exists())
		{
			test.fail("Caputre ScrrenShot is below :" +test.addScreenCaptureFromPath(screenshotPath)) ;
		}
				
	}


// When test Case get Skipped this method is called.
public void onTestSkipped(ITestResult Result) {
	
	System.out.println("Name Of Test Mehtod Skipped : " +Result.getName());
	// Create Entry in HTML reports;
	test=reports.createTest(Result.getName()); 
	test.log(Status.SKIP,MarkupHelper.createLabel("Name of skip testCase :"+Result.getName(),ExtentColor.YELLOW));
	
}

// When test Case get Start this method is called.

public void onTestStart(ITestResult Result) {
	
	System.out.println("Name Of Test Mehtod Started : " +Result.getName());
	
}
	

// When test Case get Passed this method is called.
public void onTestSuccess(ITestResult Result) {
	
	System.out.println("Name Of Test Mehtod Succuessfully executed : " +Result.getName());
	test=reports.createTest(Result.getName()); // Create Entry in HTML reports;
	test.log(Status.PASS,MarkupHelper.createLabel("Name of passed testCase :"+Result.getName(),ExtentColor.GREEN));
	
}


public void onTestFailedButWithinSuccessPercentage(ITestContext Result) {
	
	
}






	
	
	
	
	
	
	
	

	
}
