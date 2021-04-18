package chaseOpenAnAccountAR;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static chaseOpenAnAccountAR.ChaseOpenAnAccountWebElements.*;

public class ChaseOpenAnAccount extends BaseAPI {

    @FindBy (css = WEB_ELEMENT_OPEN_AN_ACCT_DROP_DOWN)
    WebElement openAnAcctDropDown;

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

    public void hoverOverOpenAnAcctDropDown(){

    }

    public void clickChckAccountsOption(){

    }



}
