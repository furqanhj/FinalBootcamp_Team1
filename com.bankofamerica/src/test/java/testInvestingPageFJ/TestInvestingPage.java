package testInvestingPageFJ;

import common.BaseAPI;
import investingPageFJ.InvestingPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

// Total Test Cases = 6
public class TestInvestingPage extends BaseAPI {

    InvestingPage investingPage;

    @Test (priority = 1, enabled = true)
    public void testNavigateToInvestingPage(){
        investingPage = new InvestingPage();
        investingPage.navigateToInvestingPage();

        String actualText = getTextFromElement(investingPage.actualTextOnLandedInvestingPage);
        String expectedText = "Ways to Invest with Merrill";
        Assert.assertTrue(compareStrings(actualText.toLowerCase(), expectedText.toLowerCase()));
        System.out.println("TEST PASSED ! - Expected Text Found on Landed Page");
    }

    @Test (priority = 2, enabled = true)
    public void testNumberOfLinksOnInvestingPageHeader(){
        investingPage = new InvestingPage();
        investingPage.navigateToInvestingPage();

        List<WebElement> actualNumOfLinks = investingPage.actualNumOfLinksOnInvestingPageHeader;

        int actualNumberOfLinks = actualNumOfLinks.size();
        int expectedNumberOfLinks = 6;

        Assert.assertEquals(actualNumberOfLinks, expectedNumberOfLinks, "NUMBERS OF LINK DO NOT MATCH");
        System.out.println("TEST PASSED! - There were " + 6 + " links on the header");
    }

    @Test (priority = 3, enabled = true)
    public void testClickOnOpenAnAccountButton(){
        investingPage = new InvestingPage();
        investingPage.clickOnOpenAnAccountButton();

        String actualText = getTextFromElement(investingPage.actualTextOnOpenAnAccountPage);
        String expectedText = "Open an account";

        Assert.assertTrue(compareStrings(actualText.toLowerCase(), expectedText.toLowerCase()));
//        Assert.assertEquals(actualText, expectedText, "TEXT DOES NOT MATCH");
        System.out.println("TEST PASSED! - Text found on landed page");
    }

    @Test (priority = 4, enabled = true)
    public void testClickOnInvestingAndTradingLink(){
        investingPage = new InvestingPage();
        investingPage.clickOnInvestingAndTradingPageLink();

        String actualText = getTextFromElement(investingPage.actualTextOnInvestingAndTradingPage);
        String expectedText = "Personal Investing and Trading";

        Assert.assertTrue(compareStrings(actualText.toLowerCase(), expectedText.toLowerCase()));
        System.out.println("TEST PASSED!- Text found on landed page");
    }

    @Test (priority = 5, enabled = true)
    public void testClickOnGuidanceAndRetirementLink(){
        investingPage = new InvestingPage();
        investingPage.clickOnGuidanceAndRetirementPageLink();

        Assert.assertTrue(isElementDisplayed(investingPage.visitRetirementPlanningButton));
        System.out.println("TEST PASSED!- Required element was found on the landed page");
    }

    @Test (priority = 6, enabled = true)
    public void testResponsesForOpenAnAccountPageUsingAllFirstOptions(){
        investingPage = new InvestingPage();
        investingPage.responsesForOpenAnAccountPageWithAllFirstOptions();

        String actualText = getTextFromElement(investingPage.actualTextOnResponsesOpenAnAccountPage);
        String expectedText = "Individual brokerage account";

        Assert.assertTrue(compareStrings(actualText.toLowerCase(), expectedText.toLowerCase()));
        System.out.println("TEST PASSED!- Text found on landed page");
    }
}
