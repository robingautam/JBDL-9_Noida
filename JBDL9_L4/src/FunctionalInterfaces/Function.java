package FunctionalInterfaces;

@FunctionalInterface
public interface Function<K,V> {

    V apply(K a);
}
