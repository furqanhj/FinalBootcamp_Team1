package testOnlineExperiencesAB;

import common.BaseAPI;
import onlineExperiencesPageAB.OnlineExperiencesPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnlineExperiencesPage extends BaseAPI {

    OnlineExperiencesPage onlineExperiencesPage;

    @Test
    public void testNavigateToOnlineExperiencesPage() throws InterruptedException {

        onlineExperiencesPage= new OnlineExperiencesPage();
        onlineExperiencesPage.navigateToOnlineExperiencePage();
        WebDriverWait wait= new WebDriverWait(driver, 10);
        String actualTitle=driver.getTitle();
        String expectedTitle="Online Experiences";
        Thread.sleep(1000);
        Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");

    }


}
