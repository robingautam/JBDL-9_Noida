package Collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Fail fast iterator
        list.add(23); list.add(12);
        Iterator<Integer> itr = list.iterator();
      /*  while (itr.hasNext()){ // Fail fast iterator
            System.out.println(itr.next());
            list.add(34);
        }*/

        List<Integer> copyArrayList = new CopyOnWriteArrayList();
        copyArrayList.add(122);
        copyArrayList.add(100);



      Iterator<Integer> coptItr =   copyArrayList.iterator();

      while(coptItr.hasNext()){
          System.out.println(coptItr.next());
          copyArrayList.add(1);
      }
    }
}
