package utilities;

public class MangePages extends Base{
    /*
    ###################################################################################
    Method name: initMobileMortgage
    Method description: This method initialize the elements
    ###################################################################################
     */
    public static void initMobileMortgage() {
        mobileZIMShippingMain = new pageObjects.zimShippingMobile.MainPage(mobileDriver);
        mobileZIMShippingMore = new pageObjects.zimShippingMobile.MorePage(mobileDriver);
        mobileZIMShippingContactUs = new pageObjects.zimShippingMobile.ContactUsPage(mobileDriver);
    }
}
