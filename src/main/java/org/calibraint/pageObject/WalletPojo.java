package org.calibraint.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WalletPojo {
    public static WalletPojo walletInstance;

    public WalletPojo() {
    }

    public static WalletPojo getWalletInstance() {
        if (walletInstance == null) {
            walletInstance = new WalletPojo();
        }
        return walletInstance;
    }
    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>div>div:nth-child(1)>h1")
    })
    private WebElement createWalletText;
    public WebElement getCreateWalletText() {
        return createWalletText;
    }
}
