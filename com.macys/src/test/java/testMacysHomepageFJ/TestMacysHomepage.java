package testMacysHomepageFJ;

import common.BaseAPI;
import macysHomepageFJ.MacysHomepage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMacysHomepage extends BaseAPI {

    MacysHomepage homepage;

    //TestCase#1: navigate to Lists Page, validate via text
    @Test (priority = 1, enabled = true)
    public void testNavigateToMacysListsPage(){
        homepage = new MacysHomepage();
        homepage.navigateToListsPage();

        String actualText = getTextFromElement(homepage.actualTextOnListsPage);
        String expectedText = "\n" +
                "            Guest List\n" +
                "          ";

        Assert.assertEquals(actualText.trim(), expectedText.trim(), "TEXT DO NOT MATCH");
    }
}
