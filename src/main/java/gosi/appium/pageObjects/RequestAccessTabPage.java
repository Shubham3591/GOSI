package gosi.appium.pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RequestAccessTabPage {

    private AndroidDriver driver;

    public RequestAccessTabPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Request For Self\"]")
    public WebElement requestForSelfText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Request For Self\"]")
    public WebElement requestForSelf;

}
