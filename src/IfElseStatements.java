public class IfElseStatements {
    public static void main(String[] args) {

        double num = (int)(Math.random() * 20);
        System.out.println(num);

        if(num >= 10){
            System.out.println( num + " Number is greater than 10");
        }
        else if(num < 10 || num  > 5){
            System.out.println(num + " Number is between 11 and 14");
        }
        else{
            System.out.println(num + " Number is less than 10");
        }
    }
}
