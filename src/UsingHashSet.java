import java.util.ArrayList;
import java.util.HashSet;

public class UsingHashSet {
    public static void main(String[] args) {
        //Question 1
//        HashSet<String> listProducts = new HashSet<>();
//
//        listProducts.add("Product 1");
//        listProducts.add("Product 2");
//        listProducts.add("Product 3");
//
//        listProducts.add("Product 1");
//        listProducts.add("Product 2");
//        listProducts.add("Product 5");
//
//        System.out.println(listProducts);

        //Question 2
        ArrayList<String> listProduct = new ArrayList<>();
        listProduct.add("Product 1");
        listProduct.add("Product 2");
        listProduct.add("Product 3");

        listProduct.add("Product 1");
        listProduct.add("Product 2");
        listProduct.add("Product 5");

        HashSet<String> products = new HashSet<>(listProduct);
        System.out.println(products);

    }
}
