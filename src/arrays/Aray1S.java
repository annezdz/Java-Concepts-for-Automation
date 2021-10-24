package arrays;

public class Aray1S {

    /*
    *  java arrays --> objects
    * Final Keyword -> variable : constant
    * method -> cannot override
    * class -> cannot inheritance
    *
    * */

    public static void main(String[] args) {

        int[] array = new int[10];
        String[] myArray = new String[13];
        System.out.println(myArray.length);

        System.out.println(myArray);
        array[0] = 10;
        array[1] = 20;
        array[4] = 30;
        System.out.println(array[0]);

        for(int index = 0; index < array.length; index++){
            array[index] = (int)(Math.random() *1000);
            System.out.println(array[index]);
        }

        /*
        * Foreach Loop
        * Cannot print it in reverse
        * */

        for(int var : array){
            System.out.println(var);
        }

        System.out.println("Printing in reverse");

        for(int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }

        //hardcode

        int[] array1 = {0,1,2,3};
    }
}
