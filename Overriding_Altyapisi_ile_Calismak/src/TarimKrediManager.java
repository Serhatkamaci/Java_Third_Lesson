public class TarimKrediManager extends BaseKrediManager{
    public double hesapla(double price)
    {
        System.out.println("TK price --> "+price*1.05);
        return price*1.05;
    }
}
