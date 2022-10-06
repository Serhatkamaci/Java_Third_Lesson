public class Main {
    public static void main(String[] args)
    {
        //TarimKrediManager tarimKrediManager=new TarimKrediManager();
        //System.out.println("Price --> "+tarimKrediManager.hesapla(1700));
        // Ben ogretmenkredisi olarak hesaplamis oldum fakat amac bunu hepsi icin yapabilmek. Fakat tam bu noktada faiz degerleri farkli olsun.

        BaseKrediManager[] baseKrediManager={new OgretmenKrediManager(),new TarimKrediManager(),new BaseKrediManager()};
        // Yukaridaki kodun calisabilmesi icin void yapmayip icinde yazdirma islemi yaptim hesapla fonksiyonlarinin.
        for(BaseKrediManager bkm: baseKrediManager)
        {
            bkm.hesapla(1700);
        }
        // Yukaridaki dongu islemi ile tum kredimanager'lerin fiyatlarini hesaplamis oldum.
        // Artik yeni bir kredimanager olusturursam diziyi istedigim gibi degistirip hesaplama islemlerine devam edebilirim.
        // Fakat yeni bir kredimanager'i extends edebilmeliyim.

        // Hesaplama fonksiyonlarindan birini "public final" deyimi ile baglasaydim bu metodu "override" edemeyecektim.
    }
}
