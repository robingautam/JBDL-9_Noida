package Collection;

import java.util.*;

public class SetMain {


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(34);
        set.add(1);


    //    System.out.println(set);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(23);
        linkedHashSet.add(12);
        linkedHashSet.add(1);

  //      System.out.println(linkedHashSet);

        Set<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        treeSet.add(23);
        treeSet.add(1);
        treeSet.add(-2);

    //    System.out.println(treeSet);

      TreeSet trset = new TreeSet();
      trset.add(1);
      trset.add(2);
      trset.add("Robin");

        System.out.println(trset);


    }
}
