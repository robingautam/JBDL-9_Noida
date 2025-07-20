import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main2 {

    public static void main(String[] args) {
        System.out.println("starting of the program");

        try {
            int a = 10/0; // ArithmeticException
            someMethodForDeclaration();
            // open file , object create
            try {
                // nested try catch block
            }
            catch (Exception e){

            }
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception");
        }
        catch (FileNotFoundException e){
            System.out.println("Null pointer exception");
        }
       /* catch (ArithmeticException e){
            System.out.println("Exception Occured");
        }*/
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("end of the program");
    }



    public static void someMethodForDeclaration() throws FileNotFoundException {
        File file = new File("some.txt");
        FileInputStream fis = new FileInputStream(file);

        System.out.println("some file code");
    }
}
