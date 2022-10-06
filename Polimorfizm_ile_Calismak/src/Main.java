public class Main {
    public static void main(String[] args)
    {
        // Bir class sadece bir class'i miras alabilir fakat bir class birden fazla class'i implemente edebilir.
        // Interfaceler bir class kabul edilmiyor fakat reerans tutarlar.
        // Tamamlanmamis operasyonlar icerirler.
        // Interfacelerde abstractlar gibi newlenemez.
        ICustomerDal[] iCustomerDal={new MySqlCustomerDal(),new OracleCustomerDal()};
        for(ICustomerDal ic:iCustomerDal)
        {
            ic.add();
        }

        IRepository[] iRepositories={new MySqlCustomerDal(),new OracleCustomerDal()};

        for(IRepository iR: iRepositories)
        {
            iR.mesagge();
        }
    }
}
