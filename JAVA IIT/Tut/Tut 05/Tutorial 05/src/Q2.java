import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        DisplayMenu displayMenu = new DisplayMenu();
        displayMenu.display();
    }

    public static class DisplayMenu {
        boolean exit = true;
        Scanner input = new Scanner(System.in);

        public void display() {
            while (exit) {
                System.out.println("**********");
                System.out.println("   MENU   ");
                System.out.println("**********");
                System.out.println("1.- Addition");
                System.out.println("2.- Subtraction");
                System.out.println("0.- Quit Please select an option: ");

                System.out.println("Select your option: ");
                int userInput = input.nextInt();

                switch (userInput) {
                    case 1:
                        Addition();
                        break;
                    case 2:
                        Subtraction();
                        break;
                    case 0:
                        exit = false;
                        break;
                    default:
                        System.out.println("Please enter a valid number!");
                }
            }
        }
    }

    private static void Addition() {
        double nb1=0, nb2=0;
        userInput();
        double sum = nb1 + nb2;
        System.out.println(nb1 + " + " + nb2 + " = " + sum);
    }

    private static void Subtraction() {
        double nb1 = 0, nb2 =0;
        userInput();
        double sub = nb1 - nb2;
        System.out.println(nb1 + " - " + nb2 + " = " + sub);
    }

    private static void userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        double nb1 = input.nextDouble();
        System.out.println("Enter 2nd number: ");
        double nb2 = input.nextDouble();
    }
}
