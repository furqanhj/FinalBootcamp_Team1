package testVerizonHomepageFJ;

import common.BaseAPI;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.DataReader;
import verizonHomepageFJ.VerizonHomepage;

import java.io.IOException;
import java.util.List;

public class TestVerizonHomepage extends BaseAPI {

//    XSSFReader reader;
//    DataReader dataReader;
    VerizonHomepage homepage;

    //TestCase#1: Validate number of links on Homepage Header1 (4 links)
    @Test(priority = 1, enabled = false)
    public void testValidateNumOfLinksOnHeaderOne(){
        homepage = new VerizonHomepage();

        int actualNumOfLinks = homepage.actualNumOfLinksOnHeaderOne.size();
        int expectedNumOfLinks = 4;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
    }

    //TestCase#2: Validate number of links on Homepage Header2 (4 links)
    @Test(priority = 2, enabled = false)
    public void testValidateNumOfLinksOnHeaderTwo(){
        homepage = new VerizonHomepage();

        int actualNumOfLinks = homepage.actualNumOfLinksOnHeaderTwo.size();
        int expectedNumOfLinks = 3;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
    }

    //TestCase#3: Validate navigate to SignIn page via element present on landed page
    @Test(priority = 3, enabled = false)
    public void testValidateNavigateToSignInPage(){
        homepage = new VerizonHomepage();
        homepage.navigateToSignInPage();

        Assert.assertTrue(isElementDisplayed(homepage.userIdFieldOnSignInPage));
    }

    //TestCase#4: Validate scrolling options in Mobile Tab
    @Test(priority = 4, enabled = false)
    public void testScrollThroughTheMobileOptionsInTab() throws InterruptedException {
        homepage = new VerizonHomepage();
        homepage.scrollThroughTheMobileOptionsInTab();

        String actualAttributeValue = getAttributeFromElement(homepage.toValidateElementAfterNumOfClicks, "tabindex");
        String initialAttributeValue = "0";

        Assert.assertFalse(compareStrings(actualAttributeValue, initialAttributeValue));
    }

    //TestCase#5: Validate number of elements in Shop dropdown on header two (7 links)
    @Test(priority = 5, enabled = false)
    public void testValidateNumOfLinksInShopDropdown(){
        homepage = new VerizonHomepage();
        homepage.clickOnShopDropdownOnHeaderTwo();

        int actualNumOfLinks = homepage.actualNumOfLinksInShopDropdown.size();
        int expectedNumOfLinks = 7;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF LINKS = " + expectedNumOfLinks);
    }

    //TestCase#6: Validate number of elements in Why Verizon dropdown on header two (4 links)
    @Test(priority = 6, enabled = false)
    public void testValidateNumOfLinksInWhyVerizonDropdown(){
        homepage = new VerizonHomepage();
        homepage.clickWhyVerizonDropdownOnHeaderTwo();

        int actualNumOfLinks = homepage.actualNumOfLinksInWhyVerizonDropdown.size();
        int expectedNumOfLinks = 4;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF LINKS = " + expectedNumOfLinks);
    }

    //TestCase#7: Validate number of elements in Support dropdown on header two (5 links)
    @Test(priority = 7, enabled = false)
    public void testValidateNumOfLinksInSupportDropdown(){
        homepage = new VerizonHomepage();
        homepage.clickSupportDropdownOnHeaderTwo();

        int actualNumOfLinks = homepage.actualNumOfLinksInSupportDropdown.size();
        int expectedNumOfLinks = 5;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF LINKS = " + expectedNumOfLinks);
    }

    //TestCase#8: Validate number of main menus in footer of homepage (8 menus)
    @Test(priority = 8, enabled = false)
    public void testNumOfMenusInFooterOneHomepage(){
        homepage = new VerizonHomepage();
        homepage.scrollToBottomOfVerizonHomepage();

        int actualNumOfLinks = homepage.actualNumberOfMenusOnFooterOne.size();
        int expectedNumOfLinks = 8;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUMBER OF MENU OPTIONS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF MENU OPTIONS = " + expectedNumOfLinks);
    }

    //TestCase#9: Validate number of options in Shop Menu in footer one via Excel Reader via soft assert
    @Test(priority = 9, enabled = false)
    public void testValidateSubMenuItemsInShopMenuOnFooterOneViaExcelReaderSoftAssert() throws IOException {
        dataReader = new DataReader();
        homepage = new VerizonHomepage();

        String contentRootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + contentRootPath;

        String[] expectedResult = dataReader.fileReaderStringXSSF(sheetPath, "Shop");
        List<WebElement> actualElement = homepage.actualTextsSubMenuItemsUnderShopMenuFooterOne;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < actualElement.size(); i++) {
            System.out.println("EXPECTED: " + expectedResult[i]);
            System.out.println("ACTUAL: " + getTextFromElement(actualElement.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(actualElement.get(i)),
                    expectedResult[i], "ELEMENT " + i + " DO NOT MATCH");
        }
        softAssert.assertAll();
    }

