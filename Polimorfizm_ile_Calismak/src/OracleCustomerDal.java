public class OracleCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("Data added to Oracle");
    }
    public void mesagge() {
        System.out.println("Oracle --> Yes");
    }
}
