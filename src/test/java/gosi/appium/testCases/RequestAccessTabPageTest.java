package gosi.appium.testCases;

import gosi.appium.base.BaseTest;
import gosi.appium.pageObjects.DashboardPage;
import gosi.appium.pageObjects.RequestAccessTabPage;
import org.testng.annotations.Test;

public class RequestAccessTabPageTest extends BaseTest {

    @Test
    public void requestAccessFlow(){
        DashboardPage dp = new DashboardPage(driver);
        RequestAccessTabPage rp = new RequestAccessTabPage(driver);
        waitForElementTobeClickable(dp.requestAccessTab);
        dp.requestAccessTab.click();
        rp.requestForSelf.click();
    }

}
