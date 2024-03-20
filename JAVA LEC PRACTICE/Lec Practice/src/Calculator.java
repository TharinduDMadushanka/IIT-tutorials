import java.util.Scanner;

//CALCULATOR WITH SWITCH CASE
public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter nb 1: ");
        double nb1 = input.nextDouble();

        System.out.print("Enter nb 2:");
        double nb2 = input.nextDouble();

        System.out.print("Enter operator +,-,/,* :");
        char operator = input.next().charAt(0);

        double result=0;
        switch (operator){
            case '+':
                result =nb1+nb2;
                break;
            case '-':
                result=nb1-nb2;
                break;
            case '/':
                result=nb1/nb2;
            case '*':
                result=nb1*nb2;
            default:
                System.out.println("Invalid Option>");
        }
        System.out.println("Result: "+result);
    }
}
