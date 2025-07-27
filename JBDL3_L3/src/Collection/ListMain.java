package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> ilist = new ArrayList<>();
        ilist.add(1);
        list.add(23);
        list.add(25);
        list.add(1,34);
        list.addAll(ilist);
        list.remove(2);


        System.out.println(list);
        System.out.println(list.get(2));

    }
}
