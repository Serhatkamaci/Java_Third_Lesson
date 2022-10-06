public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("Data added to MySql");
    }

    @Override
    public void mesagge() {
        System.out.println("Mysql --> Yes");
    }
}
