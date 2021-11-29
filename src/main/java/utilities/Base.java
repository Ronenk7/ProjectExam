package utilities;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Base {
   // General
   protected static WebDriverWait wait;
   protected static Actions action;
   protected static SoftAssert softAssert;
   protected static String Platform;

   // Web
   protected static WebDriver driver;

   // Mobile
   protected static AppiumDriver mobileDriver;
   protected static DesiredCapabilities dc = new DesiredCapabilities();

   // Page Objects - Mobile
   protected static pageObjects.zimShippingMobile.MainPage mobileZIMShippingMain;
   protected static pageObjects.zimShippingMobile.MorePage mobileZIMShippingMore;
   protected static pageObjects.zimShippingMobile.ContactUsPage mobileZIMShippingContactUs;

}
