package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

    /*
    *
    * Hashset descending from SETS
    *
    * */

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("banana");
        set.add("laranja");
        set.add("limão");
        set.add("morango");
        set.add("uva");
        set.add("pera");

        System.out.println();

        //HashSet unordered list
        //Unique values, override duplicate values
        //cannot fetch indexes values
        //We can get values only with foreach

        //System.out.println(set);

//        for(String var : set){
//            System.out.println(var);
//        }

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()){
            String fruit = itr.next();
//            if(itr.next().equals("uva"))
//            System.out.println(itr.next());
            System.out.println(fruit);
        }

    }
}
