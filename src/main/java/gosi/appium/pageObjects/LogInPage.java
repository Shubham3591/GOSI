package gosi.appium.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {


    public LogInPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"User ID\"]")
    public WebElement username;


    @AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Enter Password\"]")
    public WebElement password;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text=\"Login\"])[2]")
    public WebElement loginButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Submit\"]")
    public WebElement MFAPage;

    public void loginApp(String name, String pswd) {
        username.sendKeys(name);
        password.sendKeys(pswd);
        loginButton.click();
    }
}
