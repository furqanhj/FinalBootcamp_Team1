package testBMWHomepageFJ;

import bmwHomepageFJ.BMWHomepage;
import common.BaseAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.TestRunner;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestBMWHomepage extends BaseAPI {

    BMWHomepage homepage;

    //TestCase#1: validate number of links in BMW Owners (3 links), via size of Element
    @Test (priority = 1, enabled = false)
    public void testNumberOfLinksInBMWOwners(){
        homepage = new BMWHomepage();
        homepage.clickOnOwnersDropdown();

        int actualNumOfLinks = homepage.actualNumOfLinksBMWOwners.size();
        int expectedNumOfLinks = 3;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF LINKS = " + expectedNumOfLinks);
    }

    //TestCase#2: validate number of links in Know Your BMW (4 links), via size of Element
    @Test (priority = 2, enabled = false)
    public void testNumberOfLinksInKnowYourBMW(){
        homepage = new BMWHomepage();
        homepage.clickOnOwnersDropdown();

        int actualNumOfLinks = homepage.actualNumOfLinksKnowYourBMW.size();
        int expectedNumOfLinks = 4;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF LINKS = " + expectedNumOfLinks);
    }

    //TestCase#3: validate number of links in Caring For Your BMW (5 links), via size of Element
    @Test (priority = 3, enabled = false)
    public void testNumberOfLinksInCaringForYourBMW(){
        homepage = new BMWHomepage();
        homepage.clickOnOwnersDropdown();

        int actualNumOfLinks = homepage.actualNumOfLinksCaringForYourBMW.size();
        int expectedNumOfLinks = 5;

        Assert.assertTrue(compareIntegers(actualNumOfLinks, expectedNumOfLinks));
        System.out.println("ACTUAL NUMBER OF LINKS = " + actualNumOfLinks);
        System.out.println("EXPECTED NUMBER OF LINKS = " + expectedNumOfLinks);
    }

    //Test Case#4: Validate number of links in BMW Owners inside Owners dropdown via Excel file
    @Test(priority = 4, enabled = false)
    public void testValidateNumOfLinksBMWOwnersViaExcelFile() throws IOException {
        homepage = new BMWHomepage();

        String rootPath = "/src/test/resources/bmwTestData/BMWTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(homepage.GET_WEB_ELEMENTS_NUMBER_OF_LINKS_BMW_OWNERS()),
                "text", sheetPath, "BMWOwners"));
    }

    //Test Case#5: Validate number of links in Know Your BMW inside Owners dropdown via Excel file
    @Test(priority = 5, enabled = false)
    public void testValidateNumOfLinksKnowYourBMWViaExcelFile() throws IOException {
        homepage = new BMWHomepage();
        homepage.clickOnOwnersDropdown();

        String rootPath = "/src/test/resources/bmwTestData/BMWTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(homepage.GET_WEB_ELEMENTS_NUMBER_OF_LINKS_KNOW_YOUR_BMW()),
                "text", sheetPath, "KnowYourBMW"));
    }

    //Test Case#6: Validate number of links in Caring For Your BMW inside Owners dropdown, via Excel file
    @Test(priority = 6, enabled = true)
    public void testValidateNumOfLinksCaringForYourBMWViaExcelFile() throws IOException {
        homepage = new BMWHomepage();
        homepage.clickOnOwnersDropdown();

        String rootPath = "/src/test/resources/bmwTestData/BMWTestData.xlsx";
        String sheetPath = System.getProperty("user.dir") + rootPath;

        Assert.assertTrue(compareAttributeListToExpectedStringArray(By.xpath(homepage.GET_WEB_ELEMENTS_NUMBER_OF_LINKS_CARING_FOR_YOUR_BMW()),
                "text", sheetPath, "CaringForYourBMW"));
    }
}
