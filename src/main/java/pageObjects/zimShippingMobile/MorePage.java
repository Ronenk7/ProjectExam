package pageObjects.zimShippingMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MorePage {
    private AppiumDriver mobileDriver;
    /*
    ###################################################################################
    Method name: MainPage
    Method description: This method initialize the appium driver
    Method parameters : AppiumDriver
    ###################################################################################
     */
    public MorePage(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, 3,
                TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "more-contact-us-btn")
    private AndroidElement btn_contactUs;

    public AndroidElement getBtn_contactUs(){return btn_contactUs;}
}
