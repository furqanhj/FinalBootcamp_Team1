package truliaHomepageFJ;

import static truliaHomepageFJ.TruliaHomepageLocators.*;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import truliaNeighborhoodsPageFJ.NeighborhoodsPage;

public class TruliaHomepage extends BaseAPI {

    @FindBy (xpath = WEB_ELEMENT_NEIGHBORHOODS_PAGE_LINK)
    public WebElement neighborhoodsPageLink;

    /**
     * Initializing elements required for Assertions
     */
    @FindBy (css = WEB_ELEMENT_ACTUAL_TEXT_ON_NEIGHBORHOODS_PAGE)
    public WebElement actualTextOnNeighborhoodsPage;

    public TruliaHomepage(){
        PageFactory.initElements(driver, this);
    }

    public NeighborhoodsPage navigateToNeighborhoodsPage(){
        clickElement(neighborhoodsPageLink);

        return new NeighborhoodsPage();
    }
}
