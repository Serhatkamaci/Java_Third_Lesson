import javax.xml.crypto.Data;

public class CustomerManager {
    DatabaseManager databaseManager;
    public void getCustomers()
    {
        // Eger programci bir tane database'i newlerse o database'e bagimli olur.
        databaseManager.getData();
    }
}
