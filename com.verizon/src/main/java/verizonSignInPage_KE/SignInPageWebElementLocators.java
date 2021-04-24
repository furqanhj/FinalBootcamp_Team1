package verizonSignInPage_KE;

public class SignInPageWebElementLocators {
    // Sign in Button1
    public static final String WEB_ELEMENT_SIGN_IN_BTN1 ="//*[@id=\"gnav20-sign-id\"]/span";

    // Sign in Button2
    public static final String WEB_ELEMENT_SIGN_IN_BTN2="//div[@id='main-content']/div[@class='row']//button[@id='login-submit']";
    //User ID Input , located by :css
    public static final String WEB_ELEMENT_USER_ID_INPUT ="#main-content > .row [type='text']";
    //User ID Input , located by :css
    public static final String WEB_ELEMENT_PASSWORD_INPUT ="  #main-content > .row [type='password']";
    //validate sign in , located by : xpath
    public static final String WEB_ELEMENT_Validate_SIGN_IN ="//*[@id='userID']/p";
    //Register Link , located By ; xpath
    public static final String WEB_ELEMENT_REGISTER_LINK ="//*[@id=\"registerLink\"]";
    //Wireless Radio Button , located by : xpath
    public static final String WEB_ELEMENT_WIRELESS_RADIO_BUTTON="//*[@id=\"serviceTypeUserId\"]";

    //In Home Radio Button , located by : xpath
    public static final String WEB_ELEMENT_IN_HOME_RADIO_BUTTON="//*[@id=\"serviceTypeUserIdHome\"]";
    //Continue Button , located by : xpath
    public static final String WEB_ELEMENT_CONTINUE_BTN="//*[@id=\"continue\"]";
     //Continue Button1 located by :xpath
    public static final String WEB_ELEMENT_CONTINUE_BTN1="// *[@id=\"loginContinue\"]";
    //Select Registration Method, located by :xpath
    public static final String WEB_ELEMENT_SELECT_OPTION1="// *[@id=\"SelectRegistrationMethod\"]";
    // Mobile Number Option , located by :xpath
    public static final String WEL_ELEMENT_OPTION3 ="// *[@id=\"SelectRegistrationMethod\"]/option[3]";
    public static final String WEB_ELEMENT_OPTIONS ="/html/body/div[1]/div/div[2]/div/ul/li";



}
