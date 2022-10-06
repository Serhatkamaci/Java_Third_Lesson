public class Main {
    public static void main(String[] args)
    {
        /*
        // Yazilimda "LOGLAMA" Iislemleri cok onemli seylerdir.
        // LOGLAMA --> KAYDETMEK

        MailLogger logger = new MailLogger();
        // Eger override islemi yapmasaydim, tum log islemlerimde default olan log mesaji gelicekti.

        logger.log("Log mesaji");
         */

        BaseLogger[] baseLoggers={new FileLogger(),new DatabaseLogger(),new MailLogger()};
        // Ben yukaridakiş islemler ile bir tane logger'a olan bagimliligimi ortadan kaldirmis oldum.
        // 3 elemanim var fakat 3'ude farkli islemler yapiyor.
        // Ben ileride farkli bir loglama islemi olusturusam diziye ekleyebilriim bana boyle bir kolaylik sagladi.
        // Buna polimorfizm denir.

        for(BaseLogger base_logger: baseLoggers)
        {
            base_logger.log();
        }

        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
