import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] array=new int[6];

        Scanner input=new Scanner(System.in);

        for (int i=0;i<array.length;i++){
            System.out.print("Enter marks:");
            array[i]=input.nextInt();
        }

        System.out.println("Marks entered:");
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        int failnb=0;
        int sum=0;

        for (int i=0;i<array.length;i++){
            if (array[i]<40){
                failnb++;
            }
            sum+=array[i];
        }
        double average =(double) sum/array.length;

        System.out.println("Fail students: "+failnb);
        System.out.println("Average: "+average);
    }
}