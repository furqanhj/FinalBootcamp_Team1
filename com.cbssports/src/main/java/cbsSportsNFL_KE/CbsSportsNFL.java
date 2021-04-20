package cbsSportsNFL_KE;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static cbsSportsNFL_KE.NFLWebElementLocators.*;

public class CbsSportsNFL extends BaseAPI {
    @FindBy(xpath = WEB_ELEMENT_NFL_TEXT_LINK)
    public WebElement nflTextLink;
    @FindBy(xpath = WEB_ELEMENT_TOP_FREE_AGENT_LEFT)
    public WebElement topFreeAgentLeft;
    @FindBy(xpath = WEB_ELEMENT_PLAYER_IMAGE)
    public WebElement validateTopFreeAgent;
    @FindBy(css = WEB_ELEMENT_MEGA_PLAY_BTN)
    public WebElement megaPlayBtn;
    @FindBy(xpath = WEB_ELEMENT_DOT_ICON)
    public WebElement dotIconLink;
    @FindBy(xpath = WEB_ELEMENT_DOT_SECTION)
    public WebElement dotSelection;

    public CbsSportsNFL() {
        PageFactory.initElements(driver, this);
    }

    public void clickNFLTextLink() {
        clickElement(nflTextLink);

    }

    public void clickTopFreeAgentLeft() {
        //clickElement(topFreeAgentLeft);
        topFreeAgentLeft.click();

    }

    public void MegaRadioPlayBtn() {
        clickElement(megaPlayBtn);

    }

    public void hoverOverDotIcon() {
        hoverOverElement(dotIconLink);

    }

    public void totalNumberOfLinksWhileHoverOverDotIcon() {

        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        List<WebElement> links = dotSelection.findElements(By.tagName("a"));
        System.out.println("The number of links is " + links.size());


//        WebElement targetSection=driver1.findElement(By.xpath("//*[@id=\"listPagesModule\"]/section/div[2]/div/div[1]"));
//
//        List<WebElement> targetSectionLists = targetSection.findElements(By.tagName("a"));
//        System.out.println(targetSectionLists.size());
    }
}