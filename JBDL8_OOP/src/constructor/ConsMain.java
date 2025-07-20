package constructor;

public class ConsMain {

    public static void main(String[] args) {
        Box box = new Box(); // default constructor not found, so not able to create any constructor
     //   Box box = new Box(12,10);
        System.out.println(box.height);
    }
}
