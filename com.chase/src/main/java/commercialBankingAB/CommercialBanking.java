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

    public CommercialBanking(){
        PageFactory.initElements(driver, this);

    }

    public void navigateToCommercialBanking(){
       clickElement(scrollOn5thOption);
        clickElement(buttonCommercialBankingLink);


    }
//*****************************************************************


    @FindBy(xpath = WEB_ELEMENT_CLICK_DROP_DOWN)
    WebElement dropDownMenu;

    @FindBy(xpath = WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE)
    WebElement navigateToMortgagePage;

    public void clickDropDownMenu(){clickByXpathUsingJavaScript(WEB_ELEMENT_CLICK_DROP_DOWN);}

    public void clickMortgagePageLink(){clickByXpathUsingJavaScript(WEB_ELEMENT_NAVIGATE_TO_MORTGAGE_PAGE);}

}
