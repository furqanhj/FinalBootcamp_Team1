package musicPageAB;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import static musicPageAB.MusicPageWebElements.*;

public class MusicPage extends BaseAPI {

   @FindBy (xpath = WEB_ELEMENT_BUTTON_MUSIC_LINK)
    WebElement buttonMusicLink;

   @FindBy(xpath = WEB_ELEMENT_MUSIC_BANNER)
    public WebElement MusicBanner;

    @FindBy(xpath = WEB_ELEMENT_VINYL_RECORDS_IMAGE)
    public WebElement vinylRecordsImage;

    @FindBy(xpath =WEB_ELEMENT_MUSIC_PAGE_NAVIGATION_STAT)
    public WebElement musicPageNavigationStat;

    @FindBy(xpath = WEB_ELEMENT_BUTTON_MUSIC_CD_CATEGORY)
    public WebElement buttonMusic_cd_category;

    @FindBy(xpath = WEB_ELEMENT_OPTION_FOLK_CATEGORY_LINK)
    public WebElement optionFolkCategoryLink;

    @FindBy(xpath = WEB_ELEMENT_BANNER_TITLE_FOLK_MUSIC_CD_PAGE)
    public WebElement bannerTitleFolkMusicCdPage;

    public MusicPage(){
       PageFactory.initElements(driver, this);
   }

   public void navigateToMusicPage(){
       buttonMusicLink.click();
   }

   public void navigateToMusicCategory(){
       buttonMusic_cd_category.click();
   }
    public void navigateToFolkCdPage(){
        optionFolkCategoryLink.click();
    }





}
