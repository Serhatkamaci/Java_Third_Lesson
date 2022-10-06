public class ProductManager {
    public void add(Product product)
    {
        if(ProductValidator.isValidator(product))
        {
            System.out.println("The product added to database :)");
        }
        else
        {
            System.out.println("The product could not be added :(");
        }
    }
}
