//Q.2: Create two classes:
//        BaseClass
//        The Rectangle class should have two data fields-width and height of int types. The class
//should have display() method, to print the width and height of the rectangle separated by space.
//        DerivedClass
//        The RectangleArea class is derived from Rectangle class, i.e., it is the sub-class of
//Rectangle class.The class should have read_input() method, to read the values of width
//        and height of the rectangle. The class should also overload the display() method to print
//        the area (width*height) of the rectangle.
//        Input Format
//        The first and only line of input contains two space separated integers denoting the
//        width and height of the rectangle.

//        Constraints
//        1 <= width, height <= 10^3
//        Output Format
//        The output should consist of:
//        Print the width and height of the rectangle.
//        In the second line, print the area of the rectangle.


import java.util.Scanner;

public class rectangle
{
    int width,height;
    void display()
    {
        System.out.println("Width of rectangle is :"+width+",  Height of rectangle is :"+height);
    }
}

class RectangleArea extends rectangle
{

    public  void read_Input(int a,int b)
    {
        this.width=a;
        this.height=b;
    }

    public void display()
    {
        super.display();;
        System.out.println("area of rectangle is : "+ this.width*this.height);
    }

    public static void main(String[] args)
    {
        Scanner rect = new Scanner(System.in);
        RectangleArea rect1 = new RectangleArea();
        int a = rect.nextInt();
        int b = rect.nextInt();
        rect1.read_Input(a,b);
        rect1.display();
        rect.close();

    }
}


