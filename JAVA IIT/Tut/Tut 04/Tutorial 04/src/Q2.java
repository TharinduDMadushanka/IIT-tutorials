public class Q2 {
    public static void main(String[] args) {

        String[] array = {"Alex", "Max", "Charlie", "Bob", "Ada", "Jim"};

        int index1=2;
        int index2=4;

        if (index1>=0 && index1< array.length && index2 >= 0 && index2 < array.length){
            String temp=array[index1];
            array[index1]=array[index2];
            array[index2]=temp;

            for (int i=0; i< array.length;i++){
                System.out.print(array[i]);
                if (i!= args.length-1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }else {
            System.out.println("Invalid.");
        }
    }
}
