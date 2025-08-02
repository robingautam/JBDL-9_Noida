package streams;

import FunctionalInterfaces.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> list =  Arrays.asList(1,2,4,5,3,2,4,5);
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<list.size();i++){
           int val = list.get(i);
           if (val%2==0){
               ans.add(val);
           }
        }

       // System.out.println(ans);

        //streams

     //   List<Integer> ansList = list.stream().filter(i-> i%2==0).collect(Collectors.toList());
       // System.out.println(ansList);

      List<Integer> sortedList =  list.stream().limit(2).sorted().collect(Collectors.toList());
            System.out.println(sortedList);

      List<Integer> distinct =  list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);


      List<Integer> squareList =  list.stream().map(a->a*a).collect(Collectors.toList());
        System.out.println(squareList);

      boolean anyBolean =   list.stream().allMatch(i->i%2==0);
        System.out.println(anyBolean);

        int redans = list.stream().reduce((i1,i2)->i1+i2).get();

        System.out.println(redans);


    }
}
