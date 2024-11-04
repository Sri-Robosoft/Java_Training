package Task_7.Problem2;

import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<>();

        prodList.add(new Product("Mobile", 35000L));
        prodList.add(new Product("Watch", 8000L));
        prodList.add(new Product("Mobile", 98000L));
        prodList.add(new Product("Earphone", 2000L));
        prodList.add(new Product("Charger", 500L));
        prodList.add(new Product("Watch", 3000L));

        for(Product p: prodList) {
            System.out.println("Name: "+p.getName()+ " Price: "+p.getPrice());
        }

        System.out.println("After Sorting");

        // Collections.sort(prodList, new Comparator<Product>() {
            // public int compare(Product p1, Product p2) {
            // return (int) (p1.getPrice() - p2.getPrice());
            // }
        // });

        ProductName p = new ProductName();
        Collections.sort(prodList, p);

        for(Product prod: prodList) {
            System.out.println("Name: "+prod.getName()+ " Price: "+prod.getPrice());
        }
    }
}
