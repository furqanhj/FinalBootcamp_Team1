package testRedfinRealEstateAgentsAR;

import common.BaseAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import redfinRealEstateAgentsAR.RedfinRealEstateAgents;

import static redfinRealEstateAgentsAR.RedfinRealEstateAgentsWebElements.*;

public class TestRedfinRealEstateAgents extends BaseAPI {


    @Test(enabled = false)
    public void testVerifyPageTitle() {
        RedfinRealEstateAgents redfinRealEstateAgents = new RedfinRealEstateAgents();
        redfinRealEstateAgents.navigateToRealEstateAgentsPage();
        String exp = "Our Real Estate Agents, REALTORS® and Brokers | Redfin";
        String act = driver.getTitle();
        //Compares 2 Strings -->equalsIgnoreCase will Compare Strings even if in upper or lower case
        Assert.assertTrue(exp.equalsIgnoreCase(act));
    }

    @Test(enabled = false)
    public void testPageTitleInspection() {
        RedfinRealEstateAgents redfinRealEstateAgents = new RedfinRealEstateAgents();
        redfinRealEstateAgents.clickLearnMoreButton();
        String expectedTitle = "Why Buy a House with a Redfin Agent | Redfin";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle);
        softAssert.assertTrue(expectedTitle.equalsIgnoreCase(actualTitle));
        softAssert.assertNotSame(actualTitle, expectedTitle);
        softAssert.assertAll();

    }
    @Test (enabled = true)
    public void testVerifyFindRedfinAgentHeader(){
        RedfinRealEstateAgents redfinRealEstateAgents = new RedfinRealEstateAgents();
        redfinRealEstateAgents.verifyFindRedfinAgentHeader();
        Assert.assertEquals(getTextFromElement(WEB_ELEMENT_FIND_REDFIN_AGENT_HEADER),"Find a local Redfin Agent");
        //assertEqualsGetText("Find a local Redfin Agent", "WEB_ELEMENT_FIND_REDFIN_AGENT_HEADER");
    }
    @Test(enabled = false)
    public void testTalkToARedfinAgentButton(){
        RedfinRealEstateAgents redfinRealEstateAgents = new RedfinRealEstateAgents();
        redfinRealEstateAgents.clickTalkToARedfinAgentButton();
        Assert.assertEquals(getTextFromElement(WEB_ELEMENT_TALK_TO_AGENT_HEADER),"Talk to a local Redfin Agent");
        //assertEqualsGetText("Talk to a local Redfin Agent", WEB_ELEMENT_TALK_TO_AGENT_HEADER);
    }
    @Test(enabled = false)
    public void testTypeInAgentSearchBox() throws InterruptedException {
        RedfinRealEstateAgents redfinRealEstateAgents = new RedfinRealEstateAgents();
        redfinRealEstateAgents.typeInAgentSearchBox();
        Assert.assertTrue(isElementDisplayed(WEB_ELEMENT_DID_YOU_MEAN_SUGGESTIONS_WINDOW));
    }
}
