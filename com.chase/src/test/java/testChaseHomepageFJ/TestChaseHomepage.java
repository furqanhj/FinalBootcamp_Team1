package testChaseHomepageFJ;

import chaseHomepageFJ.ChaseHomepage;
import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestChaseHomepage extends BaseAPI {

    ChaseHomepage chaseHomepage;

    @Test(priority = 1)
    public void testNumOfElementsInCustomerServiceDropdown(){
        chaseHomepage = new ChaseHomepage();
        chaseHomepage.clickOnCustomerServiceDropdown();

        List<WebElement> getLinksFromElement = chaseHomepage.actualNumOfLinksInCustServiceDropdown;
        int actualNumOfLinks = getLinksFromElement.size();
        int expectedNumOfLinks = 6;

        Assert.assertEquals(actualNumOfLinks, expectedNumOfLinks, "NUMBER OF LINKS DO NOT MATCH");
        System.out.println("TEST PASSED!- " + expectedNumOfLinks + " links found under tested dropdown");
    }

}
