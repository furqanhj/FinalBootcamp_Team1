package investingPageFJ;

import static investingPageFJ.InvestingPageLocators.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InvestingPage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_INVESTING_HEADER)
    public WebElement investingHeader;

    @FindBy (id = WEB_ELEMENT_GET_STARTED_BUTTON)
    public WebElement getStartedButton;

    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_LANDED_INVESTING_PAGE)
    public WebElement actualTextOnLandedInvestingPage;

    @FindBy (xpath = WEB_ELEMENT_ACTUAL_NUM_OF_LINKS_ON_HEADER_INVESTING_PAGE)
    public List<WebElement> actualNumOfLinksOnInvestingPageHeader;

    @FindBy (css = WEB_ELEMENT_OPEN_AN_ACCOUNT_BUTTON)
    public WebElement openAnAccountButton;

    @FindBy (xpath = WEB_ELEMENT_ACTUAL_TEXT_ON_LANDED_OPEN_AN_ACCOUNT_PAGE)
    public WebElement actualTextOnOpenAnAccountPage;

    @FindBy (id = WEB_ELEMENT_INVESTING_AND_TRADING_LINK_BUTTON)
    public WebElement investingAndTradingLinkButton;

    @FindBy (css = WEB_ELEMENT_ACTUAL_TEXT_ON_INVESTING_AND_TRADING_PAGE)
    public WebElement actualTextOnInvestingAndTradingPage;

    @FindBy (id = WEB_ELEMENT_GUIDANCE_AND_RETIREMENT_LINK_BUTTON)
    public WebElement guidanceAndRetirementLinkButton;

    @FindBy (css = WEB_ELEMENT_VISIT_RETIREMENT_PLANNING_BUTTON_ON_GUIDANCE_PAGE)
    public WebElement visitRetirementPlanningButton;

    @FindBy (css = WEB_ELEMENT_HELP_ME_GET_STARTED_LINK)
    public WebElement helpMeGetStartedLink;

    @FindBy (css = WEB_ELEMENT_GENERAL_INVESTING_LINK)
    public WebElement generalInvestingLink;

    @FindBy (css = WEB_ELEMENT_ILL_SELECT_MY_OWN_OPTIONS_LINK)
    public WebElement illSelectMyOwnOptionsLink;

    @FindBy (css = WEB_ELEMENT_JUST_ME_LINK)
    public WebElement justMeLink;

    @FindBy (css = WEB_ELEMENT_ACTUAL_TEXT_ON_RESPONSES_OPEN_AN_ACCOUNT_PAGE)
    public WebElement actualTextOnResponsesOpenAnAccountPage;

    public InvestingPage(){
        PageFactory.initElements(driver, this);
    }

    public void navigateToInvestingPage(){
        clickElement(investingHeader);
        clickElement(getStartedButton);
    }

    public void clickOnOpenAnAccountButton(){
        navigateToInvestingPage();
        clickElement(openAnAccountButton);
    }

    public void clickOnInvestingAndTradingPageLink(){
        navigateToInvestingPage();
        clickElement(investingAndTradingLinkButton);
    }

    public void clickOnGuidanceAndRetirementPageLink(){
        navigateToInvestingPage();
        clickElement(guidanceAndRetirementLinkButton);
    }

    public void responsesForOpenAnAccountPageWithAllFirstOptions(){
//        navigateToInvestingPage();
        clickOnOpenAnAccountButton();
        clickElement(helpMeGetStartedLink);
        clickElement(generalInvestingLink);
        clickElement(illSelectMyOwnOptionsLink);
        clickElement(justMeLink);
    }
}
