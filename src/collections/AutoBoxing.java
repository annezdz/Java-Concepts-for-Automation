package collections;

public class AutoBoxing {

    public static void main(String[] args) {

        int var = 10;
        Integer obj = new Integer(var);  // Wrapping - Autoboxing

        System.out.println(obj);

        int i = obj; //unwrapping - AutoUnboxing
        System.out.println(i);
    }
}
