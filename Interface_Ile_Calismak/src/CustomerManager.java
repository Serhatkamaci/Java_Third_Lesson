public class CustomerManager {

    //IDataDal idll;

    private  IDataDal idll;
/*
    public void add()
    {
        idll.Add();
    }
    */

    // Baska bir yontem ile de yapabiliirz.

/*
    public CustomerManager(IDataDal dlll)
    {
        this.idll=dlll;
        idll.Add();
    }

*/


    public CustomerManager(IDataDal idllll)
    {
        this.idll=idllll;
    }
    public void add()
    {
        idll.Add();
    }

}
