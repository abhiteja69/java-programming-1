//Q.5: Print the sum, difference and product of two complex numbers by creating a class named
// Complex with separate methods for each operation whose real and imaginary parts are
//     entered by user.





import java.util.Scanner;

class ComplexNumber
    {

    double real, img;


    ComplexNumber(double r, double i)
    {
        this.real = r;
        this.img = i;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
    {
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
    public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2)
    {
        ComplexNumber temp2 = new ComplexNumber(0, 0);

        temp2.real = c1.real - c2.real;
        temp2.img = c1.img - c2.img;
        return temp2;
    }
    public static ComplexNumber mult(ComplexNumber c1, ComplexNumber c2)
    {
        ComplexNumber temp3 = new ComplexNumber(0, 0);

        temp3.real = c1.real * c2.real - c1.img * c2.img;
        temp3.img = c1.real * c2.img + c1.img * c2.real;
        return temp3;
    }
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        ComplexNumber c1 = new ComplexNumber(4.5, 3.5);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);
        ComplexNumber temp1 = sum(c1, c2);
        ComplexNumber temp2 = sub(c1, c2);
        ComplexNumber temp3 = mult(c1,c2);
        System.out.println("Sum of complex numbers is: "+ temp1.real+" + "+ temp1.img +"i");
        System.out.println("Difference of complex numbers is: "+ temp2.real+" - "+ temp2.img +"i");
        System.out.println("Product of complex numbers is: "+ temp3.real+" - "+ temp3.img +"i");
    }
}