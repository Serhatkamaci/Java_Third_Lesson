public class Main {
    public static void main(String[] args)
    {
        // Bir musterinin veritabanina kayededilmesini isliyor olacagiz.
        CustomerManager customerManager= new CustomerManager();
        customerManager.databaseManager= new MySqlDatabaseManager();
        customerManager.getCustomers();
        // Yukaridaki sekilde yapmamain nedeni customermanager'i databasemanger'a yani 2 miras alinan sinifi bir diger diyisle 2 sinifinda ortak anneleri olan databasemanager'dan yola cikarak getData metodunu calistirmak.
        // Eger musteri derse ben aql ile calisicam direk OracleManager'i SqlServer'a cekecegim.

    }
}
