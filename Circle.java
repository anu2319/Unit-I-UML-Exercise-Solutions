import java.util.Scanner;

public class Circle
{
    static final double PI = 3.14;
    private double radius;


    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double calculateArea()
    {
        return PI*radius*radius;
    }

    public static void main(String[] args)
    {
        Circle circle = new Circle();
        circle.setRadius(20);
        System.out.println("Area of circle is : " + circle.calculateArea());
    }
}
