package ebayToysAR;

import common.BaseAPI;
import utilities.DataReader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource extends BaseAPI {
    public static DataReader excelReader = new DataReader();
    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "C:\\Users\\anaam\\IdeaProjects\\FinalBootcamp_Team1\\com.ebay\\src\\test\\resources\\Untitled spreadsheet.xlsx";
        String[] myStringArray = excelReader.fileReader2(path, 0);
        for(int i=1;i<myStringArray.length; i++)
            System.out.println(myStringArray[i] + " ");
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < myStringArray.length; i++) {
            list.add(myStringArray[i]);
        }
        return list;



    }
}


