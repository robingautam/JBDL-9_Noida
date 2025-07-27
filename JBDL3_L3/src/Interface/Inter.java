package Interface;

public interface Inter {

    void m2();

    default void m3(){
        System.out.println("This is m3 body");
    }
}
