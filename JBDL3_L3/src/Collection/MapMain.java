package Collection;

import javax.swing.*;
import java.util.*;

public class MapMain {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "Robin");
        map.put("2", "Aakash");
        map.putIfAbsent("1", "Preeti");
        // if you want to fetch the data from map, then uou need to pass the key

        System.out.println(map.get("1"));
       // System.out.println(map.remove("2"));

        System.out.println(map.containsKey("1"));

        // How to print a map

        System.out.println(map);

        // entrySet to iterate over the map

/*        Set<Map.Entry<String, String>> entry = map.entrySet();

        Iterator<Map.Entry<String,String>> itr = entry.iterator();

        while (itr.hasNext()){
           Map.Entry<String,String>  next = itr.next();
            System.out.println("Key: "+next.getKey());
            System.out.println("value: "+next.getValue());
        }

        */

      /*  for (Map.Entry<String, String> entry: map.entrySet()){ // for each loop
            System.out.println("key: "+ entry.getKey()+": Value : "+entry.getValue());
        }*/


        // You can also use the keyset

         for (String key: map.keySet()){
             System.out.println("Key: "+key+": value: "+map.get(key));
         }


         //  yoi have given an array, calculate the frequency of a each element -> [3,1,2,1,3,2,4,21,2,3] , op -> 3,3- 1,2- 2,3- 4,1 - 21,1

        Map<Integer,Integer> qmap = new HashMap<>();
        int arr[] = {3,1,2,1,3,2,4,21,2,3};

         for (int val: arr){
            /* if (qmap.containsKey(val)){
                 int count = qmap.get(val);
                 qmap.put(val,count+1);
             }else {
                 qmap.put(val,1);
             }*/

             qmap.put(val,qmap.getOrDefault(val,0)+1);
         }

        System.out.println(qmap);


        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        treeMap.put(1,1);
        treeMap.put(3,3);
        treeMap.put(2,2);

        System.out.println(treeMap);

    }
}
