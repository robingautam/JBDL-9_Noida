import java.io.*;

public class FileOperation{
  
  public static void main(String[] args){

	 System.out.println("starting of the program");
        try {
            int a = 10/0; // ArithmeticException
        }
	
        catch (NullPointerException e){
            System.out.println("Null pointer exception");
        }
        catch (ArithmeticException e){
            System.out.println("Exception Occured");
        }
	catch(Exception e){
	    System.out.println("Inside the exception block");
        }

  }

}