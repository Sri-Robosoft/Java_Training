package Task_2;

class Products {
    int id;
    String name;
    double price;
    boolean inStock;

    Products(int id, String name, double price, boolean inStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }
}

public class Problem1 {

    // Total value of all products which are in stock
    static void valueInStock(Products[] productArray) {
        double totalValue = 0;
        for(Products prod: productArray) {
            if(prod.inStock) {
                totalValue += prod.price;
            }
        }
        System.out.println("Total Value of Stock is: " +totalValue);
    }

    // Most expensive product
    static void expensiveProduct(Products[] productArray) {
        Products expenseProd = productArray[0];
        for(Products prod: productArray) {
            if(expenseProd.price < prod.price)
                expenseProd = prod;
        }
        System.out.println("Most expensive product: " +expenseProd.name+ ", Price: $" +expenseProd.price);
        // System.out.println("Most expensive product: " +expenseProd.name+ ", Price: $" +String.format("%.2f", expenseProd.price));
    }

    // Products are priced above $400
    static void countOfProduct(Products[] productArray) {
        int count = 0;
        for(Products prod: productArray) {
            if(prod.price > 400) {
                count++;
            }
        }
        System.out.println("Number of products above $400: " +count);
    }

    public static void main(String[] args) {
        Products p1 = new Products(1, "Laptop", 999.99, true);
        Products p2 = new Products(2, "Smartphone", 499.99, false);
        Products p3 = new Products(3, "Tablet", 299.99, true);

        Products[] productArray = {p1, p2, p3};

        for(Products prod: productArray) {
            System.out.println(prod.id);
            System.out.println(prod.name);
            System.out.println(prod.price);
            System.out.println(prod.inStock);
        }

        // i
        valueInStock(productArray);
        // ii
        expensiveProduct(productArray);
        //iii
        countOfProduct(productArray);
    }
}
