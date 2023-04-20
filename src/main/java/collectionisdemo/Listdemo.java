package collectionisdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Listdemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        list.add(34);
        list.add(55);

        System.out.println(list);

        list.remove(2);

        System.out.println(list);

       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
       }

        Set<Integer> set = new HashSet<>();
       set.add(23);
       set.add(45);
       set.add(56);
       set.add(67);
       set.add(23);
       set.add(45);

        System.out.println(set);

        List<Integer> list2 = new ArrayList<>(set);
        System.out.println(list2);



    }
}
