package gosi.appium.testCases;

import gosi.appium.base.BaseTest;
import org.testng.annotations.Test;

public class LogInPageTest extends BaseTest{


    @Test
    public void LogIn() throws InterruptedException {

         Thread.sleep(2000);


        lp.username.sendKeys("ASANITYUSR");
        waitForElementTobeClickable(lp.password);
        lp.password.sendKeys("Sanity@123");
        waitForElementTobeClickable(lp.loginButton);
        lp.loginButton.click();
        Thread.sleep(1000);
        waitForElementTobeClickable(lp.MFAPage);
        lp.MFAPage.click();

    }

}