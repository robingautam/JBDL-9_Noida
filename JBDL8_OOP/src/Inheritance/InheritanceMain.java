package Inheritance;

public class InheritanceMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childField = "Child feild";
        child.parentField = 23;

        System.out.println(child);
    }
}
