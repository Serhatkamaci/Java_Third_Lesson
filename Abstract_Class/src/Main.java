import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int data;

        // Bir sinif sadece bir sinifi miras alabilir.
        // Engin hocamizin "abstract yapisi ile calismak" adli videosundaki kodlar uzerinde azcik oynama yaptim.
        // Scanner ile kullanicidan "data" bilgisini alicam.

        //GameCalculator[] gameCalculator= {new ChildGameCalculator(),new WomanGameCalculator(),new MaleGameCalculator()};

        // Final anahtar kelimesi ile hicbir class bu metodu inherit edemeyecek.
        // Abstract deyimi ile de her class bu metodu yazmak zorundadir ve default'i olmayacaktir.

        // Ben GameCalculator'u abstract ettigim icin "GameCalculator gameCalculator=new GameCalculator;" seklinde yazmam cok hos bir goruntuye sahip olmayacak.
        // Bu yuzden GameCalculator dizisi ile ilerlersem cok daha iyi olacak.

        Scanner input = new Scanner(System.in); // Kullanicidan "data" bilgisini alacagim icin bir "input" yapisi olusturdum.

        GameCalculator[] gameCalculators={new MaleGameCalculator(),new WomanGameCalculator(),new ChildGameCalculator()};

        for(GameCalculator gC: gameCalculators)
        {
            System.out.print("Data --> "); // Imlec bir alt satira gecmesin diye "print" yazdim.
            data=input.nextInt(); // Kullanicidan aldigim veriyi "nextInt" ile bagladim.
            gC.calculate(data);
            gC.GameOver();
        }





    }
}
