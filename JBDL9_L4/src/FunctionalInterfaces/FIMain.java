package FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIMain {

    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        }; // anonymous class

        System.out.println(predicate.test(3));


        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer a) {
                return a*a;
            }
        };

        System.out.println(function.apply(2));

        Supplier<Double> supplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };

        System.out.println(supplier.get());

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("num is "+ integer);
            }
        };

        consumer.accept(12);
    }
}
