package org.calibraint.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class HedgeHomePojo {
    public static HedgeHomePojo homeInstance;

    public HedgeHomePojo() {

    }

    public static HedgeHomePojo getHomeInstance() {
        if (homeInstance == null) {
            homeInstance = new HedgeHomePojo();
        }
        return homeInstance;
    }

    public WebElement getHedgeTitle() {
        return hedgeTitle;
    }

    public WebElement getHedgeWelcomeLogo() {
        return hedgeWelcomeLogo;
    }

    public WebElement getWelcomeHedgeText() {
        return welcomeHedgeText;
    }

    public WebElement getHedgeMessage() {
        return hedgeMessage;
    }

    public WebElement getHedgeGetStartText() {
        return hedgeGetStartText;
    }

    public WebElement getHedgeStartMessage() {
        return hedgeStartMessage;
    }

    public WebElement getCreateWalletButton() {
        return createWalletButton;
    }

    public WebElement getExistingWalletButton() {
        return existingWalletButton;
    }

    public WebElement getHelpButton() {
        return helpButton;
    }

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>img:nth-child(1)")
    })
    private WebElement hedgeTitle;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>img:nth-child(2)")
    })
    private WebElement hedgeWelcomeLogo;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>div>h1")
    })
    private WebElement welcomeHedgeText;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(1)>div>p")
    })
    private WebElement hedgeMessage;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(1)>h2")
    })
    private WebElement hedgeGetStartText;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(1)>p")
    })
    private WebElement hedgeStartMessage;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(1)>div>button:nth-child(1)")
    })
    private WebElement existingWalletButton;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(1)>div>button:nth-child(2)>span")
    })
    private WebElement createWalletButton;

    @FindAll({
            @FindBy(css = ".relative>div>div>div:nth-child(2)>div>div:nth-child(2)>button")
    })
    private WebElement helpButton;

}

