//Q.7: Write a program, creating a Triangle class which contains a method that takes three
//        parameters of the three sides of the triangle, ‘a’, ‘b’, ‘c’, and returns you with the area of the
//        triangle and print it.

import java.util.Scanner;

public class triangle
{
    public static void main(String[] args)
    {

        Scanner tri = new Scanner(System.in);

        System.out.println("Enter the First side :");
        double a =tri.nextDouble();
        System.out.println("Enter the Second side :");
        double b =tri.nextDouble();
        System.out.println("Enter the Third side :");
        double c =tri.nextDouble();

        double area = AreaOfTriangle(a,b,c);

        if(area ==0)
        {
            System.out.println("Area of Triangle doest not exist!");
        }
        else
        {
            System.out.println("Area of Triangle :"+area);
        }
    }

    static  double AreaOfTriangle(double a, double b, double c)
    {
        double area=0;
        if((a+b)>c && (a+c)>b && (b+c)>a)
        {
            double s=(a+b+c)/2;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return area;
        }
        else
            return area;
    }
}
