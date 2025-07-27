package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(23);
        list.add(34);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
