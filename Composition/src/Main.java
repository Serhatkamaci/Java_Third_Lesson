import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int id;
        double unitPrice;
        String name;

        // Static bir class ismi ile metodlara yani static metodlara ulasmamizi saglar.
        // Ben newledigim zaman static olarak ayri bir constructor mesaji yazmadiysam normal constructor yapisi ile yazdigim mesaj bu static ile calistiracagim metotta karsima cikmayacak.

        // Asagida "ProductValidator" nesnesini olusturmadan isim yapisi ile bu static metoda ulasacagim.

        // Engin hocanin videosuna sadece kullanici girisli bir yontem ekledim.

        /*
        Scanner input= new Scanner(System.in);

        Product product=new Product();
        System.out.print("Product name --> ");
        name=input.nextLine(); // Eger next ile baglama islemi yapsaydim, gordugu ilk boslukta bu cumleyi sonlandiracakti. Bu yuzden "next" anahtar kelimesini kullandim.
        product.name=name;
        System.out.print("Id --> ");
        id=input.nextInt();
        product.id=id;
        System.out.print("UnitPrice --> ");
        unitPrice=input.nextDouble();
        product.unitPrice=unitPrice;

        ProductManager productManager=new ProductManager();
        productManager.add(product);
        */
        // Ben ilk basta bir class'i "static" altyapisi ile olusturamam.
        // Fakat bu islemi yapmak icin "InnerClass" mimarisi altinda olsuturabilirim.
        // Static olarak tanimladigin bir arac program  sonlanan kadar bellekte durur.

        DatabaseHelper.Crud.create();
        DatabaseHelper.Crud.read();
        DatabaseHelper.Crud.update();
        DatabaseHelper.Crud.delete();


    }
}
