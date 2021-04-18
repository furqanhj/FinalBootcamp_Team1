package bmwM_SeriesAR;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

import static bmwM_SeriesAR.BmwM_SeriesWebElements.*;

public class BmwM_Series extends BaseAPI {

    @FindBy (xpath= WEB_ELEMENT_MODELS_LINK)
    WebElement modelsLink;

    @FindBy (xpath = WEB_ELEMENT_M_MODELS)
    WebElement mModels;

    @FindBy (xpath = WEB_ELEMENT_BMW_M_HEADER )
    WebElement bmwMHeader;

    @FindBy (xpath = WEB_ELEMENT_LIMITED_EDITIONS_EXPLORE_BUTTON )
    WebElement limitedEditionsExploreButton;

    @FindBy (css = WEB_ELEMENT_M3_SEDAN_LEARN_MORE_LINK)
    WebElement m3SedanLearnMoreLink;

    @FindBy (css = WEB_ELEMENT_ALL_MODELS_PAGE_BMW_M_LINK )
    WebElement allModelsPageBmwMLink;

    @FindBy (css = WEB_ELEMENT_M3_IMAGE)
    WebElement m3Image;




    //Initialize all the WebElements on this page, using Page Factory
    public BmwM_Series (){
        PageFactory.initElements(driver, "this");
    }

    //METHODS:


    public void clickMModels() throws InterruptedException {
        explicitWaitUntilClickable(20, WEB_ELEMENT_MODELS_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MODELS_LINK);
        fluentWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_M_MODELS);
        Thread.sleep(5000);
    }
    public void clickLimitedEditionsExploreButton() throws InterruptedException, AWTException {
        clickMModels();
       scrollToElementUsingJavaScript(WEB_ELEMENT_LIMITED_EDITIONS_EXPLORE_BUTTON);
       WebElement element = driver.findElement(By.xpath(WEB_ELEMENT_IFRAME_MODELS));
       iframeHandle(element);

    }

    public void clickM3SedanLearnMoreLink() throws InterruptedException {
        clickMModels();
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_M3_SEDAN_LEARN_MORE_LINK);
    }

    public void clickAllModelsPageBmwMLink(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_MODELS_LINK);
        implicitWait(20);
        driverWait.until(ExpectedConditions.visibilityOf(allModelsPageBmwMLink));
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_ALL_MODELS_PAGE_BMW_M_LINK );
        implicitWait(20);
    }

    public void navigateToM3Page() {
        clickAllModelsPageBmwMLink();
        implicitWait(20);
        m3Image.click();
    }
}
