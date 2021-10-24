package Loops;

public class WhileLoop {

    /*
    * loops are not statements --> they are not terminated but exists
    * entry criteria --> loop condition must be true
    * exist criteria  --> if condition is false
    * */

    public static void main(String[] args) {

        int i = 12;

        do{
            System.out.println("Do While " + i);
            i++;
        }
        while(i <= 10);

        while(i <= 10){
            System.out.println("While" + i);
            i++;

        }

        System.out.println("After loop");
    }
}
