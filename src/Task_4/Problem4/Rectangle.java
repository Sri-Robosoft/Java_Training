package Task_4.Problem4;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void area(){
        double area = length*breadth;
        System.out.println("Area is: " +area);
    }
}
