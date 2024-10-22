package Task_3;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void carDetails() {
        System.out.println("The car is manufactured by: " +brand);
        System.out.println("The brand is: " +model);
        System.out.println("It was manufactured in the year: " +year);
    }
}
