package testSetup;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.calibraint.browser.Browser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners({ExtentITestListenerClassAdapter.class})
public class SuiteSetup extends Browser {

    @BeforeClass(alwaysRun = true)
    public static void launchBrowser() throws InterruptedException {
        chromeDriverOptions();
    }

    @AfterClass()
    public static void closeBrowser() {
        driver.quit();
    }

    @AfterMethod
    public synchronized void captureResult(ITestResult result) {
        switch (result.getStatus()) {
            case ITestResult.FAILURE:
                ExtentTestManager.getTest(result).fail("ITestResult.FAILURE, event afterMethod",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(getImage()).build());
                break;
            case ITestResult.SKIP:
                ExtentTestManager.getTest(result).skip("ITestResult.SKIP, event afterMethod");
                break;
            default:
                break;
        }
    }

    private String getImage() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
    }
}
