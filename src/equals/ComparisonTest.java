package equals;

public class ComparisonTest {

    public static void main(String[] args) {

        /*
        * == or equals()
        *
        * == comparison = object reference same, addresses
        * .equals() = content the same or not
        *
        * */

        String name1 = "Way2Automation";
        String name2 = "Way2Automation";

        String name_1 = new String("Anne");
        String name_2 = new String("Anne");


        int x = 100;
        int y = 100;

//        System.out.println(name1 == name2); //true
//        System.out.println(name1.equals(name2)); //true
//
//        System.out.println(x == y);

        System.out.println(name_1==name_2);
        System.out.println(name_1.equals(name_2));

        SingleTonTest s = SingleTonTest.getInstance();
        SingleTonTest s1 = SingleTonTest.getInstance();

        System.out.println(s == s1);
        System.out.println(s);
        System.out.println(s1);



    }
}
