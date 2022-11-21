import java.util.Scanner;

public class Main
{
    public static double sum(double i, double j)
    {
        double sum = i + j;
        return sum;
    }

    public static double subtract(double i, double j)
    {
        double subtract = i - j;
        return subtract;
    }

    public static double multiply(double i, double j)
    {
        double multiply = i * j;
        return multiply;
    }

    public static double div(double i, double j)
    {
        double div = i/j;
        return div;
    }
    public static void main(String[] args)
    {
        int flag = 0;
        while(flag==0) {
            System.out.println("Ready to Calculate");
            System.out.println("1.Add\n" +
                    "2.Subtract\n" +
                    "3.Multiply\n" +
                    "4.Divide\n" +
                    "5.Exit\n");

            Scanner input=new Scanner(System.in);
            System.out.println("Enter first no");
            double a = input.nextDouble();
            System.out.println("Enter second no");
            double b = input.nextDouble();
            System.out.println("Select which calculation to do by pressing 1,2,3,4 or 5");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    double add = sum(a, b);
                    System.out.println(add);
                    break;
                case 2:
                    double sub = subtract(a,b);
                    System.out.println(sub);
                    break;
                case 3:
                    double mul = multiply(a,b);
                    System.out.println(mul);
                    break;
                case 4:
                    double div = div(a,b);
                    System.out.println(div);
                    break;
                case 5:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("Invalid Options");
            }
            System.out.println("Do you want to calculate again if yes press 1 else 0");
            int option2 = input.nextInt();
            if(option2 == 1){
                flag = 0;
            }
            else{
                flag = 1;
                System.out.println("Compute");
            }
        }
    }
}