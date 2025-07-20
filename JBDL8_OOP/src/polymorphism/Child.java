package polymorphism;

public class Child extends Parent{

    // Runtime Polymorphism
    @Override
    public void m(){
        System.out.println("Inside the child class method");
    }

    // public abstract void m2(); //its a abstract method
}
