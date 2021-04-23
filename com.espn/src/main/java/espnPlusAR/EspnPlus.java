package espnPlusAR;

import common.BaseAPI;

import static espnPlusAR.EspnPlusWebElements.*;

public class EspnPlus extends BaseAPI {

    public void navigateToEspnPlus(){
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ESPN_PLUS);
    }

    public void navigateToFeatured(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ESPN_PLUS);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FEATURED);
    }

    public void navigateToOriginals(){
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ESPN_PLUS);
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ORIGINALS);
        implicitWait(20 );
    }

    public void navigateToTrailers(){
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ESPN_PLUS);
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ORIGINALS);
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TRAILERS);
        implicitWait(20 );
    }
    public void browseToBasketBall(){
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ESPN_PLUS);
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BROWSE);
        implicitWait(20 );
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_BASKETBALL);
        implicitWait(20);
    }









}
