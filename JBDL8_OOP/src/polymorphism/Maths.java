package polymorphism;

public class Maths {

    // Method overloading // compile time polymorphism
    public int sum(int n1, int n2){
        return n1+n2;
    }

    public int sum(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
