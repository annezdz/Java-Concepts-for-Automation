package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

    public static void main(String[] args) {

        //Typecasting

        List<Integer> list = new ArrayList<Integer>();

        list.add(10);
        list.add(null); // null is a value

        int i = list.get(0);
        System.out.println(i + 100);

    }
}
