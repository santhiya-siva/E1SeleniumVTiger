package GenericUtilitity;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener  {

     ExtentReports report;
     ExtentTest test;
     JavaUtility jUtil=new JavaUtility();
 	String dateTimesStamp=jUtil.getCalendarDetails("dd-mm-yyy hh-mm-ss");
 	
	@Override
	public void onTestStart(ITestResult result) {
	String methodname=result.getMethod().getMethodName();
	System.out.println(methodname+"Test execution start");
	test=report.createTest(methodname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"Test execution success");
		test.log(Status.PASS, methodname+"execution failed");
		
			
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"Test failed");
		test.log(Status.FAIL, methodname+"execution failed");
		//creating the screenshot to attach
		SeleniumUtility sUtil=new SeleniumUtility();
	String screenshotname= methodname +dateTimesStamp;
	try {
		String path=sUtil.captureScreenshot(BaseClass.sdriver, screenshotname);
		test.addScreenCaptureFromPath(path);
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		System.out.println(methodname+"Test execution skipped");
		test.log(Status.SKIP, methodname+"execution failed");
		
		
		}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		}

	@Override
	public void onStart(ITestContext result) {
		//String methodname=result.getMethod().getMethodName();
		System.out.println("suite started");
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\ExtentReports\\reports-"+dateTimesStamp+".html");
		reporter.config().setDocumentTitle("Vtigertesting reports");
		reporter.config().setReportName("vtiger");
		reporter.config().setTheme(Theme.STANDARD);
		report =new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("base url", "http://localhost:8888");	
		
		
	}

	@Override
	public void onFinish(ITestContext result) {
		report.flush();
		}
	
	

}
