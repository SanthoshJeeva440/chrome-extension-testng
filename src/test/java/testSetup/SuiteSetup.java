package testSetup;

import org.calibraint.browser.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuiteSetup extends Browser {

    @BeforeClass(alwaysRun = true)
    public static void launchBrowser() throws InterruptedException {
        chromeDriverOptions();
    }

    @AfterClass()
    public static void closeBrowser() {
        driver.quit();
    }
}
