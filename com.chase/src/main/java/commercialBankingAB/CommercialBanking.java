package commercialBankingAB;



import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static commercialBankingAB.CommercialBankingWebElement.*;



public class CommercialBanking extends BaseAPI {
    @FindBy (xpath = WEB_ELEMENT_BUTTON_COMMERCIAL_BANKING_LINK)
    WebElement buttonCommercialBankingLink;

    @FindBy (css=WEB_ELEMENT_SCROLL_ON_5TH_OPTION )
    WebElement scrollOn5thOption;

    public void navigateToCommercialBanking(){
        clickElement(scrollOn5thOption);
        clickElement(buttonCommercialBankingLink);
    }
//    **************************************************************************************

    @FindBy (css=WEB_ELEMENT_CHASE_logo )
    public WebElement chaseLogo;

//******************************************************************************************

    public CommercialBanking(){
        PageFactory.initElements(driver, this);

    }

//    public void navigateToCommercialBanking(){
//       clickElement(scrollOn5thOption);
//        clickElement(buttonCommercialBankingLink);
//    }
//*****************************************************************


    @FindBy(css = WEB_ELEMENT_CLICK_DROP_DOWN)
    WebElement dropDownMenu;

    @FindBy(xpath = WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE)
    WebElement navigateToMortgagePage;

    public void clickDropDownMenu(){clickElement(dropDownMenu);}
    public void clickMortgagePageLink(){clickElement(navigateToMortgagePage);}

//    *******************************************************************************

    @FindBy (xpath = WEB_ELEMENT_COMMERCIAL_BANKING_BUTTON_INDUSTRIES_LINK)
    public WebElement commercialBankingIndustriesLink;

    public void navigateToCommercialBankingIndustriesPage(){
        clickElement(commercialBankingIndustriesLink);
    }
    //*************************************************************************************

    @FindBy(xpath = WEB_ELEMENT_COMMERCIAL_BANKING_BUTTON_SOLUTIONS_LINK)
    public WebElement commercialBankingSolutionsLink;

    public void navigateToCommercialBankingSolutionsPage(){
        clickElement(commercialBankingSolutionsLink);
    }


    //******************************************************************************************

    @FindBy(xpath = WEB_ELEMENT_COMMERCIAL_BANKING_BUTTON_INSIGHTS_LINK)
    public WebElement commercialBankingInsightsLink;

    public void navigateToCommercialBankingInsightsPage(){

        clickElement(commercialBankingInsightsLink);
    }
    //******************************************************************************************

    @FindBy(xpath =WEB_ELEMENT_COMMERCIAL_BANKING_BUTTON_CLIENTS_STORIES_LINK )
    public WebElement commercialBankingClientsStoriesLink;

    public void navigateToCommercialBankingClientsStoriesPage(){
        clickElement(commercialBankingClientsStoriesLink);
    }
    //********************************************************************************
    @FindBy(css=WEB_ELEMENT_COMMERCIAL_BANKING_BUTTON_CONTACT_US_LINK)
    public WebElement commercialBankingContactUsLink;

    public void navigateToCommercialBankingContactUsPage(){
        clickElement(commercialBankingContactUsLink);
    }
    //********************************************************************************************

    @FindBy(xpath = WEB_ELEMENT_COMMERCIAL_BANKING_BUTTON_lOGIN_LINK)
    public WebElement commercialBankingLogin;
    @FindBy(xpath =WEB_ELEMENT_COMMERCIAL_BANKING_BUTTON_CHASE_CONNECT_LINK)
    public WebElement commercialBankingChaseConnect;

    public void navigateToCommercialBankingLoginPage(){
        clickElement(commercialBankingLogin);}
    public void navigateToCommercialBankingChaseConnectPage(){
        clickElement(commercialBankingChaseConnect);
    }

}
