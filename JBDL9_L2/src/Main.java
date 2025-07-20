public class Main {
    public static void main(String[] args) {
        System.out.println("Starting of the program");

        int a = 10;


        try {
            int b = a/0;  // its an arithmetic exception
        //    throw new Exception(); // custom throw
        }catch (ArithmeticException e){
            System.out.println("There's some exception");
         //   System.exit(0);
            System.out.println("I have catch the object");
        }

        System.out.println("End of the program");
    }
}