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

   public MusicPage(){

       PageFactory.initElements(driver, this);
   }

   public void navigateToMusicPage(){
       buttonMusicLink.click();


   }




}
