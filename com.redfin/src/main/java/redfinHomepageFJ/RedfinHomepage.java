package redfinHomepageFJ;

import static redfinHomepageFJ.RedfinHomepageWebElements.*;
import common.BaseAPI;
import mortgageCalculatorPageFJ.MortgageCalculatorPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedfinHomepage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_MORTGAGE_DROPDOWN_HOVERABLE_MENU)
    public WebElement mortgageDropdownHoverableMenu;
    @FindBy(xpath = WEB_ELEMENT_PAYMENT_CALCULATOR_BUTTON_UNDER_MORTGAGE)
    public WebElement paymentCalculatorButtonunderMortgageDropdown;

    /**
     * Initialization of elements requried for Assertions
     */
    @FindBy(xpath = WEB_ELEMENT_ACTUAL_TEXT_MORTGAGE_CALCULATOR_PAGE)
    public WebElement actualTextMortgageCalculatorPage;

    public RedfinHomepage(){
        PageFactory.initElements(driver, this);
    }

    public MortgageCalculatorPage navigateToMortgageCalculatorPage(){
        hoverOverElement(mortgageDropdownHoverableMenu);
        clickElement(paymentCalculatorButtonunderMortgageDropdown);

        return new MortgageCalculatorPage();
    }
}
