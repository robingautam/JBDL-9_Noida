package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.add(2);
        deque.add(3);

        deque.addFirst(12);
        deque.add(34);
        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
    }
}
