package expediaThingsToDoAR;

import common.BaseAPI;

import static expediaThingsToDoAR.ExpediaThingsToDoWebElements.*;

public class ExpediaThingsToDo extends BaseAPI{


    public void selectThingsToDoDropDownOption(){
        explicitWaitUntilClickable(20,WEB_ELEMENT_MORE_TRAVEL_DROPDOWN_LINK);
        clickByXpathOrCssUsingJavaScript(WEB_ELEMENT_THINGS_TO_DO_DROPDOWN_OPTION);
        implicitWait(20);

    }























}





