    //TestCase#10: Validate number of options in Top Device Brand Menu in footer one via Excel Reader via soft assert
    @Test(priority = 10, enabled = false)
    public void testValidateSubMenuItemsInTopDeviceBrandMenuOnFooterOneViaExcelReaderSoftAssert() throws IOException {
        dataReader = new DataReader();
        homepage = new VerizonHomepage();

        String contentRootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + contentRootPath;

        String[] expectedResult = dataReader.fileReaderStringXSSF(sheetPath, "TopDeviceBrands");
        List<WebElement> actualElement = homepage.actualTextsSubMenuItemsInTopDeviceBrandsMenuFooterOne;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < actualElement.size(); i++) {
            System.out.println("EXPECTED: " + expectedResult[i]);
            System.out.println("ACTUAL: " + getTextFromElement(actualElement.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(actualElement.get(i)),
                    expectedResult[i], "ELEMENT " + i + " DO NOT MATCH");
        }
        softAssert.assertAll();
    }

    //TestCase11: Validate number of options in Support Menu in footer one via Excel Reader via soft assert
    @Test(priority = 11, enabled = false)
    public void testValidateSubMenuItemsInSupportMenuOnFooterOneViaExcelReaderSoftAssert() throws IOException {
        dataReader = new DataReader();
        homepage = new VerizonHomepage();

        String contentRootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + contentRootPath;

        String[] expectedResult = dataReader.fileReaderStringXSSF(sheetPath, "Support");
        List<WebElement> actualElement = homepage.actualTextsSubMenuItemsInSupportMenuFooterOne;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < actualElement.size(); i++) {
            System.out.println("EXPECTED: " + expectedResult[i]);
            System.out.println("ACTUAL: " + getTextFromElement(actualElement.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(actualElement.get(i)),
                    expectedResult[i], "ELEMENT " + i + " DO NOT MATCH");
        }
        softAssert.assertAll();
    }

    //TestCase#12: Validate number of options in About Verizon Menu in footer one via Excel Reader via soft assert
    @Test(priority = 12, enabled = false)
    public void testValidateSubMenuItemsInAboutVerizonMenuOnFooterOneViaExcelReaderSoftAssert() throws IOException {
        dataReader = new DataReader();
        homepage = new VerizonHomepage();

        String contentRootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + contentRootPath;

        String[] expectedResult = dataReader.fileReaderStringXSSF(sheetPath, "AboutVerizon");
        List<WebElement> actualElement = homepage.actualTextsSubMenuItemsInAboutVerizonMenuFooterOne;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < actualElement.size(); i++) {
            System.out.println("EXPECTED: " + expectedResult[i]);
            System.out.println("ACTUAL: " + getTextFromElement(actualElement.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(actualElement.get(i)),
                    expectedResult[i], "ELEMENT " + i + " DO NOT MATCH");
        }
        softAssert.assertAll();
    }

    //TestCase#13: Validate number of options in Most Popular Menu in footer one via Excel Reader via soft assert
    @Test(priority = 13, enabled = false)
    public void testValidateSubMenuItemsInMostPopularMenuOnFooterOneViaExcelReaderSoftAssert() throws IOException {
        dataReader = new DataReader();
        homepage = new VerizonHomepage();

        String contentRootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + contentRootPath;

        String[] expectedResult = dataReader.fileReaderStringXSSF(sheetPath, "MostPopular");
        List<WebElement> actualElement = homepage.actualTextsSubMenuItemsInMostPopularMenuFooterOne;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < actualElement.size(); i++) {
            System.out.println("EXPECTED: " + expectedResult[i]);
            System.out.println("ACTUAL: " + getTextFromElement(actualElement.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(actualElement.get(i)),
                    expectedResult[i], "ELEMENT " + i + " DO NOT MATCH");
        }
        softAssert.assertAll();
    }

    //TestCase#14: Validate number of options in Top Accessory Brands Menu in footer one via Excel Reader via soft assert
    @Test(priority = 14, enabled = false)
    public void testValidateSubMenuItemsInTopAccessoryBrandsMenuOnFooterOneViaExcelReaderSoftAssert() throws IOException {
        dataReader = new DataReader();
        homepage = new VerizonHomepage();

        String contentRootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + contentRootPath;

        String[] expectedResult = dataReader.fileReaderStringXSSF(sheetPath, "TopAccessoryBrands");
        List<WebElement> actualElement = homepage.actualTextsSubMenuItemsInTopAccessoryBrandsMenuFooterOne;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < actualElement.size(); i++) {
            System.out.println("EXPECTED: " + expectedResult[i]);
            System.out.println("ACTUAL: " + getTextFromElement(actualElement.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(actualElement.get(i)),
                    expectedResult[i], "ELEMENT " + i + " DO NOT MATCH");
        }
        softAssert.assertAll();
    }

