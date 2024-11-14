package AccessModifier2;

import AccessModifier1.Bike1;
import AccessModifier1.Vehicle;

class Car extends Vehicle {

    void run() {
        price();
    }
}

public class Access {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        // default
        // v.brand();

        // public
        v.model();

        // protected
        // v.price();

        Car c = new Car();
        c.run();

        // private
        // v.vehicleHistory();


        Bike1 sc = new Bike1();
        sc.show();
    }
}
