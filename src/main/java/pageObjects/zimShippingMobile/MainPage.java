package pageObjects.zimShippingMobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends CommonOps {

    private AppiumDriver mobileDriver;
    /*
    ###################################################################################
    Method name: MainPage
    Method description: This method initialize the appium driver
    Method parameters : AppiumDriver
    ###################################################################################
     */
    public MainPage(AppiumDriver mobileDriver) {
        this.mobileDriver = mobileDriver;
        PageFactory.initElements(new AppiumFieldDecorator(mobileDriver, 3,
                TimeUnit.SECONDS), this);
    }

    @AndroidFindBy (id = "permission_allow_button")
    private List<AndroidElement> btn_permission;

    @AndroidFindBy (xpath = "//*[@knownSuperClass='android.widget.ProgressBar']")
    private List<AndroidElement> png_loadingLogo;

    @AndroidFindBy (xpath = "//*[@text='SAVE']")
    private List<AndroidElement> btn_save;

    @AndroidFindBy (id = "tab-button-more")
    private AndroidElement btn_more;

    public List<AndroidElement> getBtn_permission(){return btn_permission;}
    public List<AndroidElement> getPng_loadingLogo(){return png_loadingLogo;}
    public List<AndroidElement> getBtn_save(){return btn_save;}
    public AndroidElement getBtn_more(){return btn_more;}
}
