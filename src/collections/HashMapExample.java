package collections;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap();
        map.put("firstName","Anne");
        map.put("middleName","Nicolle");
        map.put("lastName","Zimmermann");

      //  System.out.println(map);
        System.out.println(map.size());

        //how fetch
//        String first = map.get("firstName");
//        System.out.println(first);
//        map.put("firstName","Paula");
//        System.out.println(map.get("firstName"));
//        System.out.println(first);
        // System.out.println(map.get("firstName"));
        Set<String> keys = map.keySet(); // never return duplicate keys

        for(String key : keys){
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }


        Map<String, List<String>> map1 = new HashMap<String,List<String>>();

        List<String> listOfEmails = new ArrayList<String>();
        listOfEmails.add("batata@hotmail.com");
        listOfEmails.add("banana@hotmail.com");
        listOfEmails.add("nanana@hotmail.com");

        map1.put("email", listOfEmails);


        System.out.println(map1.get("email"));






    }
}
