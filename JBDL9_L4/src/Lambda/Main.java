package Lambda;

public class Main {

    public static void main(String[] args) {
      //  Vehicle vehicle = new BMW();
        //vehicle.engine();


      /*  Vehicle vehicle = new Vehicle() {
            @Override
            public void engine() {
                System.out.println("BMW Engine with anonymous class");
            }
        };

        vehicle.engine();*/

        // you can use the lambda expression

        Vehicle vehicle = ()-> System.out.println("BMW with Lambda");

        vehicle.engine();

        Addition addition = ( a,  b) -> System.out.println(a+b);

    }
}
