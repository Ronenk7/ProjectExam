package sanity;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.MobileFlows;

@Listeners(utilities.Listeners.class)
public class ZIMShippingMobile extends CommonOps {

    @Test(description = "Test 01 - Contact Us")
    @Description("This test fill in a contact us form")
    public void test01_contactUs() {
        MobileFlows.personalDetails();
    }
}
