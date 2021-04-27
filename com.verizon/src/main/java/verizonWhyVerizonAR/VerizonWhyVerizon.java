package verizonWhyVerizonAR;

import common.BaseAPI;

import static verizonWhyVerizonAR.VerizonWhyVerizonWebElements.*;

public class VerizonWhyVerizon extends BaseAPI {


    public void verifyWhyVerizonPageHeader(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_WHY_VERIZON_LINK);
        implicitWait(20);
    }

    public void verifyWhyVerizonOverviewTitle(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_WHY_VERIZON_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_WHY_VERIZON_OVERVIEW_LINK);
    }

    public void verifyWhyVerizonOverviewImage(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_WHY_VERIZON_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_WHY_VERIZON_OVERVIEW_LINK);
    }

    public void verifyNetworkLinkSubmenu(){
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_WHY_VERIZON_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_NETWORK_LINK);
    }


}
