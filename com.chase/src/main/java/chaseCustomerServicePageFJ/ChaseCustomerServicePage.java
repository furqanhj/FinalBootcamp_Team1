package chaseCustomerServicePageFJ;

import static chaseCustomerServicePageFJ.ChaseCustomerServiceWebElements.*;

import chaseHomepageFJ.ChaseHomepage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.server.PushBuilder;

import java.util.List;

public class ChaseCustomerServicePage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_GET_HELP_WITH_YOUR_ACCOUNT_LINK)
    public WebElement getHelpWithYourAccountLink;

    @FindBy (css = WEB_ELEMENT_FIND_ATM_OR_BRANCH_LINK)
    public WebElement findAtmOrBranchLink;

    @FindBy (xpath = WEB_ELEMENT_DISPUTE_A_CHARGE_LINK)
    public WebElement disputeAChargeLink;

    @FindBy (xpath = WEB_ELEMENT_REPLACE_LOST_DAMAGED_CARD_LINK)
    public WebElement replaceLostOrDamagedCardLink;

    @FindBy (css = WEB_ELEMENT_MAKE_A_PAYMENT_LINK)
    public WebElement makeAPaymentLink;

    @FindBy (xpath = WEB_ELEMENT_RESET_USERNAME_PASSWORD_LINK)
    public WebElement resetUsernameOrPasswordLink;

    /**
     * Initialization of Elements required for Assertions
     */
    @FindBy (css = WEB_ELEMENT_SEARCH_BOX_TO_FIND_NEAREST_ATM)
    public WebElement searchBoxToFindNearestATM;

    @FindBy (css = WEB_ELEMENT_ACTUAL_LINKS_ON_DISPUTE_CHARGE_PAGE)
    public List<WebElement> actualLinksOnDisputeChargePage;

    @FindBy (css = WEB_ELEMENT_ACTUAL_TEXT_ON_MAKE_A_PAYMENT_PAGE)
    public WebElement actualTextOnMakeAPaymentPage;

    @FindBy (id = WEB_ELEMENT_ACTUAL_TEXT_ON_RESET_USERNAME_PSWD_PAGE)
    public WebElement actualTextOnResetUsernamePswdPage;

    public ChaseCustomerServicePage(){
        PageFactory.initElements(driver, this);
    }

    ChaseHomepage homepage = new ChaseHomepage();

    public void clickOnGetHelpWithYourAccountPage(){
        homepage.clickOnCustomerServiceDropdown();
        clickElement(getHelpWithYourAccountLink);
    }

    public void clickOnFindATMOrBranchLink(){
        homepage.clickOnCustomerServiceDropdown();
        clickElement(findAtmOrBranchLink);
    }

    public void clickOnDisputeAChargeLink(){
        homepage.clickOnCustomerServiceDropdown();
        clickElement(disputeAChargeLink);
    }

    public void clickOnReplaceLostOrDamagedCardLink(){
        homepage.clickOnCustomerServiceDropdown();
        clickElement(replaceLostOrDamagedCardLink);
    }

    public void clickOnMakeAPaymentLink(){
        homepage.clickOnCustomerServiceDropdown();
        clickElement(makeAPaymentLink);
    }

    public void clickOnResetUsernamePasswordLink(){
        homepage.clickOnCustomerServiceDropdown();
        clickElement(resetUsernameOrPasswordLink);
    }
}
