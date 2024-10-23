package Task_4.Problem4;

public class Circle extends Shape{
    private double radius;

    Circle(double r) {
        radius = r;
    }

    public void area(){
        double area = Math.PI * (radius*radius);
        System.out.println("Area is: " +area);
    }
}
