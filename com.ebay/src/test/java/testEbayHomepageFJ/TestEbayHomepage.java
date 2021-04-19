package testEbayHomepageFJ;

import common.BaseAPI;
import ebayHomepageFJ.EbayHomepage;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

//TOTAL TEST CASES =
public class TestEbayHomepage extends BaseAPI {

    EbayHomepage ebayHomepage;

    //Test Case#1: Search for "travel bags" and validate via Text on search result page.
    @Test(priority = 1, enabled = false)
    public void testSearchForAnItem() {
        ebayHomepage = new EbayHomepage();

        String searchItem = "travel bags";
        ebayHomepage.searchForAnItem(searchItem);
        String actualText = getTextFromElement(ebayHomepage.expectedTextFromSearchResult);

        Assert.assertTrue(compareStrings(actualText, searchItem));
    }

    //Test Case#2: Test All Category dropdown in search bar, element on index 10 (collectibles) via Text.
    @Test(priority = 2, enabled = false)
    public void testAllCategoriesDropdownByIndex() {
        ebayHomepage = new EbayHomepage();

        ebayHomepage.selectCategoryFromSearchBarUsingIndex(10); // element on index 10 is "Collectibles"
        String actualText = getTextFromElement(ebayHomepage.expectedAllCatDropdown);
        String expectedText = "Collectibles";

        Assert.assertEquals(actualText, expectedText, "TEXT DO NOT MATCH");
    }

    //Test Case#3: Validate number of elements in Select Categories in search bar dropdown via ExcelReader
    @Test(priority = 3, enabled = false)
    public void testNumberOfElementsInSelectAllCatDropdownViaExcelReader() throws IOException {
        ebayHomepage = new EbayHomepage();

        String sheetPath = System.getProperty("user.dir") + "/src/test/resources/test_data/EbayTestData.xlsx";

        String[] expectedResult = dataReader.fileReaderStringXSSF(sheetPath, "AllCatDropdown");
        List<WebElement> elements = ebayHomepage.expectedAllCatDropdownTotalElements;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < elements.size(); i++) {
            System.out.println("EXPECTED: " + expectedResult[i]);
            System.out.println("ACTUAL: " + getTextFromElement(elements.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(elements.get(i)),
                    expectedResult[i], "ELEMENT " + i + " DO NOT MATCH");
        }
        softAssert.assertAll();
    }

    // Test Case#4: Validate the list of Categories in All Category dropdown via Buffered Reader
    @Test(priority = 4, enabled = false)
    public void testNumberOfElementsInSelectAllCatDropdownViaTextFile() throws IOException {
        ebayHomepage = new EbayHomepage();

        FileReader fileReader = new FileReader("src/test/resources/test_data/EbayHomepageAllCatDropdown");
        BufferedReader bufferedReader = new BufferedReader(fileReader);


        List<WebElement> elements = ebayHomepage.expectedAllCatDropdownTotalElements;

        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < elements.size(); i++) {
            System.out.println("EXPECTED: " + bufferedReader);
            System.out.println("ACTUAL: " + getTextFromElement(elements.get(i)));
            System.out.println();

            softAssert.assertEquals(getTextFromElement(elements.get(i)),
                    bufferedReader, "ELEMENT " + i + " DO NOT MATCH");
        }

        softAssert.assertAll();
    }

    //Test Case#5: Validate search an item using SQLDB
    @Test(priority = 5, enabled = true)
    public void testSearchForAnItemUsingSQLDB() throws Exception {
        ebayHomepage = new EbayHomepage();
        ebayHomepage.searchForAnItemUsingSQLDB();

        String actualText = getTextFromElement(ebayHomepage.actualTextSearchResultWirelessChargingStation);
        String expectedText = "wireless charging station";

        Assert.assertTrue(compareStrings(actualText, expectedText));
    }

    //Test Case#6: Validate number of categories in All Categories dropdown via Excel file
    @Test(priority = 6, enabled = true)
    public void testValidateAllNamesInAllCategoriesDropdownViaExcel() throws IOException {
        ebayHomepage = new EbayHomepage();

        String rootPath = "/src/test/resources/test_data/EbayTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.cssSelector(ebayHomepage.GET_WEB_ELEMENTS_EXPECTED_ALL_CAT_DROPDOWN_SEARCH_BAR()),
                "innerHTML", sheetPath, "AllCatDropdown"));
    }
}
