package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(3);

        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.size());

        // poll vs remove
        System.out.println(queue.poll());
        System.out.println(queue.size());
        // at this moment queue is empty
        System.out.println(queue.poll()); // if the queue is empty then poll will return null
        System.out.println(queue.remove()); // if the queue is empty then it will throw exception



    }
}
