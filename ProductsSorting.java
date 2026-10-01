import java.util.*;
class Product {
    int productId;
    String productName;
    int price;

    Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    @Override
    public String toString() {
        return  productName + " " + price;
    }
}
class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.price != p2.price) {
            return p2.price - p1.price;  // Price descending
        }
        else {
            return p1.productName.compareTo(p2.productName); // Name ascending
        }
    }
}
public class ProductsSorting {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 60000));
        products.add(new Product(2, "Mobile", 60000));
        products.add(new Product(3, "Tablet", 30000));
        products.add(new Product(4, "Mouse", 1000));
        products.sort(new ProductComparator());
        for (Product p : products) {
            System.out.println(p);
        }
    }
}