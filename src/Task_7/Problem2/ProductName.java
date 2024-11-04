package Task_7.Problem2;

import java.util.Comparator;

public class ProductName implements Comparator<Product> {
    public int compare(Product p1, Product p2) {
        if(p1.getName().equalsIgnoreCase(p2.getName())) {
            return (int) (p2.getPrice() - p1.getPrice());
        } else {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
