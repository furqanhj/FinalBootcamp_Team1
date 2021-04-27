package testCommercialBankingAB;

import commercialBankingAB.CommercialBanking;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCommercialBanking extends BaseAPI {

    CommercialBanking commercialBanking;

    @Test(priority = 1,enabled = false)
    public void testNavigateToCommercialBanking(){
        commercialBanking=new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        String actualTitle=driver.getTitle();
        String expectedTitle="Commercial Banking | JPMorgan Chase";
        Assert.assertEquals(actualTitle,expectedTitle,"Title Do not Match");
        System.out.println(actualTitle);

    }

    @Test(priority = 2,  enabled = false)
    public void testNavigationToMortgagePage() throws InterruptedException {

        commercialBanking = new CommercialBanking();

        commercialBanking.clickDropDownMenu();
        Thread.sleep(4000);
        commercialBanking.clickMortgagePageLink();
        Thread.sleep(4000);

        String actualTitle=driver.getTitle();
        String expectedTitle = "Chase Mortgage | Home Lending | Chase.com";

        Assert.assertEquals(actualTitle, expectedTitle, "TITLE DOES NOT MATCH");
    }


    @Test(priority = 3,  enabled = false)
    public void testDisplayChaseLogo() throws InterruptedException {

        commercialBanking = new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        Thread.sleep(4000);
        boolean logoPresent=commercialBanking.chaseLogo.isDisplayed();

        Assert.assertTrue(logoPresent);
    }

    @Test(priority = 4,  enabled = false)
    public void testCommercialPageUrl() throws InterruptedException {

        commercialBanking = new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        Thread.sleep(4000);

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.jpmorgan.com/commercial-banking";

        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl, "URL does not match");
    }


    @Test(priority = 5,  enabled = false)
    public void testCommercialPageIndustriesUrl() throws InterruptedException {

        commercialBanking = new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        Thread.sleep(4000);
        commercialBanking.navigateToCommercialBankingIndustriesPage();

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.jpmorgan.com/commercial-banking/industries";

        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl, "URL does not match");
    }

    @Test(priority = 6,  enabled = false)
    public void testCommercialPageSolutionsURl() throws InterruptedException {

        commercialBanking = new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        Thread.sleep(4000);
        commercialBanking.navigateToCommercialBankingSolutionsPage();

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.jpmorgan.com/commercial-banking";

        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl, "URL does not match");
    }
    @Test(priority = 7,  enabled = false)
    public void testCommercialPageInsightsURl() throws InterruptedException {

        commercialBanking = new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        Thread.sleep(4000);
        commercialBanking.navigateToCommercialBankingInsightsPage();

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.jpmorgan.com/commercial-banking/insights";

        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl, "URL does not match");
    }

    @Test(priority = 8,  enabled = false)
    public void testCommercialPageClientStoriesURl() throws InterruptedException {

        commercialBanking = new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        Thread.sleep(4000);
        commercialBanking.navigateToCommercialBankingClientsStoriesPage();

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.jpmorgan.com/commercial-banking/client-stories";

        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl, "URL does not match");
    }


    @Test(priority = 9,  enabled = false)
    public void testCommercialPagecontactUURl() throws InterruptedException {

        commercialBanking = new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        Thread.sleep(4000);
        commercialBanking.navigateToCommercialBankingContactUsPage();

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.jpmorgan.com/commercial-banking/contact-us";

        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl, "URL does not match");
    }


    @Test(priority = 10,  enabled = true)
    public void testCommercialPageChaseConnectURl() throws InterruptedException {

        commercialBanking = new CommercialBanking();
        commercialBanking.navigateToCommercialBanking();
        Thread.sleep(4000);
        commercialBanking.navigateToCommercialBankingLoginPage();
        Thread.sleep(3000);
        commercialBanking.navigateToCommercialBankingChaseConnectPage();
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.chase.com/commercial-banking/chase-connect";

        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expectedUrl, "URL does not match");
    }

}
