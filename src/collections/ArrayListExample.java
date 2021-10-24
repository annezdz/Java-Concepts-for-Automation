package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        System.out.println(list.size());

        // How insert and measure the size of the list
        list.add(36);
        list.add("Anne");
        list.add(3.5);
        list.add(true);
        list.add('c');
        list.add(null);
        list.add("Anne");
        System.out.println(list.get(0));

        //int var = list.get(0); // not possible

        int num1 = (Integer) list.get(0);

        System.out.println(num1 + 10);

        Object var = list.get(0);

        // System.out.println(20 + var); not possible



//        System.out.println(list);
//        System.out.println(list.size());

        //How to fetch the values from a list

//        System.out.println(list.get(0));
//        System.out.println(list.get(3));
        //System.out.println(list.get(7)); IndexOutOfBoundsException

        //Remove any value from a  List

//        list.remove(6);
//        System.out.println(list);
//        System.out.println(list.size());
//
//        for(int i = 0; i < list.size(); i++){
//            System.out.println("Printing list with for:[" + i + "] " + list.get(i));
//        }
//
//        System.out.println("-------------------------------------------");
//
//        for(Object var : list){
//            System.out.println("Printing list with foreach: " + var);
//        }
//
//        System.out.println("-------------------------------------------");
//
//        Iterator itr = list.iterator();
//
//        while(itr.hasNext()){
//
//            System.out.println(itr.next());
//        }

    }
}
