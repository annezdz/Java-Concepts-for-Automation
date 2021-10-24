package polymorphism;

public class OverloadingExample {

    /*
    * Q1 - Can we achieve overloading by keeping the method signature same and changing the return type ?
    * Ans: NO
    *
    * */

//    public void add(int a , int b){
//
//    }
//
//    public void add(byte a, byte b){
//
//    }
//
//    public void add(int a, double var){
//
//    }
//
//    public void add(double var, int a){
//
//    }
//
//
//
//    public void add(int a , int b, int c){
//
//    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
       // obj.add();//obj.doLogin();

        //obj.add(1,2);
//        byte a = 10;
//        byte b = 10;
//        obj.add(a,b);
        obj.addition(10,20,30,40);
    }

    public void addition(int... a){
        int [] var = a;
    }

    public void add(int a , double b){

    }
    public void add(double a , int b){

    }

//    public void add(double a , double b){
//
//    }

    public void doLogin(String username, String password){

    }

    public void doLogin(int mobileNumber, String password){

    }
}
