import accessmodifier.Person;

public class Main {
    public static void main(String[] args) {
       Building b1 = new Building(); // b1 is our object of a building
       b1.height = 1000;
       b1.area = 500;
       b1.floors = 20;
       b1.rooms = 100;

       Building b2 = new Building(); // b2 is our object of a building
        b2.height = 1000;
        b2.area = 500;
        b2.floors = 20;
        b2.rooms = 100;



       // System.out.println(b1.hashCode());
        // System.out.println(b2.hashCode());

        System.out.println(b1.equals(b2));


       /* Person person = new Person();
        person.id = 1; // since id is deafult, we can't use it here
        */


    }
}