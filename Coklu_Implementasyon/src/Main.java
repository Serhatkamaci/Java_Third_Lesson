public class Main {
    public static void main(String[] args)
    {
        // Bir sirket dusunelim. Farkli bir sirketten elemanlar ile birlikte ayni proje uzerinde calissinlar.
        // Yani ortak durum calismak fakat diger farkli seyleri sirketler kendi uzerlerinden karsiliyorlar.
        ICustomerManager[] iCustomerManagers={new Robot(),new Worker()};
        for(ICustomerManager icm: iCustomerManagers)
        {
            icm.addWorker();
        }
        IMaintenable iMaintenable=new Robot();
        iMaintenable.maintenable();

        IWorkable[] iWorkables={new Robot(),new OutsourceWorker(),new Worker()};
        for(IWorkable iW: iWorkables)
        {
            iW.work();
        }
    }
}
