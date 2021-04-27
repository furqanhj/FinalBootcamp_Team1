package expediaHomepageBS;

import common.BaseAPI;
import utilities.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DateSource extends BaseAPI {

//    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();
//
//    // Insert Data from into Database
//    public static void insertDataIntoDB(){
//        List<String> list = getItemValue();
//        connectToSqlDB = new ConnectToSqlDB();
//        connectToSqlDB.insertDataFromArrayListToSqlTable(list,"EbayBootItems","items");
//    }
//
//    //  From Class/ Same class
//    public static List<String> getItemValue() {
//        List<String> itemsList = new ArrayList<String>();
//        itemsList.add("iPhone");
//        itemsList.add("iphone 11 pro max");
//        itemsList.add("Airpods");
//        itemsList.add("Macbook");
//        itemsList.add("Television");
//        itemsList.add("Camera");
//        return itemsList;
//    }
//
//
//    //Database
//    public static List<String> getItemsListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
//        List<String> list = new ArrayList<>();
//        list = connectToSqlDB.readDataBase("EbayBootItems", "items");
//        return list;
//    }

    //Excel file
    public static List<String> getItemsListFromExcel() throws Exception, IOException, SQLException, ClassNotFoundException{
        String path = "../com.expedia/src/test/resources/Vacation Spots.xlsx";
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

