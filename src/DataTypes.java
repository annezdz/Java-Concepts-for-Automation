public class DataTypes {
    public static void main(String[] args) {

        //Primitive Datatypes

        int i = 1234556789; //int -> integer
        float f = 1.234F;
        double d = 1.22222;
        long l = 12345678L;
        boolean b = false;
        char c = 'a';
        String s = "This is a String"; //Class in Java


        // Non-primitive Datatypes

        DataTypes dataTypes;

        String abc = new String();
        abc = "Hello";

        String acb1 = "Hello";


        // String + String --> Concatenated String
        String s1 = "Way ";
        String s2 = "2 ";
        String s3 = "Automation";

        String s4 = s1 + s2 + s3;
        System.out.println(s4);
        System.out.println(s1+s2+s3);


        //int + int --> int
        int num1 = 10;
        int num2 = 5;
        System.out.println(num1 + num2);
        System.out.println("before:" + num1 + " + " + num2 + " = "+ num1 + num2);
        System.out.println("before:" + num1 + " + " + num2 + " = "+ (num1 + num2));

        /*

        12 + 45 // Operands
        * Unary Operator - single operand --> ++ , -- , != (logical)
        * Binary Operator - two operand
        * Ternary Operator - three operands
        * */
        System.out.println(true);
        System.out.println(!true);

        System.out.println(30 == 39);
    }
}
