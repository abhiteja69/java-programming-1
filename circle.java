//Q.4: Create the following class as stated:

//      A class called circle is designed as shown in the following class diagram. It contains:
//      • Two private instance variables: radius (of the type double) and color (of the type
//     String), with default value of 1.0 and "red", respectively.
//     • Two overloaded constructors - a default constructor with no argument, and a
//    constructor which takes a double argument for radius.
//     • Two public methods: getRadius() and getArea(), which return the radius and area of
//    this instance, respectively.


import java.util.*;
public class circle
{
    private double radius ;
    private String color ;
    double area;
    public circle()
    {
        radius = 1.0;
        color = "red";
    }
    circle(double rad){
        this.radius=rad;
        color ="red";
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return radius*radius*Math.PI;
    }
}
class circleMain{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double radii;
        System.out.println("Enter the radius :");
        radii = scan.nextDouble();
        circle c1 = new circle();
        circle c2 = new circle(radii);
        System.out.println("Area of Circle with default radius is :"+c1.getArea());
        System.out.println("Area of Circle with user given radius is :"+c2.getArea());
    }
}
