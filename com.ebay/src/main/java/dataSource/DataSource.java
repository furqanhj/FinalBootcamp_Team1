package dataSource;

import databases.ConnectToSqlDB;
import utilities.DataReader;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public static DataReader excelReader = new DataReader();

    //Insert data into database
    public static void insertDataIntoDB(){
        List<String> list = getItemValue();
        connectToSqlDB = new ConnectToSqlDB();
        connectToSqlDB.insertDataFromArrayListToSqlTable(list, "EbaySearchItems", "first_search");
    }

    public static List<String> getItemValue(){
        List<String> itemList = new ArrayList<>();
        itemList.add("samsung watch 3");
        itemList.add("watch 3 charger");
        itemList.add("wireless charging station");
        itemList.add("active 2");
        itemList.add("iPhone");
        itemList.add("rolex watch");
        itemList.add("MontBlanc pen");

        return itemList;
    }

    public static List<String> getItemsListFromDB() throws Exception {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("EbaySearchItems", "first_search");

        return list;
    }
}
