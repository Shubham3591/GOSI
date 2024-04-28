package gosi.appium.base;

import gosi.appium.pageObjects.DashboardPage;
import gosi.appium.pageObjects.LogInPage;
import gosi.appium.pageObjects.RequestAccessTabPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static java.time.Duration.ofSeconds;

public class BaseTest {

    public static AndroidDriver driver;
    public AppiumDriverLocalService service;
    public static LogInPage lp;



    @BeforeSuite
    public void ConfigureAppium() throws MalformedURLException {

        /*service = new AppiumServiceBuilder().withAppiumJS(new File("C:/Users/91966/AppData/Roaming/npm/node_modules/appium/lib/main.js"))
                .withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();*/


        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("GOSI"); //emulator
        options.setApp(System.getProperty("user.dir") + "/src/test/java/gosi/appium/resources/Gosi-Mobile-App.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        lp = new LogInPage(driver);



    }



   /* @AfterSuite
    public void tearDown(){
        driver.quit();
        service.stop();}*/

    public static WebElement waitForElementTobeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }
}