    //TestCase#15: Validate number of options in ImportantConsumerInfo Menu in footer one via Excel Reader via soft assert
    @Test(priority = 15, enabled = false)
    public void testValidateSubMenuItemsInImportantConsumerInfoMenuOnFooterOneViaExcelReaderSoftAssert() throws IOException {
        dataReader = new DataReader();
        homepage = new VerizonHomepage();

        String contentRootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + contentRootPath;

        String[] expectedResult = dataReader.fileReaderStringXSSF(sheetPath, "ImpConsumerInfo");
        List<WebElement> actualElement = homepage.actualTextsSubMenuItemsInImportantConsumerInfoMenuFooterOne;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < actualElement.size(); i++) {
            System.out.println("EXPECTED: " + expectedResult[i]);
            System.out.println("ACTUAL: " + getTextFromElement(actualElement.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(actualElement.get(i)),
                    expectedResult[i], "ELEMENT " + i + " DO NOT MATCH");
        }
        softAssert.assertAll();
    }

    //TestCase#16: Validate texts in sub-menus of Shop menu in footer one via Excel file via Assert with Attribute
    @Test(priority = 16, enabled = false)
    public void testValidateTextsInSubMenuItemsUnderShopMenuInFooterOneViaExcelFile() throws IOException {
        DataReader dataReader = new DataReader();
        homepage = new VerizonHomepage();
        homepage.scrollToBottomOfVerizonHomepage();

        String rootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(
                homepage.GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SHOP_MENU_FOOTER_ONE()),
                "text", sheetPath, "Shop"));
    }

    //TestCase#17: Validate texts in sub-menus of Top Device Brands menu in footer one via Excel file via Assert with Attribute
    @Test(priority = 17, enabled = false)
    public void testValidateTextsInSubMenuItemsUnderTopDeviceBrandsMenuInFooterOneViaExcelFile() throws IOException {
        DataReader dataReader = new DataReader();
        homepage = new VerizonHomepage();
        homepage.scrollToBottomOfVerizonHomepage();

        String rootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(
                homepage.GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_DEVICE_BRANDS_MENU_FOOTER_ONE()),
                "text", sheetPath, "TopDeviceBrands"));
    }

    //TestCase#18: Validate texts in sub-menus of Support menu in footer one via Excel file via Assert with Attribute
    @Test(priority = 18, enabled = false)
    public void testValidateTextsInSubMenuItemsUnderSupportMenuInFooterOneViaExcelFile() throws IOException {
        DataReader dataReader = new DataReader();
        homepage = new VerizonHomepage();
        homepage.scrollToBottomOfVerizonHomepage();

        String rootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(
                homepage.GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_SUPPORT_MENU_FOOTER_ONE()),
                "text", sheetPath, "Support"));
    }

    //TestCase#19: Validate texts in sub-menus of About Verizon menu in footer one via Excel file via Assert with Attribute
    @Test(priority = 19, enabled = false)
    public void testValidateTextsInSubMenuItemsUnderAboutVerizonMenuInFooterOneViaExcelFile() throws IOException {
        DataReader dataReader = new DataReader();
        homepage = new VerizonHomepage();
        homepage.scrollToBottomOfVerizonHomepage();

        String rootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(
                homepage.GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_ABOUT_VERIZON_MENU_FOOTER_ONE()),
                "text", sheetPath, "AboutVerizon"));
    }

    //TestCase#20: Validate texts in sub-menus of Most Popular menu in footer one via Excel file via Assert with Attribute
    @Test(priority = 20, enabled = false)
    public void testValidateTextsInSubMenuItemsUnderMostPopularMenuInFooterOneViaExcelFile() throws IOException {
        DataReader dataReader = new DataReader();
        homepage = new VerizonHomepage();
        homepage.scrollToBottomOfVerizonHomepage();

        String rootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(
                homepage.GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_MOST_POPULAR_MENU_FOOTER_ONE()),
                "text", sheetPath, "MostPopular"));
    }

    //TestCase#21: Validate texts in sub-menus of Top Accessory Brands menu in footer one via Excel file via Assert with Attribute
    @Test(priority = 21, enabled = false)
    public void testValidateTextsInSubMenuItemsUnderTopAccessoryBrandsMenuInFooterOneViaExcelFile() throws IOException {
        DataReader dataReader = new DataReader();
        homepage = new VerizonHomepage();
        homepage.scrollToBottomOfVerizonHomepage();

        String rootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(
                homepage.GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_TOP_ACCESSORY_BRANDS_MENU_FOOTER_ONE()),
                "text", sheetPath, "TopAccessoryBrands"));
    }

    //TestCase#22: Validate texts in sub-menus of Important Consumer Information menu in footer one via Excel file via Assert with Attribute
    @Test(priority = 22, enabled = false)
    public void testValidateTextsInSubMenuItemsUnderImpConsumerInfoMenuInFooterOneViaExcelFile() throws IOException {
        DataReader dataReader = new DataReader();
        homepage = new VerizonHomepage();
        homepage.scrollToBottomOfVerizonHomepage();

        String rootPath = "/src/test/resources/VerizonTestDataFJ/VerizonFooterOneTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(
                homepage.GET_WEB_ELEMENTS_ACTUAL_TEXTS_SUB_ITEMS_IN_IMPORTANT_CONSUMER_INFORMATION_MENU_FOOTER_ONE()),
                "text", sheetPath, "ImpConsumerInfo"));
    }

}
