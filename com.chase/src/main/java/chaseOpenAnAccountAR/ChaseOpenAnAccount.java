package chaseOpenAnAccountAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static chaseOpenAnAccountAR.ChaseOpenAnAccountWebElements.*;

public class ChaseOpenAnAccount extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_OPEN_AN_ACCT_DROP_DOWN)
    public WebElement openAnAcctDropDown;

    @FindBy (css = WEB_ELEMENT_CHCK_ACCT_DROP_DOWN_OPTION)
    WebElement chkAcctDropDownOption;

    @FindBy (xpath = WEB_ELEMENT_CHASE_CHCK_ACCT_HEADER)
    WebElement chaseChckAcctHeader;

    @FindBy (xpath = WEB_ELEMENT_COMPARE_ACCTS_HEADER)
    WebElement compareAcctsHeader;

    @FindBy (xpath = WEB_ELEMENT_KIDS_STUDENTS_TOGGLE_BUTTON)
    WebElement kidsStudentsToggleButton;

    @FindBy (xpath = WEB_ELEMENT_CHASE_COLLEGE_CHECKING_HEADER)
    WebElement chaseCollegeChckHeader;

    @FindBy (xpath = WEB_ELEMENT_COLLEGE_CHCK_ACCT_OPEN_NOW_BUTTON)
    WebElement collegeChckAcctOpenNowButton;

    //initialize all the web elements on this page using Page Factory
    public ChaseOpenAnAccount (){
        PageFactory.initElements(driver, "this");
    }

    //METHODS:

    public void hoverOpenAnAccount(){
    implicitWait(20);
    basicHoverUsingXpath(WEB_ELEMENT_OPEN_AN_ACCT_DROP_DOWN);
    implicitWait(20);
    }

    public void verifyChckAccountsPageHeader(){
        implicitWait(20);
        hoverOverNClickUsingXpath(WEB_ELEMENT_OPEN_AN_ACCT_DROP_DOWN, WEB_ELEMENT_CHCK_ACCT_DROP_DOWN_OPTION);
        implicitWait(20);

    }
    public void verifyChckAccountsCompareAccountsHeader() {
        implicitWait(20);
        hoverOverNClickUsingXpath(WEB_ELEMENT_OPEN_AN_ACCT_DROP_DOWN, WEB_ELEMENT_CHCK_ACCT_DROP_DOWN_OPTION);
        implicitWait(20);
    }
    public void clickCollegeCheckingOpenNowButton(){
        implicitWait(20);
        hoverOverElement(openAnAcctDropDown);
        implicitWait(20);
        hoverOverElement(chkAcctDropDownOption);
        implicitWait(20);
        //hoverOverNClickUsingXpath(WEB_ELEMENT_OPEN_AN_ACCT_DROP_DOWN, WEB_ELEMENT_CHCK_ACCT_DROP_DOWN_OPTION);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_COLLEGE_CHCK_ACCT_OPEN_NOW_BUTTON);

    }

    public void clickOpenAnAccountButton(){
        implicitWait(20);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_OPEN_AN_ACCOUNT_BUTTON);
        implicitWait(20);

    }
}
