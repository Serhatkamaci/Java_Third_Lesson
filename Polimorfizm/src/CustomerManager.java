public class CustomerManager {
    private BaseLogger baseLogger;
    // Yukaridaki yapi ile ekleme mesajlarini istedigim log islemine yazdirabilirim.

    public CustomerManager(BaseLogger baseLogger)
    {
        this.baseLogger=baseLogger;
    }

    public void add()
    {
        System.out.print("Musteri eklendi: ");
        baseLogger.log();
    }
}
