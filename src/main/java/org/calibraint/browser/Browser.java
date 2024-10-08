package org.calibraint.browser;

import org.aeonbits.owner.ConfigFactory;
import org.calibraint.configSetup.Configuration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.File;
import java.util.Collections;


public class Browser {
    public static WebDriver driver;

    public static Configuration config = ConfigFactory.create(Configuration.class);

    public static void chromeDriverOptions() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments(System.getProperties().getProperty("browserMode")+"=new");
        chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        chromeOptions.setExperimentalOption("useAutomationExtension", false);
        chromeOptions.addExtensions(new File(config.build()));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("acceptInsecureCerts", true);
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        chromeOptions.merge(capabilities);
        driver = new ChromeDriver(chromeOptions);
        driver.get("chrome://extensions/");
        Thread.sleep(3000);
        driver.close();
        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[0]);
    }
}
