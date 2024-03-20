import java.util.Scanner;

//***DATA TYPES***
/*
* Java programming, data types define the type of data that avariable can hold
*/
//CALCULATOR
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter nb 1: ");
        double nb1 = input.nextDouble();

        System.out.print("Enter nb 2:");
        double nb2 = input.nextDouble();

        System.out.print("Enter operator +,-,/,* :");
        char operator = input.next().charAt(0);

        if (operator== '+'){
            double sum =nb1+nb2;
            System.out.println(sum);
        } else if (operator=='-') {
            double sub =nb1-nb2;
            System.out.println(sub);
        } else if (operator=='/') {
            double div = nb1/nb2;
            System.out.println(div);
        } else if (operator=='*') {
            double mul= nb1*nb2;
            System.out.println(mul);
        }else {
            System.out.println("Invalid Input.");
        }

    }
}