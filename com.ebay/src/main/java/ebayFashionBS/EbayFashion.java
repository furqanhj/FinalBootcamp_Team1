package ebayFashionBS;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

import static ebayFashionBS.EbayFashionWebElements.*;

public class EbayFashion extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_FASHION_LINK)
    WebElement fashionLink;
    @FindBy(xpath = WEB_ELEMENT_ADD_SOME_SPARKLE)
    WebElement addSomeSparkle;
    @FindBy(xpath = WEB_ELEMENT_FRAMED_EARRINGS)
    WebElement framedEarrings;
    @FindBy(xpath = WEB_ELEMENT_EARRING_PROTECTION_PLAN_CHECKBOX)
    WebElement earringProtectionPlan;
    @FindBy(xpath = WEB_ELEMENT_HANDBAGS_ACCESSORIES)
    WebElement handbagsAccessories;
    @FindBy(xpath = WEB_ELEMENT_HANDBAGS_ACCESSORIES_HEADER)
    public WebElement header;
    @FindBy(xpath = WEB_ELEMENT_CHANEL_HEADER)
    public WebElement chanelHeader;

    @FindBy(xpath = WEB_ELEMENT_HANDBAGS_CHANEL_CLICK)
    WebElement chanelClick;
    @FindBy(xpath = WEB_ELEMENT_CHANEL_BEIGE_CLICK)
    WebElement chanelBeige;
    @FindBy(xpath = WEB_ELEMENT_SHOULDER_BAG_CLICK)
    WebElement shoulderBag;
    @FindBy(xpath = WEB_ELEMENT_SIZE_LARGE_CLICK)
    WebElement sizeLarge;

    public void navigateToFashionLink() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
    }

    public void navigateToAddSomeSparkle() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ADD_SOME_SPARKLE);
        implicitWait();
    }

    public void navigateToFramedEarrings() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ADD_SOME_SPARKLE);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FRAMED_EARRINGS);
        implicitWait();
    }

    public void clickProtectionPlanCheckbox() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ADD_SOME_SPARKLE);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FRAMED_EARRINGS);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_EARRING_PROTECTION_PLAN_CHECKBOX);
        implicitWait();
    }

    public void navigateToHandbagsAccessoriesPage() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_ACCESSORIES);
        implicitWait();
    }

    public void navigateToChanel() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_ACCESSORIES);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_CHANEL_CLICK);
    }

    public void navigateToBeigeColor() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_ACCESSORIES);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_CHANEL_CLICK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CHANEL_BEIGE_CLICK);
        implicitWait();
    }

    public void navigateToShoulderBag() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_ACCESSORIES);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_CHANEL_CLICK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CHANEL_BEIGE_CLICK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOULDER_BAG_CLICK);

    }

    public void navigateToLargeSize() {
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_ACCESSORIES);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_HANDBAGS_CHANEL_CLICK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_CHANEL_BEIGE_CLICK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SHOULDER_BAG_CLICK);
        implicitWait();
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SIZE_LARGE_CLICK);
        implicitWait();
    }
    public void hoverOverFashion(){
        implicitWait();
        basicHoverUsingXpath(WEB_ELEMENT_FASHION_LINK);
        implicitWait();
    }
    public void hoverAndClickWatches(){
        implicitWait();
        hoverOverNClickUsingXpath(WEB_ELEMENT_FASHION_LINK,WEB_ELEMENT_HOVER_WATCHES);
        implicitWait();
    }
    public void searchForDiamondRing() throws AWTException {
        basicHoverUsingXpath(WEB_ELEMENT_FASHION_LINK);
        typeOnElement(WEB_ELEMENT_FASHION_SEARCH,WEB_ELEMENT_DIAMOND_RING_SEARCH);
        enterKey();

    }




    }

