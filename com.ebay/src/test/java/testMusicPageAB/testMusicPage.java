package testMusicPageAB;

import common.BaseAPI;
import musicPageAB.MusicPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testMusicPage extends BaseAPI{

    MusicPage musicPage;

    @Test
    public void testTNavigateToMusicPage(){
    musicPage=new MusicPage();
    musicPage.navigateToMusicPage();
    String actualTitle=driver.getTitle();
    String expectedTitle="Music products for sale | eBay";
    Assert.assertEquals(actualTitle,expectedTitle,"Title do not match");

    }


}
