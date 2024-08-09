package org.calibraint.pageObject;

import org.calibraint.browser.Browser;
import org.openqa.selenium.support.PageFactory;

public class BasePojo extends Browser {

    // all pojo page achieved by singleton page model
    // here import all page object instance

    public static void initElements() {
        PageFactory.initElements(driver, HedgeHomePojo.getHomeInstance());
        PageFactory.initElements(driver, WalletPojo.getWalletInstance());
    }
}
