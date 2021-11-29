package pageObjects.zimShippingMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ContactUsPage {

    private AppiumDriver mobileDriver;
    /*
    ###################################################################################
    Method name: MainPage
    Method description: This method initialize the appium driver
    Method parameters : AppiumDriver
    ###################################################################################
     */
    public ContactUsPage(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, 3,
                TimeUnit.SECONDS), this);
    }

    @AndroidFindBy(id = "689aa33e-6ad9-4cec-fedd-5b2030b09ab4")
    private AndroidElement btn_selectTopic;

    @AndroidFindBy (xpath = "//*[@text='Customer Service']")
    private AndroidElement radioBtn_customerService;

    @AndroidFindBy (id = "e51b7c14-7db2-4c6b-9f45-9b85daf1ee6a")
    private AndroidElement txt_firstName;

    public AndroidElement getBtn_selectTopic(){return btn_selectTopic;}
    public AndroidElement getRadioBtn_customerService(){return radioBtn_customerService;}
    public AndroidElement getTxt_firstName(){return txt_firstName;}
}
