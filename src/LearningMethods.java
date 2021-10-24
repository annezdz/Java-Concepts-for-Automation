import java.sql.SQLOutput;
import java.util.Scanner;

public class LearningMethods {


    int i; //declation, initialize
    int j;

    //display

    // Return type --> dataType of the value returned by method

    //Keyword -> return
    public String display(int k, String a, char c, float f, boolean b){ //declare --> define
        /*
        * all definitions goes here!!
        *
        * */
        String x = "Hello";
        return x;
    }

    public void show(){
        int a;
        int b;
        String c;
    }

    public static void main(String[] args) {
        LearningMethods learningMethods = new LearningMethods();
        learningMethods.show();

//        Home home = new Home(); // -> Object i = 23
//        home.i++;
//        Home home1 = new Home();
//        home1.i++; // -> Object i = 24
//        System.out.println(home1.i);
//        Home home2 = new Home(); // -> Object i = 23
//        System.out.println(home2.i);

        /*
        *
        * Parameters and Arguments
        * Arguments são passados para os parametros
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Numero 1 = " );
        int a = scanner.nextInt();

        System.out.print("Numero 2 = " );
        int b = scanner.nextInt();


        Calculator calculator = new Calculator();

        System.out.println("Adição = " + calculator.sum(a,b));
        System.out.println("Multiplicacao = " + calculator.mult(a,b));
        System.out.println("Divisão = " + calculator.div(a,b));
        System.out.println("Subtração = " + calculator.sub(a,b));



    }
}
