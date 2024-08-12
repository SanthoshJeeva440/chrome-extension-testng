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
    public WebElement getCreateWalletText() {
        return createWalletText;
    }

    public WebElement getImportWalletText() {
        return importWalletText;
    }

    public WebElement getStep1Text() {
        return step1Text;
    }

    public WebElement getWalletMessage() {
        return walletMessage;
    }

    public WebElement getHaveWalletText() {
        return haveWalletText;
    }

    public WebElement getCreateWalletButton() {
        return createWalletButton;
    }

    public WebElement getImportWalletButton() {
        return importWalletButton;
    }

    public WebElement getChoosePasswordText() {
        return choosePasswordText;
    }

    public WebElement getPasswordInfoText() {
        return passwordInfoText;
    }

    public WebElement getEnterPasswordLabel() {
        return enterPasswordLabel;
    }

    public WebElement getEnterPasswordInput() {
        return enterPasswordInput;
    }

    public WebElement getShowEnterPassword() {
        return showEnterPassword;
    }

    public WebElement getReEnterPasswordLabel() {
        return reEnterPasswordLabel;
    }

    public WebElement getReEnterPasswordInput() {
        return reEnterPasswordInput;
    }

    public WebElement getShowReEnterPassword() {
        return showReEnterPassword;
    }

    public WebElement getPasswordConfirmCheckBox() {
        return passwordConfirmCheckBox;
    }

    public WebElement getPasswordConfirmText() {
        return passwordConfirmText;
    }

    public WebElement getLearnMoreDeepLink() {
        return learnMoreDeepLink;
    }

    public WebElement getProceedButton() {
        return proceedButton;
    }

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>div>div:nth-child(1)>h1")
    })
    private WebElement createWalletText;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>div>div:nth-child(1)>h1")
    })
    private WebElement importWalletText;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>div>div:nth-child(1)>p:nth-child(1)")
    })
    private WebElement step1Text;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>div>div:nth-child(1)>p:nth-child(3)")
    })
    private WebElement walletMessage;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(1)>div>button>p")
    })
    private WebElement haveWalletText;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(1)>button")
    })
    private WebElement createWalletButton;
    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(1)>button")
    })
    private WebElement importWalletButton;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(2)>h2")
    })
    private WebElement choosePasswordText;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(2)>p")
    })
    private WebElement passwordInfoText;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(2)>form>div:nth-child(1)>label")
    })
    private WebElement enterPasswordLabel;
    @FindAll({
            @FindBy(css = ".input-main:nth-child(1)>div>div>div>div>div>div>span>input")
    })
    private WebElement enterPasswordInput;
    @FindAll({
            @FindBy(css = ".input-main:nth-child(1)>div>div>div>div>div>div>span>span>span")
    })
    private WebElement showEnterPassword;
    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(2)>form>div:nth-child(2)>label")
    })
    private WebElement reEnterPasswordLabel;
    @FindAll({
            @FindBy(css = ".input-main:nth-child(2)>div>div>div>div>div>div>span>input")
    })
    private WebElement reEnterPasswordInput;
    @FindAll({
            @FindBy(css = ".input-main:nth-child(2)>div>div>div>div>div>div>span>span>span")
    })
    private WebElement showReEnterPassword;
    @FindAll({
            @FindBy(css = "#myForm_checkbox")
    })
    private WebElement passwordConfirmCheckBox;
    @FindAll({
            @FindBy(css = "p.text-secondary-600.ml-8:nth-child(1)")
    })
    private WebElement passwordConfirmText;

    @FindAll({
            @FindBy(css = "[target='blank']")
    })
    private WebElement learnMoreDeepLink;

    @FindAll({
            @FindBy(css = "button[type='submit']")
    })
    private WebElement proceedButton;
}
