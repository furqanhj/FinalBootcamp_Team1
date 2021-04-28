package bankOfAmericaAboutUsKE;


import common.BaseAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static bankOfAmericaAboutUsKE.AboutUSWebElementsLocators.*;


public class AboutUsPage extends BaseAPI {


    @FindBy(id = webElementAboutUsMenu)
    WebElement aboutUsMenu;

    @FindBy(xpath = WEB_ELEMENT_BANK_LOGO)
    public WebElement bankLogo;

    @FindBy(xpath = WEB_ELEMENT_OUR_COMPANY_LINK)
    public WebElement ourCompanyLink;

    @FindBy(xpath = WEB_ELEMENT_RESPONSIBLE_GROWTH_LINK)
    public WebElement responsible_GrowthLink;

    @FindBy(xpath = WEB_ELEMENT_BUSINESS_PRACTICES_LINK)
    public WebElement businessPracticesLink;

    @FindBy(xpath = WEB_ELEMENT_WHAT_WE_OFFER_LINK)
    public WebElement whatWeOffer;

    @FindBy(css = WEB_ELEMENT_MEN_IN_MEETING_IMAGE)
    public WebElement menInMeetingImage;

    @FindBy(xpath = WEB_ELEMENT_RESPONSIBLE_GROWTH_IMAGE)
    public WebElement responsibleGrowthImage;

    @FindBy(css = WEB_ELEMENT_WOMEN_TALKING_IMAGE)
    public WebElement businessPracticesImage;
    @FindBy(css = WEB_ELEMENT_WHAT_WE_OFFER_IMAGE)
    public WebElement whatWeOfferImage;


//    @FindBy(xpath = WEB_ELEMENT)
//    public WebElement

//    @FindBy (css = webElementWomanImage)
//    WebElement womanImage ;
//
//    @FindBy (xpath = webElementWomanLeaderLearnMoreLink)
//    WebElement womanLeaderLearnMoreLink;
//    @FindBy(xpath = WEB_ELEMENT_WOMEN_HEADLINE_TITLE)
//    public WebElement headlineText;
//
//    @FindBy (xpath = webElementVideoPlayButton)
//    WebElement videoPlayButton;
//
//    @FindBy (xpath = WEB_ELEMENT_PAUSE_BUTTON)
//    WebElement pauseButton;


    public AboutUsPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickAboutUsMenu() {


        aboutUsMenu.click();
        System.out.println("pass");
    }

    public void clickBankLogo() {
        bankLogo.click();
        System.out.println("pass");

    }

    public void hoverOurCompanyTextLink() {

        hoverOverElement(ourCompanyLink);
//            Actions actions = new Actions(driver);
//
//            actions.moveToElement(ourCompanyLink).build().perform();
        System.out.println("pass");

    }

    public void clickOurCompanyTextLink() {
        ourCompanyLink.click();
        Assert.assertTrue(menInMeetingImage.isDisplayed());
        System.out.println("pass");

    }

    public void clickResponsibleGrowthTextLink() {

        responsible_GrowthLink.click();
        System.out.println("pass");
    }

    public void clickBusinessPracticesTextLink() {

        businessPracticesLink.click();
        System.out.println("pass");
    }

    public void clickWhatWeOffer() {

        whatWeOffer.click();
        System.out.println("pass");

    }

//    public void clickWomanLeaderLearnMoreLink(){
//
//        womanLeaderLearnMoreLink.click();
//        System.out.println("pass");
//    }
//    public void validateWomenLookingAtComputerImage() {
//
//        boolean displayed = womanImage.isDisplayed();
//        if (displayed) {
//            System.out.println("Img is displayed");
//        } else {
//            System.out.println("Img is NOT displayed");
//        }
//    }
//    public void clickVideoPlayButton()  {
//        videoPlayButton.click();
//
//        System.out.println("pass");
//
//    }
//    public void clickVideoPauseButton(){
//        pauseButton.click();
//    }
}

