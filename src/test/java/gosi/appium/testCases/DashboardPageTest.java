package gosi.appium.testCases;

import gosi.appium.base.BaseTest;
import gosi.appium.pageObjects.DashboardPage;
import gosi.appium.pageObjects.RequestAccessTabPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static gosi.appium.base.BaseTest.driver;
import static gosi.appium.base.BaseTest.waitForElementTobeClickable;

public class DashboardPageTest {


    @Test
    public void clickRequestAccessTabTest() {
        DashboardPage dp = new DashboardPage(driver);
        RequestAccessTabPage rp = new RequestAccessTabPage(driver);
        waitForElementTobeClickable(dp.requestAccessTab);
        dp.requestAccessTab.click();

        String requestForSelfText = rp.requestForSelfText.getText();
        Assert.assertEquals(requestForSelfText ,"Request For Self");


    }


}
