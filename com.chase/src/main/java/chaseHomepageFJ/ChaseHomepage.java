package chaseHomepageFJ;

import static chaseHomepageFJ.ChaseHomepageWebElements.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChaseHomepage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_CUSTOMER_SERVICE_DROPDOWN)
    public WebElement customerServiceDropdown;

    @FindBy (xpath = WEB_ELEMENT_ACTUAL_NUM_OF_ELEMENTS_CUST_SERVICE_DROPDOWN)
    public List<WebElement> actualNumOfLinksInCustServiceDropdown;

    public ChaseHomepage(){
        PageFactory.initElements(driver, this);
    }

    public void clickOnCustomerServiceDropdown(){
        clickElement(customerServiceDropdown);
    }
}
