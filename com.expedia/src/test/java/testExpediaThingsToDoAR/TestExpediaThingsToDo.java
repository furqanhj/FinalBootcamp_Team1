package testExpediaThingsToDoAR;

import common.BaseAPI;
import expediaThingsToDoAR.ExpediaThingsToDo;
import org.testng.annotations.Test;

public class TestExpediaThingsToDo extends BaseAPI {




    @Test (enabled = true)
    public void testThingsToDoDropDownOption(){
        ExpediaThingsToDo expediaThingsToDo = new ExpediaThingsToDo();
        expediaThingsToDo.selectThingsToDoDropDownOption();
        assertEqualsGetText("Search things to do","WEB_ELEMENT_SEARCH_THINGS_TO_DO_HEADER");

    }











}
