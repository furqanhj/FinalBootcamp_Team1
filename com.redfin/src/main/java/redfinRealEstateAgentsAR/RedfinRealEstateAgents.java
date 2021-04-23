package redfinRealEstateAgentsAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static redfinRealEstateAgentsAR.RedfinRealEstateAgentsWebElements.*;

public class RedfinRealEstateAgents extends BaseAPI {


    @FindBy (css = WEB_ELEMENT_SEARCH_BOX)
    WebElement searchBox;

    @FindBy (xpath = WEB_ELEMENT_FIND_REDFIN_AGENT_HEADER)
    public WebElement redfinAgentHeader    ;

    public RedfinRealEstateAgents() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToRealEstateAgentsPage(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_REAL_ESTATE_AGENTS_LINK);
        implicitWait(20);
    }
    public void clickLearnMoreButton(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_REAL_ESTATE_AGENTS_LINK);
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_LEARN_MORE_BUTTON);
        implicitWait(20);
    }
    public void verifyFindRedfinAgentHeader(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_REAL_ESTATE_AGENTS_LINK);
        implicitWait(20);
    }
    public void clickTalkToARedfinAgentButton(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_REAL_ESTATE_AGENTS_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_TALK_TO_AGENT_BUTTON);
        implicitWait(20);
    }

    public void typeInAgentSearchBox() throws InterruptedException {
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_REAL_ESTATE_AGENTS_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_BOX);
        typeOnElement(WEB_ELEMENT_SEARCH_BOX, WEB_ELEMENT_INPUT_SEARCH_BOX);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_SEARCH_BUTTON);
        implicitWait(20);
    }
}
