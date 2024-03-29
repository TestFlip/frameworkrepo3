package reports;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.TestBase;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

public class ModellerTestListener  extends TestBase implements ITestListener {
    @Override
    public void onStart(ITestContext iTestContext) {
        iTestContext.setAttribute("WebDriver", getDriver());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        TestModellerLogger.ClearModellerContext();

        Object testClass = iTestResult.getInstance();

        if (testClass instanceof TestBase) {
            WebDriver webDriver = ((TestBase) testClass).getDriver();

            TestModellerLogger.PassStepWithScreenshot(webDriver, "Test Passed");
        } else {
            TestModellerLogger.PassStep("Test Passed");
        }
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        TestModellerLogger.ClearModellerContext();

        Object testClass = iTestResult.getInstance();

        if (testClass instanceof TestBase) {
            WebDriver webDriver = ((TestBase) testClass).getDriver();

            TestModellerLogger.FailStepWithScreenshot(webDriver, "Test Failed");
        } else {
            TestModellerLogger.FailStep("Test Failed");
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }
}
