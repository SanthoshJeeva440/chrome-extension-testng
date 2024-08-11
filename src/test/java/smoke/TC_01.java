package smoke;

import org.calibraint.pages.HedgeHomePage;
import org.testng.annotations.Test;
import testSetup.SuiteSetup;


public class TC_01 extends SuiteSetup {
    @Test(priority = 0)
    public void validateHedgeHomePage() {
        HedgeHomePage.hedgeLaunchScreen();
    }

    @Test(priority = 1)
    public void createNewWallet() {
        HedgeHomePage.clickCreateWalletButton();

    }
}
