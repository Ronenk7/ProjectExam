package extentions;

import com.google.common.util.concurrent.Uninterruptibles;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pageObjects.zimShippingMobile.MainPage;
import utilities.CommonOps;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MobileActions extends CommonOps {

    @Step("click on MobileElement")
    public static void click(MobileElement elem) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    @Step("Update Text MobileElement")
    public static void updateText(MobileElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }

    @Step("Tap on Element")
    public static void tap(int fingers, MobileElement elem, int duration) {
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        mobileDriver.tap(fingers, elem, duration);
    }

    @Step("Swipe")
    public static void swipe(int startX, int startY, int endX, int endY, int duration) {
        Uninterruptibles.sleepUninterruptibly(500, TimeUnit.MILLISECONDS);
        mobileDriver.swipe(startX, startY, endX, endY, duration);
    }

    @Step("Zoom Element")
    public static void zoom(MobileElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        mobileDriver.zoom(elem);
    }

    @Step("Pinch Element")
    public static void pinch(MobileElement elem) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        mobileDriver.pinch(elem);
    }

    @Step("Update Dropdown Element")
    public static void updateDropDown(MobileElement elem, String text) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        Select dropDown = new Select(elem);
        dropDown.selectByVisibleText(text);
    }

  @Step("Execute Script")
  public static void executeScript(String script) {
      mobileDriver.executeScript(script);
  }

    public static boolean clickIfAvailable(List<AndroidElement> elems) {
        if(elems.size() == 0)
            return true;
        else
            elems.get(0).click();
            return false;
    }

    public static void visibilityOfElements(List<AndroidElement> elems) {

        while (elems.size() > 0)
            continue;
    }
}