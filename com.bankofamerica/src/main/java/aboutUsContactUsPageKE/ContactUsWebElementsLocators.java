package aboutUsContactUsPageKE;

public class ContactUsWebElementsLocators {
    /*
       ---> Elements related to Contact US:
    */
    //Click on Contact us TextLink to open Contact us page, located by: xpath
    public static final String WEB_ELEMENT_CONTACT_US_TEXT_LINK = "//a[normalize-space()='Contact Us']";

    //Search bar on Contact us Page , located by: xpath
    public static final String WEB_ELEMENT_SEARCH_BAR = "//*[@id=\"nav-search-query\"]";

    //Billing dispute Result Tab  ,Located by : xpath
    public static final String WEB_ELEMET_Billing_RESULT_TAB = "//h3[@class='answer-heading']";

    //Click search module Link "billing dispute" located by : css
    public static final String WEB_ELEMENT_SEARCH_MODULE_BILLING_DISPUTE_LINK = "[name='Search Module - Suggestion - billing dispute']";

    //Click Dispute debit card charge online Button located by : xpath
    public static final String WEB_ELEMENT_DISPUTE_DEBIT_CARD = "//a[.='Dispute debit card charge online']";

    //Verify Phone Image in Dispute debit Card page located by: xpath
    public static final  String WEB_ELEMENT_PHONE_IMAGE_DISPUTE_DEBIT_CARD_PAGE=" //img[@alt='Mobile banking Llama']";

    //Click on Arrow Menu Button  located by :xpath
    public static final String WEB_ELEMENT_ARROW_MENU_BTN ="//*[@id=\"globalNavModule\"]/header/div[2]/div[2]/div[3]/a/span[2]";

    public static final String WEB_ELEMENTS_EXPECTED_TEXT_LINK_SELECT_CATEGORY_ARROW_MENU ="//*[@id=\"globalNavModule\"]/header/div[2]/div[2]/div[3]/a/span[2]";

    //Counting of Links in Contact US Section located by : xpath
    public static final String WEB_ELEMENTS_CONTACT_US_SECTION ="//*[@id='listPagesModule']/section/div[2]";

    //Verify Search Suggestion "Save" located By :xpath
    public static final String WEB_ELEMENT_SEARCH_MODULE_SUGGESTION_SAVE = "//*[@id=\"searchStub\"]/div/div/form/div[2]/ul/li[3]/a";

    //Verifying Contact Us Section Link, located By : css
    public static final String WEB_ELE_CONTACT_US_LINK_VERIFYING =".first.pad-top #autoLoansContactUs";
    //Click on Facebook Messenger Link , located By : xpath
    public static final String WEB_ELEMENT_FACEBOOK_MESSENGER ="//*[@id=\"privatelyMessageUsOnFacebook\"]";

    //Verifying The Text Message while Click Facebook Messenger, located by: xpath
    public static final String WEB_ELEMENT_TEXT_MESSAGE = "//h3[normalize-space()=\"You're continuing to another website\"]";

    // Click on Continue Button on the Facebook Message Tab located By : id
    public static final String WEB_ELEMENT_CONTINUE_BUTTON ="privatelyMessageUsOnFacebookContinueLink";
    //Verifying Bank of America Logo Image by: xpath
    public static final String WEB_ELEMENT_LOGO_IMAGE ="[//*[@id=\"u_0_d_yH\"]/div/div/div/a";
}
