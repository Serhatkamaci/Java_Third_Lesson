import java.security.PublicKey;

public class Worker implements IWorkable,IEatable, IPayable,ICustomerManager{
    // Bizim calisan class'imiz.

    @Override
    public void work() {
        System.out.println("OutsourceWorker :))");
    }

    @Override
    public void eat() {
        System.out.println("Worker eat :))");
    }

    @Override
    public void pay() {
        System.out.println("Worker payable :)))");
    }

    @Override
    public void addWorker() {
        System.out.println("Worker is adding to database :))");
    }
}
