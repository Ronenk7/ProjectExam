package workflows;

import extentions.MobileActions;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

public class MobileFlows extends CommonOps {

    @Step("Business Flow: Fill Form and Calculate Mortgage")
    public static void personalDetails() {

        MobileActions.clickIfAvailable(mobileZIMShippingMain.getBtn_permission());
        MobileActions.visibilityOfElements(mobileZIMShippingMain.getPng_loadingLogo());
        MobileActions.clickIfAvailable(mobileZIMShippingMain.getBtn_save());
        MobileActions.click(mobileZIMShippingMain.getBtn_more());
        MobileActions.click(mobileZIMShippingMore.getBtn_contactUs());
        MobileActions.click(mobileZIMShippingContactUs.getBtn_selectTopic());
        MobileActions.click(mobileZIMShippingContactUs.getRadioBtn_customerService());
        wait.until(ExpectedConditions.elementToBeClickable(mobileZIMShippingContactUs.getTxt_firstName()));
        MobileActions.updateText(mobileZIMShippingContactUs.getTxt_firstName(), getData("FirsName)"));
    }
}


