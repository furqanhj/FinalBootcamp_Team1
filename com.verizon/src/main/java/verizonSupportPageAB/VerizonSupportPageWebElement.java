package verizonSupportPageAB;

import org.openqa.selenium.support.PageFactory;

public class VerizonSupportPageWebElement {

    public static final String WEB_ELEMENT_SUPPORT_LINK = "//*[@id=\"gnav20-Support-L1\"][2]"; //XPATH
    public static final String WEB_ELEMENT_SUPPOER_OVERVIEW_LINK = "//*[@id=\"gnav20-Support-L2-1\"]"; //XPATH
    public static final String WEB_ELEMENT_SUPPORT_WELCOME_MESSAGE="//*[@id=\"h1Ctr\"]/div/h1"; //XPATH
    public static final String WEB_ELEMENT_VERIZON_LOGO="//div[@class='gnav20-desktop']/div[2]//img";


    public static final String WEB_ELEMENT_SUPPORT_SEARCH_TEXT_BOX="//*[@id=\"navPhoneSearch\"]";
    public static final String WEB_ELEMENT_SUPPORT_SEARCH_BUTTON="//*[@id=\"searchIconButton\"]";

    public static final String WEB_ELEMENT_SIGNIN_LINK="//div[@class='gnav20-content-wrapper gnav20-grouping-active']/ul/li[5]";
    public static final String WEB_ELEMENT_USER_ID_BOX="//div[@id='main-content']/div[2]/div/form/div[1]/input";
    public static final String WEB_ELEMENT_PASSWORD_BOX="//div[@id='main-content']/div[2]/div/form/div[2]/input[@type='password']";
    public static final String WEB_ELEMENT_SIGN_IN_BUTTON="//div[@id='main-content']/div[2]/div/form/div[4]/button";
    public static final String WEB_ELEMENT_FAIL_LOGIN_MESSAGE="//*[@id=\"BotChatGoesHere\"]/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/div/div/ul/li/div/div/div[1]/div/p[1]";
}