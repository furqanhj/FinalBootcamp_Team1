package attHomepageFJ;

import static attHomepageFJ.AttHomepageLocators.*;

import attTVPageFJ.AttTVPage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttHomepage extends BaseAPI {

    @FindBy (css = WEB_ELEMENT_BUTTON_TV_LINK)
    public WebElement buttonTVLink;


    public AttHomepage(){
        PageFactory.initElements(driver, this);
    }

    public AttTVPage navigateToTVLink(){
        clickElement(buttonTVLink);

        return new AttTVPage();
    }
}
