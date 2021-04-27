package mercedesVehicleAccessoriesAR;

import common.BaseAPI;

import static mercedesVehicleAccessoriesAR.MercedesVehicleAccessoriesWebElements.*;

public class MercedesVehicleAccessories extends BaseAPI {



    public void navigateToVehicleAccessoriesPage(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOPPING_LINK );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_VEHICLE_ACCESSORIES_LINK);
    }
    public void clickScheduleInstallationLink(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOPPING_LINK );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_VEHICLE_ACCESSORIES_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SCHEDULE_INSTALLATION_LINK);
        implicitWait(20);

    }
    public void clickPurchaseOnlineLink(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOPPING_LINK );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_VEHICLE_ACCESSORIES_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_PURCHASE_ONLINE_LINK);
        implicitWait(20);
    }
    public void clickShopNowNSwitchTabs(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOPPING_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_VEHICLE_ACCESSORIES_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOP_NOW_BUTTON);
        switchToNewTab(1);//
        implicitWait(20);
        basicHoverUsingXpath(WEB_ELEMENT_REPLACEMENT_PARTS_LINK);
    }
    public void verifyBrowseAllAvailableAccessoriesHeader(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOPPING_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_VEHICLE_ACCESSORIES_LINK);
        implicitWait(20);
    }
}
