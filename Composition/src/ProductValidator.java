public class ProductValidator {
    static
    {
        System.out.print("Static created.");
    }
    // Birden fazla "static" operasyon tanimlayabilirsin fakat iyi bir kullanim degildir.
    public ProductValidator(){
        System.out.print("Configurator created.");
    }
    public static boolean isValidator(Product product)
    {
        if(!product.name.isEmpty() && product.unitPrice>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // INNER CLASS


}
