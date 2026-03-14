package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnersImplementation implements ITestListener {

	// creating global varibale
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalandarDetails("dd-MM-YYYY hh-mm-ss");
	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname + " On test start executed");

		// Creating a field in Extent report
		test = reports.createTest(methodname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname + " on test success executed");

		// logging the status as Pass
		test.generateLog(Status.PASS, methodname + " - has passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname + " On test failure executed");

		// capturing screenshot
		String ScreenshotName = methodname + " - " + dateTimeStamp;
		SeleniumUtility sUtil = new SeleniumUtility();
		try {
			String path = sUtil.captureScreenshot(BaseClass.sDriver, ScreenshotName);

			// attaching screenshot to report
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// logging the status as Fail
		test.log(Status.FAIL, methodname + " - has failed");
		test.log(Status.INFO, result.getThrowable());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		System.out.println(methodname + " On test skipped executed");

		// logging the status as Skipped
		test.generateLog(Status.SKIP, methodname + " - skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On start executed");

		// Configuration of extent reports
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent Reports\\report-" + dateTimeStamp + ".html");
		reporter.config().setDocumentTitle("Extent Reports");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.DARK);

		// Generate empty report
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888/");
		reports.setSystemInfo("Base Platform", "Windows");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Test Engineer", "Aditya");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On finish executed ");

		// flushing out reports
		reports.flush();
	}
}
