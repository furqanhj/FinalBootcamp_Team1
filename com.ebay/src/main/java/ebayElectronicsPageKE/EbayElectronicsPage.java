package ebayElectronicsPageKE;

import common.BaseAPI;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import static ebayElectronicsPageKE.WebElementsElectronicsPageLocators.*;


public class EbayElectronicsPage extends BaseAPI {

    @FindBy(xpath = WEB_ELEMENT_ELECTRONIC_TEXT_LINK)
    public WebElement electronicsTextLink;

    @FindBy(xpath = WEB_ELEMENT_LEFT_MENU_BAR_TEXT_LINKs)
    public WebElement leftMenuBarTextLinks;

    @FindBy(xpath = WEB_ELEMENT_RIGHT_MENU_BAR_TEXT_LINKs)
    public WebElement rightMenuBarTextLinks;

    @FindBy(xpath = WEB_ELEMENT_ICON_CART)
    public WebElement iconCart;

    @FindBy(xpath = WEB_ELEMENT_SHOP_CATEGORY_SECTION_TextLinks)
    public WebElement shopCategorySectionTextLinks;

    @FindBy(xpath = WEB_ELEMENT_CAMERAS_PHOTO_LINK)
    public WebElement camerasPhotoLinks;

    @FindBy(xpath = WEB_ELEMENT_TextLink_SEE_ALL_CAMERAS)
    public WebElement seeTextLinkSeeAllCameras;

    @FindBy(xpath = WEB_ELEMENT_CAMERA_PHOTO_SECTION_TextLink_)
    public WebElement camerasPhotoSectionTextLinks;

    @FindBy(xpath = WEB_ELEMENT_VERIFYING_CAMERA_PHOTO_SECTION_TextLink)
    public WebElement verifyingCamerasPhotoSectionTextLink;

    @FindBy(xpath = WEB_ELEMENT_REGISTER_TextLink)
    public WebElement registerTextLink;

    @FindBy(xpath = WEB_ELEMENT_VERIFYING_Register_PAGE)
    public WebElement verifyingRegisterPage;

    @FindBy(xpath = WEB_ELEMENT_FIRST_NAME_INPUT)
    public WebElement firstNameInput;
    @FindBy(xpath = WEB_ELEMENT_LAST_NAME_INPUT)
    public WebElement lastNameInput;
    @FindBy(xpath = WEB_ELEMENT_EMAIL_INPUT)
    public WebElement emailInput;
    @FindBy(xpath = WEB_ELEMENT_PASSWORD_INPUT)
    public WebElement passwordInput;
    @FindBy(xpath = WEB_ELEMENT_CREATE_ACC_BUTTON)
    public WebElement createAccBtn;
    @FindBy(xpath = WEB_ELEMENT_VERIFYING_CREATE_ACC_BUTTON)
    public WebElement verifyingCreateAccBtn;

    @FindBy(css = WEB_ELEMENT_BUSINESS_ACC_RADIO_BUTTON)
    public WebElement businessAccRadioBtn;
    @FindBy(xpath = WEB_ELEMENT_QM_IMAGE)
    public WebElement qmImageInHelp;
    @FindBy(xpath = WEB_ELEMENT_FAQS_TAB_Text)
    public WebElement faqsTabText;
    @FindBy(xpath = WEB_ELEMENT_SRVY_IMAGE)
    public WebElement surveyImageLink;
    @FindBy(xpath = WEB_ELEMENT_VERIFYING_SRVY_IMAGE)
    public WebElement verifyingSurveyImageLink;
    @FindBy(xpath = WEB_ELEMENT_SURVEY_BOX)
    public WebElement surveyBox;
    @FindBy(xpath = WEB_ELEMENT_VERIFYING_SURVEY_BOX)
    public WebElement verifyingSurveyBox;
    /**
     * Most popular listings by model
     */
    @FindBy(xpath = WEB_ELEMENT_IMAGES_LINK)
    public WebElement imagesLink;
    @FindBy(xpath = WEB_ELEMENT_Title_IMAGE1_LINK)
    public WebElement titleImage1Link;
    @FindBy(xpath = WEB_ELEMENT_Right_IMAGE1_BANNER)
    public WebElement rightImage1Link;


