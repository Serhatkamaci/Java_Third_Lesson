
public class Main {
    public static void main(String[] args) {
        /*IDataDal ıdal=new IDataDal() {
            @Override
            public void Add() {

            }
            Eger boyle bir sey olusturursam ayni inheritance
        mantigindaki gibi new'leme islemi cok kotu bir goruntu olusturur.
        };*/

       // IDataDal idal =new OracleManager();
       // idal.Add();

        /*CustomerManager cm=new CustomerManager();

        //cm.add();// Gecmis olsun.
        // "NullPointerExecption" Bos gosterici hatasi aldin.

        cm.idll=new MySqlServer();
        cm.add();*/


        CustomerManager cm=new CustomerManager(new OracleManager());
        cm.add();





    }
}