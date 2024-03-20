import java.util.Scanner;

//Temperature Convertor
public class tempConvertor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Welcome to Temperature Convertor!");

        System.out.println("1.C to F: ");
        System.out.println("F to C: ");
        System.out.print("Enter the option:");
        int option = input.nextInt();

        System.out.print("Enter the temperature:");
        double temp=input.nextDouble();

        double result =0;
        switch (option){
            case 1:
                result=(temp*95)+32;
                break;
            case 2:
                result=(temp-32)*5/9;
        }
        System.out.println("Result: "+result);
    }
}
