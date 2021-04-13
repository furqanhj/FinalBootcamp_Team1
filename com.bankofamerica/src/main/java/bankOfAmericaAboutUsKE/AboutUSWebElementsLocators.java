package bankOfAmericaAboutUsKE;

public class AboutUSWebElementsLocators {
    /*
       ---> Elements related to About US Menu:
    */
    //Click on About Us Menu  to open About US page, located by: id
    public static final String webElementAboutUsMenu = "NAV_ABOUT_US";

    // Verifying a Bank Of America Logo in About Us Menu, located by :xpath
    public static final String WEB_ELEMENT_BANK_LOGO ="//img[@alt='Bank of America']";

    //hoverOverMenuLink_OurCompany and Click , located by : xpath
    public static final String WEB_ELEMENT_OUR_COMPANY_LINK ="//header/div/div[3]/div/div[1]/nav/ul/li[1]/a[1]";
    //Validating Our Company page ,located : css
    public static final String WEB_ELEMENT_MEN_IN_MEETING_IMAGE="[alt='Man in meeting']";

    // Click on Responsible Growth Link, Located by : xpath
    public static final String WEB_ELEMENT_RESPONSIBLE_GROWTH_LINK ="//ul[@class='navigation-main-list ']//a[.='Responsible growth']";
    //Validating Responsible growth page,located : xpath
    public static final String WEB_ELEMENT_RESPONSIBLE_GROWTH_IMAGE="//img[@alt='People in meeting']";

    // Click on Business practices Link, located by : xpath
    public static final String WEB_ELEMENT_BUSINESS_PRACTICES_LINK ="//ul[@class='navigation-main-list ']//a[.='Business practices']";
    //Validating Business Practices page,located : css
    public static final String WEB_ELEMENT_WOMEN_TALKING_IMAGE=" div.notched-image__container > div > div > div > picture > img";

    // Click on What we offer Link, located by : xpath
    public static final String WEB_ELEMENT_WHAT_WE_OFFER_LINK  ="//ul[@class='navigation-main-list ']//a[.='What we offer']";
    //Validating Responsible growth page,located : CSS
    public static final String WEB_ELEMENT_WHAT_WE_OFFER_IMAGE="[alt='People talking at table with tablet ']";


    /*
       ---> Elements related to About Us Page:
    */

    //Verifying "Women looking at computer" Image, located by: Css
//    public static final String webElementWomanImage = "[alt='Women looking at computer']";
//
//    //Click "Celebrating a decade of advancing women leaders" Learn More Link, located by: Xpath
//    public static final String webElementWomanLeaderLearnMoreLink = "//*[@id='c1c2']/div/div/a";
//
//    //Validating Women headline Title ,located by ;xpath
//    public static final String  WEB_ELEMENT_WOMEN_HEADLINE_TITLE ="//*[@id='content']/h1";
//
//    //Play " Celebrating a decade of advancing women leaders" Video, located by: Xpath
//    public static final String webElementVideoPlayButton = "//a[.='Play Celebrating a decade of advancing women leaders video']";
//
//    //Pause  Celebrating a decade of advancing women leaders" Video, located by: Xpath
//    public static final String WEB_ELEMENT_PAUSE_BUTTON="//*[@id='vjs-celebrating-a-decade-of-advancing-women-leaders-2020']/div[5]/button[1]";
//
//
    //Click on Bank Of America Logo Link ,Located by :Xpath
    //public static final  String WEB_ELEMENT_CLICK_LOGO="//img[@alt='Bank of America']";

    /*
        ---> Elements on the homepage:
     */
    //Google image on homepage, located by: CSS
    public static final String webElementGoogleImageOnHomepage = "img[alt='Google']";

    /*
        ---> Navigation links on homepage:
     */
    //"About" link on the homepage, located by: XPATH
    public static final String webElementAboutLink = "//a[contains(text(),'About')]";
    //"Store" link on the homepage, located by: XPATH
    public static final String webElementStoreLink = "//a[contains(text(),'Store')]";
    //"Gmail" link on the homepage, located by: XPATH
    public static final String webElementGmailLink = "//a[contains(text(),'Gmail')]";
    //"Images" link on the homepage, located by: XPATH
    public static final String webElementImagesLink = "//a[contains(text(),'Images')]";



}


