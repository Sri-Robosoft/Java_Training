package Task_2;

/* Online Java Compiler and Editor */

public class Problem0 {

    static void valueInStock(double[] price, boolean[] inStock)
    {
        double totalValue=0;
        for(int i=0; i<price.length; i++) {
            if(inStock[i]) {
                totalValue += price[i];
            }
        }
        System.out.println("Total Value of Stock is: " +totalValue);
    }

    static void expensiveProduct(String[] name, double[] price)
    {
        int idx = 0;
        double productPrice = price[0];
        for(int i=0; i<price.length; i++) {
            if(productPrice < price[i]) {
                idx = i;
                productPrice = price[i];
            }
        }
        System.out.println("Most expensive product: " +name[idx]+ ", Price: $" +productPrice);
    }

    static void countOfProduct(double[] price) {
        int count = 0;
        for(int i=0; i<price.length; i++) {
            if(price[i] > 400)
                count++;
        }
        System.out.println("Number of products above $400: " +count);
    }


    public static void main(String[] args) {
        int[] id={1,2,3};
        String[] name={"Laptop", "Smartphone", "Tablet"};
        double[] price={999.90, 499.99, 299.99};
        boolean[] inStock={true, false, true};

        //i
        valueInStock(price, inStock);

        //ii
        expensiveProduct(name, price);

        //iii
        countOfProduct(price);
    }
}
