package aboutUsContactUsPageKE;

import common.BaseAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static aboutUsContactUsPageKE.ContactUsWebElementsLocators.*;


public class ContactUsPage extends BaseAPI {

    ContactUsPage contactUsPage;


    @FindBy(xpath = WEB_ELEMENT_CONTACT_US_TEXT_LINK)
    public WebElement contactTextLink;

    @FindBy(xpath = WEB_ELEMENT_SEARCH_BAR)
    public WebElement searchBar;
    @FindBy(css = WEB_ELEMENT_SEARCH_MODULE_BILLING_DISPUTE_LINK)
    public WebElement billingDispute;

    @FindBy(xpath = WEB_ELEMENT_DISPUTE_DEBIT_CARD)
    public WebElement disputeDebitCardBtn;

    @FindBy(xpath = WEB_ELEMET_Billing_RESULT_TAB)
    public WebElement billingResultTab;

    @FindBy(xpath = WEB_ELEMENT_PHONE_IMAGE_DISPUTE_DEBIT_CARD_PAGE)
    public WebElement phoneImage;

    @FindBy(xpath = WEB_ELEMENT_ARROW_MENU_BTN)
    public WebElement arrowMenuBtn;

    @FindBy(xpath = WEB_ELEMENT_SEARCH_MODULE_SUGGESTION_SAVE)
    public WebElement searchModuleSuggestionSave;

    @FindBy(css = WEB_ELE_CONTACT_US_LINK_VERIFYING)
    public WebElement contactUSLinkVerifying;

    @FindBy(xpath = WEB_ELEMENTS_EXPECTED_TEXT_LINK_SELECT_CATEGORY_ARROW_MENU)
    public List<WebElement> expectedTextLinkCategoryArrowMenu;

    @FindBy(xpath = WEB_ELEMENTS_CONTACT_US_SECTION)
    public WebElement contactUsSection;

    @FindBy(xpath = WEB_ELEMENT_FACEBOOK_MESSENGER)
    public WebElement facebookMessenger;

    @FindBy(xpath = WEB_ELEMENT_TEXT_MESSAGE)
    public WebElement popUpMessage;

    @FindBy(id = WEB_ELEMENT_CONTINUE_BUTTON)
    public WebElement continueButton;
    @FindBy(xpath = WEB_ELEMENT_LOGO_IMAGE)
    public WebElement logoImage;


    // }
    public ContactUsPage() {

        PageFactory.initElements(driver, this);
    }

    public void clickContactUsTextLink() {
        clickElement(contactTextLink);
        // contactTextLink.click();
        System.out.println("pass");

    }


    public void clickInSearchBar() {
        switchToNewWindow();
//        Set<String> handler = driver.getWindowHandles();
//        Iterator<String> it = handler.iterator();
//
//       String parentWindowID = it.next();
//        String contactUSWindowID = it.next();
//        driver.switchTo().window(contactUSWindowID);
        clickElement(searchBar);
        //searchBar.click();
        System.out.println("pass");
    }

    public void clickBillingDisputeTextLink() {

        clickElement(billingDispute);
        //billingDispute.click();
        System.out.println("pass");


    }

    public void clickDisputeDebitCardButton() {

        clickElement(disputeDebitCardBtn);

        //disputeDebitCardBtn.click();
        System.out.println("pass");

    }


    public void enterTextInSearchBar(String keysToSend) {
        sendKeysToElement(searchBar, keysToSend);
        // searchBar.sendKeys(keysToSend);

    }

    // Click on Arrow Menu Button
    public void clickArrowMenuBtn() {
        switchToNewWindow();
//         Set<String> handler = driver.getWindowHandles();
//         Iterator<String> it = handler.iterator();
//
//         String parentWindowID = it.next();
//         String contactUSWindowID = it.next();
//         driver.switchTo().window(contactUSWindowID);
        clickElement(arrowMenuBtn);
        //  arrowMenuBtn.click();


    }

    public void excelSheet() throws Exception {
//
////        File src=new File("C:\\Users\\USER\\IdeaProjects\\FinalBootcamp_Team1\\com.bankofamerica\\src\\test\\resources\\testData\\EbayTestData.xlsx");
////        FileInputStream fis=new FileInputStream(src);
//        String pathSheet= System.getProperty("user.dir");
//        XSSFWorkbook wb=new XSSFWorkbook(pathSheet +"\\src\\test\\resources\\testData\\EbayTestData.xlsx");
//        XSSFSheet contactUsPages = wb.getSheetAt(0);
//        System.out.println(contactUsPages.getRow(2).getCell(0).getStringCellValue());
//        System.out.println(contactUsPages.getPhysicalNumberOfRows());
//        System.out.println(contactUsPages.getActiveCell());

    }

    public void countingLinksInContactUsSection() {
        switchToNewWindow();


        WebElement targetSection = driver.findElement(By.xpath("//*[@id=\"listPagesModule\"]/section/div[2]"));

        List<WebElement> targetSectionLists = targetSection.findElements(By.tagName("a"));
        System.out.println(targetSectionLists.size());
        for (int i = 0; i < targetSectionLists.size(); i++)

            System.out.println(targetSectionLists.get(i).getText());


    }

    public void clickFacebookMessengerLink() {
        clickElement(facebookMessenger);

        //facebookMessenger.click();

    }

    public void clickContinueBtn() {
        clickElement(continueButton);
        //continueButton.click();


    }

}





