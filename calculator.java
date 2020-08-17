//Q.1: Design a Calculator class which contains four lambda methods:
//       a. add(a, b)
//       b. difference(a, b)
//       c. product(a, b)
//       d. safeDivision(a, b)
//       Also design the main methods which pass actual parameters to test the Calculator class.




import java.util.Scanner;

interface Arithmetic
{
    double operation(double a , double b);
}
public class calculator
{

    public static void main(String[] args)
    {
        double num1, num2;
        Scanner cal = new Scanner(System.in);
        System.out.print("Enter first number:");

        num1 = cal.nextDouble();
        System.out.print("Enter second number:");
        num2 = cal.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = cal.next().charAt(0);

        cal.close();
        double output;

        switch(operator)
        {
            case '+':
                Arithmetic add =(double a, double b)->(a+b);
                System.out.println("Addition = "+ add.operation(num1,num2));
                break;

            case '-':
                Arithmetic sub =(double a, double b)->(a-b);
                System.out.println("Substraction = "+ sub.operation(num1,num2));
                break;

            case '*':
                Arithmetic mult =(double a, double b)->(a*b);
                System.out.println("Multiplication = "+ mult.operation(num1,num2));
                break;

            case '/':
                Arithmetic div =(double a, double b)->{
                    if(b==0)
                        return 0;
                    return a/b;
                };
                System.out.println("Division = "+ div.operation(num1,num2));
                break;

            default:
                System.out.printf("You have entered wrong operator");

        }
    }

}