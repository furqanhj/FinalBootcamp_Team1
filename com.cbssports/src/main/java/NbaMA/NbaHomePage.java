package NbaMA;

import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static NbaMA.NbaLocators.*;

public class NbaHomePage extends BaseAPI {

    public NbaHomePage () { PageFactory.initElements(driver,this); }

    @FindBy (xpath =  WEB_ELEMENT_CLICK_SCORES )
    public WebElement clickScores;
    @FindBy (xpath = WEB_ELEMENT_VERIFY_STANDINGS)
    public WebElement verifyStandings;
    @FindBy (xpath = WEB_ELEMENT_CHECK_SCHEDULE)
    public WebElement checkSchedule;
    @FindBy (xpath = WEB_ELEMENT_SORT_TEAMS)
    public WebElement sortTeams;
    @FindBy (xpath = WEB_ELEMENT_COUNT_STATS)
    public WebElement countStats;
    @FindBy (xpath = WEB_ELEMENT_CLICK_ODDS)
    public WebElement clickOdds;
    @FindBy (xpath = WEB_ELEMENT_DROP_DOWN_NBA_SCORES)
    public WebElement dropDownNbaScores;
    @FindBy (xpath = WEB_ELEMENT_CHECK_PODCASTS)
    public WebElement checkPodcasts;
    @FindBy (xpath = WEB_ELEMENT_ABOUT_US)
    public WebElement aboutUs;

    public void clickScores (){
        implicitWait();
        clickScores.click();
        implicitWait();
    }

    public void verifyStandings (){
        implicitWait();
        verifyStandings.click();
        implicitWait();
    }

    public void checkSchedule () {
        implicitWait();
        checkSchedule.click();
        implicitWait();
    }

    public void sortTeams (){
        implicitWait();
        sortTeams.click();
        implicitWait();
    }

    public void countStats (){
        implicitWait();
        countStats.click();
    }

    public void clickOdds (){
        implicitWait();
        clickOdds.click();
    }

    public void dropDownNbaScores (){
        implicitWait();
        dropDownNbaScores.click();

    }

    public void checkPodcasts (){
        implicitWait();
        checkPodcasts.click();
    }

    public void aboutUs (){
        implicitWait();
        aboutUs.click();
    }
}
