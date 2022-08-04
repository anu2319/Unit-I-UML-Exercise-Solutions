public class Triangle
{
    private int aSide;
    private int bSide;
    private int cSide;
    private double height;

    public void createTriangle(int a, int b, int c, double h)
    {
        aSide = a;
        bSide = b;
        cSide = c;
        height = h;

        System.out.println("Triangle is created");
    }

    public double calculateArea()
    {
        double area;
        area = 0.5 * bSide * height;
        return area;
    }

    public double calculatePerimeter()
    {
        double perimeter;
        perimeter = aSide + bSide + cSide;
        return perimeter;
    }

    public static void main(String[] args)
    {
        Triangle triangle = new Triangle();
        triangle.createTriangle(3,4,5,  3.2);
        System.out.println("Area Of Triangle is : " + triangle.calculateArea() + "sq.cm");
        System.out.println("Perimeter Of Triangle is : " + triangle.calculatePerimeter() + "cm");

    }
}
