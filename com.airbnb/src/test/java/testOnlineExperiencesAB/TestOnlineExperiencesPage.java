package testOnlineExperiencesAB;

import common.BaseAPI;
import onlineExperiencesPageAB.OnlineExperiencesPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOnlineExperiencesPage extends BaseAPI {

    OnlineExperiencesPage onlineExperiencesPage;

    @Test(priority = 1,enabled = false)
    public void testNavigateToOnlineExperiencesPage() throws InterruptedException {

        onlineExperiencesPage= new OnlineExperiencesPage();
        onlineExperiencesPage.navigateToOnlineExperiencePage();
        WebDriverWait wait= new WebDriverWait(driver, 10);
        String actualTitle=driver.getTitle();
        String expectedTitle="Online Experiences";
        Thread.sleep(1000);
        Assert.assertEquals(actualTitle, expectedTitle, "Title do not match");

    }





    @Test(priority = 2, enabled = false)
    public void testDoSearch() throws InterruptedException {
        onlineExperiencesPage = new OnlineExperiencesPage();

        onlineExperiencesPage.doSearch();
        String actualTitle = BaseAPI.driver.getTitle();

        String expectedTitle = "Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }

    @Test(priority = 3, enabled = true)
    public void testSignUp() {
        onlineExperiencesPage = new OnlineExperiencesPage();

        onlineExperiencesPage.doToggleClick();

        String actualText = driver.getTitle();

        String expectedText = "Vacation Rentals, Homes, Hotels, Experiences & More - Airbnb";

        Assert.assertEquals(actualText, expectedText, "Test not found");

    }




}