    public EbayElectronicsPage()  {
        PageFactory.initElements(driver, this);
    }

    public void clickElectronicsTextLink() {
        clickElement(electronicsTextLink);

    }

    public void countLeftMenuBarTextLinks() {

        List<WebElement> targetSectionLists = leftMenuBarTextLinks.findElements(By.tagName("a"));
        System.out.println(targetSectionLists.size());

    }

    public void countRightMenuBarTextLinks() {

        List<WebElement> targetSectionListsRight = rightMenuBarTextLinks.findElements(By.tagName("a"));
        System.out.println(targetSectionListsRight.size());

    }

    public void countShopCategorySectionTextLinks() {

        List<WebElement> targetShopCategorySection = shopCategorySectionTextLinks.findElements(By.tagName("a"));
        System.out.println("Text Links Count : " + targetShopCategorySection.size());
        System.out.println("******************************************");
        System.out.println("Links Titles : " + shopCategorySectionTextLinks.getText());
        System.out.println("******************************************");


   }

    public void clickCamerasPhotoLinks() {
        clickElement(camerasPhotoLinks);


    }

    public void countCamerasPhotoSectionTextLinks() {
        List<WebElement> targetCameraPhotoSection = camerasPhotoSectionTextLinks.findElements(By.tagName("a"));
        System.out.println(targetCameraPhotoSection.size());
        System.out.println("******************************************");
        System.out.println(camerasPhotoSectionTextLinks.getText());
        System.out.println("******************************************");


    }

    public void clickRegisterTextLink() {

        clickElement(registerTextLink);

    }

    public void createEBayAccount() throws IOException {
       // public static ExcelTest excelTest;

       // public static void main(String[] args) throws IOException, InterruptedException {
         //   excelTest= new ExcelTest();

//            System.setProperty("webdriver.chrome.driver","E:\\QE Automation\\SelenuimPractice\\Drivers\\chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://signup.ebay.com/pa/crte?ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror");


            FileInputStream file = new FileInputStream("C:\\Users\\USER\\Documents\\EbayAccData.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            int noOfRows = sheet.getLastRowNum();
            System.out.println("No of Records in the excel Sheet: " + noOfRows);

            //for(int row = 1; row <=noOfRows ; row++){

            XSSFRow currentRow = sheet.getRow(2);
            String FirstName = currentRow.getCell(0).getStringCellValue();
            String LastName = currentRow.getCell(1).getStringCellValue();
            String Email = currentRow.getCell(2).getStringCellValue();
            String Password = currentRow.getCell(3).getStringCellValue();
            System.out.println(FirstName);
            System.out.println(LastName);

              sendKeysToElement(firstNameInput,FirstName);
              sendKeysToElement(lastNameInput,LastName);
              sendKeysToElement(emailInput,Email);
              sendKeysToElement(passwordInput,Password);


//            driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(FirstName);
//            driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys(LastName);
//            driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
//            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);



         //  driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
//            Thread.sleep(2000);



    }
    public void clickCreateAccBtn(){
     //createAccBtn.click();

    clickElement(createAccBtn);

}

    public void clickBusinessAccRadioBtn (){
         businessAccRadioBtn.click();
       //clickElement(businessAccRadioBtn); didn't work
    }
    public void clickQmImageInHelp(){

        clickElement(qmImageInHelp);
    }
    public void clickSurveyImageLink (){

        clickElement(surveyImageLink);
    }
    public void sendTextToSurveyBox(){

        sendKeysToElement(surveyBox,"I like to shop");

    }
    public void verifyImagesLink (){



    List<WebElement> targetSectionLists = imagesLink.findElements(By.tagName("a"));
        System.out.println(targetSectionLists.size());

}
public void clickTitleImage1Link(){
        clickElement(titleImage1Link);

    String image1Title = driver.getTitle();
    System.out.println(image1Title);
}

}