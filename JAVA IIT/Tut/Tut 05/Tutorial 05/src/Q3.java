public class Q3 {
    public static void main(String[] args) {
        Number printnumber=new Number();
        Number.printNb();
    }
    public static class Number{
        public static void printNb(){
            int i=1;
            while (i<101){
                System.out.println(i);
                i++;
            }
        }
    }
}
