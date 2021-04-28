package testAboutUSContactUsPageKE;

import aboutUsContactUsPageKE.ContactUsPage;
import bankOfAmericaAboutUsKE.AboutUsPage;
import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContactUsPage extends BaseAPI {

    ContactUsPage ContactUsPage;
    AboutUsPage AboutUsPage;
    public ContactUsPage contactUsPage;

    @Test(priority = 7, enabled = false)
    //Click on Contact us TextLink to open Contact us page
    public void testClickContactUsLinkText() {

        //TestContactUsPage= new TestContactUsPage();
        AboutUsPage = new AboutUsPage();
        AboutUsPage.clickAboutUsMenu();
        ContactUsPage = new ContactUsPage();
        ContactUsPage.clickContactUsTextLink();
    }

    //Search bar on Contact us Page
    @Test(priority = 8, enabled = false)
    public void testClickInSearchBar() {
        //AboutUsPage = new AboutUsPage();
        testClickContactUsLinkText();
        ContactUsPage.clickInSearchBar();

        String actualHeadlineText = driver.getTitle();
        String expectedHeadlineText = "Bank of America Customer Service & Contact Numbers";
        System.out.println(actualHeadlineText);
        Assert.assertEquals(actualHeadlineText, expectedHeadlineText, "Text Not Matching");


    }

    //Click search module Link "billing dispute"
    @Test(priority = 9, enabled = false)
    public void testClickBillingDisputeTextLink() throws InterruptedException {
        //  ContactUsPage= new ContactUsPage();

        testClickInSearchBar();
        Thread.sleep(2000);
        ContactUsPage.clickBillingDisputeTextLink();
        //String actualHeadlineText= contactUsPage.billingResultTab.getText();
//        String actualHeadlineText = driver.findElement(By.xpath("//*[@id='searchStub']/div/div/div/div/div[5]/p[1])")).getText();
//        String expectedHeadlineText ="results for: billing dispute";
        //  System.out.println(actualHeadlineText);
        // Assert.assertEquals(actualHeadlineText, expectedHeadlineText,"Text Not Matching");


    }

    // Click Dispute debit card charge online Button
    @Test(priority = 10, enabled = false)
    public void testClickDisputeDebitCardButton() throws InterruptedException {
        testClickBillingDisputeTextLink();
        implicitWait();
        ContactUsPage.clickDisputeDebitCardButton();

        Assert.assertTrue(ContactUsPage.phoneImage.isDisplayed());


    }

    // Send a Text "save" In SearchBar
    @Test(priority = 11, enabled = false)
    public void testEnterTextInSearchBar() {

        testClickInSearchBar();

        ContactUsPage.enterTextInSearchBar("save");
        System.out.println("pass");

//        String actualHeadlineText= contactUsPage.searchModuleSuggestionSave.getText();
//        // String actualHeadlineText = driver.findElement(By.xpath("//*[@id='searchStub']/div/div/div/div/div[5]/p[1])")).getText();
//        String expectedHeadlineText ="save password";
//        System.out.println(actualHeadlineText);
//        Assert.assertEquals(actualHeadlineText, expectedHeadlineText,"Text Not Matching");


    }

    // Click on Arrow Menu Button
    @Test(priority = 12, enabled = false)
    public void testClickArrowMenuBtn() {

        testClickContactUsLinkText();
        ContactUsPage.clickArrowMenuBtn();

    }

    @Test(priority = 13, enabled = false)
    public void testCountingLinksInContactUsSection() {
        testClickContactUsLinkText();
        ContactUsPage.countingLinksInContactUsSection();


        // Assert.assertTrue(ContactUsPage.contactUSLinkVerifying.isEnabled());


    }

    @Test(priority = 14, enabled = true)
    public void testClickFacebookMessengerLink() {
        testClickInSearchBar();
        ContactUsPage.clickFacebookMessengerLink();
        Assert.assertTrue(ContactUsPage.popUpMessage.getText().contains("You're continuing to another website"));
        System.out.println(ContactUsPage.popUpMessage.getText());


    }

    @Test(priority = 15, enabled = true)
    public void testClickContinueBtn() throws InterruptedException {
        testClickFacebookMessengerLink();
        ContactUsPage.clickContinueBtn();
        switchToNewWindow();
        Thread.sleep(2000);

        String actualHeadlineText = driver.getCurrentUrl();
        String expectedHeadlineText = "https://www.facebook.com/BankofAmerica";
        System.out.println(actualHeadlineText);
        Assert.assertEquals(actualHeadlineText, expectedHeadlineText, "Text Not Matching");


    }


//    @Test
//    public void testNamesOfCategoriesDropdownOptionsSoft() throws Exception {
//        testClickArrowMenuBtn();
//         contactUsPage = new ContactUsPage();
//
//        String sheetPath = System.getProperty("C:\\Users\\USER\\IdeaProjects\\FinalBootcamp_Team1\\com.bankofamerica\\src\\test\\resources\\testData\\EbayTestData.xlsx");
//
//        String[] expectedResults = dataReader.fileReaderStringXSSF(sheetPath, "contactUsPages");
//        System.out.println("pass");
//        List<WebElement> elements = contactUsPage.expectedTextLinkCategoryArrowMenu;
//
//        SoftAssert softAssert = new SoftAssert();
//
//        for (int i = 0; i < elements.size(); i++) {
//            System.out.println("EXPECTED: " + expectedResults[i]);
//            System.out.println("ACTUAL: " + getTextFromElement(elements.get(i)));
//            System.out.println();
//
//            softAssert.assertEquals(getTextFromElement(elements.get(i)), expectedResults[i], "ELEMENT " + i + " DOES NOT MATCH");
//        }
//
//        softAssert.assertAll();
//    }
//

//    @Test (enabled = true)
//    public void testNamesOfCategoriesDropdownOptionsSoft() throws Exception {
//
//        ContactUsPage contactUsPage;
//        contactUsPage = new ContactUsPage();
//        testClickContactUsLinkText();
//        contactUsPage.windowsHandles();
//
//
//        String sheetPath = System.getProperty("C:\\Users\\USER\\IdeaProjects\\FinalBootcamp_Team1\\com.bankofamerica\\src\\test\\resources\\testData\\EbayTestData.xlsx");
//
//        String[] expectedResults = dataReader.fileReaderStringXSSF(sheetPath, "Categories");
//        List<WebElement> elements = contactUsPage.expectedTextLinkCategoryArrowMenu;
//        System.out.println("pass");
//
//        SoftAssert softAssert = new SoftAssert();
//
//        for (int i = 0; i < elements.size(); i++) {
//            System.out.println("EXPECTED: " + expectedResults[i]);
//            System.out.println("ACTUAL: " + getTextFromElement(elements.get(i)));
//            System.out.println();
//
//            softAssert.assertEquals(getTextFromElement(elements.get(i)), expectedResults[i], "ELEMENT " + i + " DOES NOT MATCH");
//        }
}

