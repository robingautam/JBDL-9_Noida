package polymorphism;

public class PolyMain {

    public static void main(String[] args) {
      //  Parent obj = new Child();
        //obj.m();

        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        Child obj3 = new Child();
       // Child obj4 = new Parent(); // child class reference cannot hold parent class object


    }
}
