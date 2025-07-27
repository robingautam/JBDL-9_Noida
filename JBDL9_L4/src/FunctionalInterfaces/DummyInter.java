package FunctionalInterfaces;

@FunctionalInterface
public interface DummyInter {

    void m();

    default  void some(){

    }
    static  void m2(){

    }
}
