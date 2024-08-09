package org.calibraint.pages;

import org.calibraint.pageObject.BasePojo;
import org.calibraint.pageObject.HedgeHomePojo;
import org.calibraint.pageObject.WalletPojo;
import org.calibraint.utils.SeleniumUtils;

public class HedgeHomePage extends SeleniumUtils {

    public static void hedgeLaunchScreen() {
        BasePojo.initElements();
        waitUntilElementIsVisible(HedgeHomePojo.getHomeInstance().getHedgeTitle(), 30);
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getHedgeTitle());
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getHedgeWelcomeLogo());
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getWelcomeHedgeText());
        elementShouldContainText(HedgeHomePojo.getHomeInstance().getWelcomeHedgeText(), "Welcome to Hedgehogg");
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getHedgeMessage());
        elementShouldContainText(HedgeHomePojo.getHomeInstance().getHedgeMessage(), "Hedgehogg is your gateway to a secure and convenient digital asset management experience, offering easy access to your balances, transaction history, and essential features.");
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getHedgeGetStartText());
        elementShouldContainText(HedgeHomePojo.getHomeInstance().getHedgeGetStartText(), "Let’s get started");
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getHedgeStartMessage());
        elementShouldContainText(HedgeHomePojo.getHomeInstance().getHedgeStartMessage(), "Trusted by millions, Hedgehogg is a secure wallet making the world of web3 accessible to all.");
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getCreateWalletButton());
        elementShouldContainText(HedgeHomePojo.getHomeInstance().getCreateWalletButton(), "Create a new wallet");
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getExistingWalletButton());
        elementShouldContainText(HedgeHomePojo.getHomeInstance().getExistingWalletButton(), "Import an existing wallet");
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getHelpButton());
        elementShouldContainText(HedgeHomePojo.getHomeInstance().getHelpButton(), "Help");
    }
    public static void clickCreateWalletButton(){
        waitUntilElementIsVisible(HedgeHomePojo.getHomeInstance().getCreateWalletButton(), 30);
        elementShouldBeVisible(HedgeHomePojo.getHomeInstance().getCreateWalletButton());
        clickElement(HedgeHomePojo.getHomeInstance().getCreateWalletButton());
        waitUntilElementIsVisible(WalletPojo.getWalletInstance().getCreateWalletText(), 20);
    }
}
