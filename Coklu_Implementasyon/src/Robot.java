public class Robot implements IWorkable,IMaintenable,ICustomerManager {
    @Override
    public void work() {
        System.out.println("Robot worker :))");
    }

    @Override
    public void maintenable() {
        System.out.println("Robot maintenable :))");
    }

    @Override
    public void addWorker() {
        System.out.println("Robot is adding to database :))");
    }
}
