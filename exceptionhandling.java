//Q.8: Write a program, creating a class containing the generic method which accepts only
//        numbers, generating a custom exception when passed with the String value.
//        The functionality of the generic method is to print the 2/3 of the passed value.

import java.util.Scanner;

class exceptionHandeling
{
    public static void task()
    {
        double a = 0;
        Scanner excp = new Scanner(System.in);
        System.out.println("Enter the value of a : ");

        try
        {
            a = excp.nextDouble();
            double value = (2.0/3.0)*(a);
            System.out.println(value);
        }
        catch (Exception e)
        {
            System.out.println("Wrong input - Please enter a number");
        }
    }

    public static void main(String[] args)
    {
        task();
    }

}