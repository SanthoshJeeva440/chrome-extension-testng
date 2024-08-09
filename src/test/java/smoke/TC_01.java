package smoke;

import org.calibraint.pages.HedgeHomePage;
import org.testng.annotations.Test;
import testSetup.SuiteSetup;

public class TC_01 extends SuiteSetup {
    @Test
    public void validateHedgeHomePage(){
        HedgeHomePage.hedgeLaunchScreen();
    }

    @Test
    public void createNewWallet(){
        HedgeHomePage.hedgeLaunchScreen();
    }
}
